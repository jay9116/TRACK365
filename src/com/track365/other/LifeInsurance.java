package com.track365.other;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.track365.hibernate.InvestmentLifeInsurance;
import com.track365.hibernate.InvestmentMutualFund;

public class LifeInsurance {

	SessionFactory sessionFactory = null;
	Session session = null;
	SessionInformation si = new SessionInformation();
	int uid;
	
	public void insertInsurance(String cname,String plancode,Date buydate,Date enddate,String payperiod,Double Premium,String des){
		uid=si.GetSessionid();
		try{
			sessionFactory = new Configuration().configure()
					.buildSessionFactory();
			session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			
			InvestmentLifeInsurance ili=new InvestmentLifeInsurance();
			
			ili.setUserId(uid);
			ili.setCompanyName(cname);
			ili.setPlanCode(plancode);
			ili.setBuyDate(buydate);
			ili.setEndDate(enddate);
			ili.setPayPeriod(payperiod);
			ili.setPremium(Premium);
			ili.setDescription(des);
			
			session.save(ili);
			
			tr.commit();
		}catch (Exception e) {
			System.out.println("Exception : "+e);
		}finally{
			session.flush();
			session.close();
		}
		
	}
	
	public ArrayList<InvestmentLifeInsurance> getLIRecord() {
		
		 uid = si.GetSessionid();
		ArrayList<InvestmentLifeInsurance> lifeinsurance = new ArrayList<InvestmentLifeInsurance>();
		try {

			sessionFactory = new Configuration().configure()
					.buildSessionFactory();
			session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();

			String SQL_QUERY = "select ili.Id,ili.UserId,ili.CompanyName,ili.PlanCode,ili.BuyDate,ili.EndDate,ili.PayPeriod,ili.Premium,ili.Description from InvestmentLifeInsurance ili where ili.UserId='"
					+ uid + "' order by ili.id DESC ";

			Query query=session.createQuery(SQL_QUERY);
			
			//sharemarket = (List<InvestmentShareMarket>) session.createQuery(SQL_QUERY).list();
			
			for(Iterator it=query.iterate();it.hasNext();) {
				
				Object[] row = (Object[]) it.next();
				lifeinsurance.add(new InvestmentLifeInsurance(Integer.parseInt(row[0].toString()),Integer.parseInt(row[1].toString()),row[2].toString(),row[3].toString(),(Date)row[4],(Date)row[5],row[6].toString(),(Double)row[7],row[8].toString()));
				System.out.println("asd");
			}
			tr.commit();
			return lifeinsurance;

		} catch (Exception e) {

			System.out.println("Exception:" + e);
			return null;

		} finally {
			session.flush();
			session.close();
		}
	}	
	
	public void insertEditedLifeInsurance(String cname,String plancode,Date buydate,Date enddate,String payperiod,Double Premium,String des,int id) {
		
		try {

			sessionFactory = new Configuration().configure()
					.buildSessionFactory();
			session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			
			InvestmentLifeInsurance ili=(InvestmentLifeInsurance)session.get(InvestmentLifeInsurance.class, new Integer(id));
		
			ili.setCompanyName(cname);
			ili.setPlanCode(plancode);
			ili.setBuyDate(buydate);
			ili.setEndDate(enddate);
			ili.setPayPeriod(payperiod);
			ili.setPremium(Premium);
			ili.setDescription(des);
			
			session.save(ili);
			
			tr.commit();

			System.out.println("Successfully Data Inserted.");

		} catch (Exception e) {

			System.out.println("Exception:" + e);

		} finally {
			session.flush();
			session.close();
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<InvestmentLifeInsurance> getSpecificRecord(int id){
		
		List<InvestmentLifeInsurance> lifeinsurance = null;
		uid = si.GetSessionid();
		try {
			
			sessionFactory = new Configuration().configure()
					.buildSessionFactory();
			session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			
			String SQL_QUERY = "From InvestmentLifeInsurance ili where ili.Id='"+id+"' and ili.UserId='"+uid+"' ";

			lifeinsurance = (List<InvestmentLifeInsurance>) session.createQuery(SQL_QUERY).list();
			
			tr.commit();
			System.out.println(lifeinsurance.get(0));
			return lifeinsurance;
		
		}
		catch (Exception e) {
			System.out.println("Exception:" + e);
			return null;
		} 
		finally {
			session.flush();
			session.close();
		}
	}
	
	public void deleteLifeInsurance(int id){
		System.out.println("in delete");
		uid=si.GetSessionid();
		try {
		sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		String SQL_QUERY = "delete from InvestmentLifeInsurance ili where ili.Id='"+id+"' and ili.UserId='"+uid+"'";
		Query query=session.createQuery(SQL_QUERY);
		int row = query.executeUpdate();
		System.out.println("Row:"+row);
		tr.commit();
		} catch (Exception e) {

			System.out.println("Exception:" + e);
			

		} finally {
			session.flush();
			session.close();
		}
	}
}
