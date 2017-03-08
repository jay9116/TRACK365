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

import com.track365.hibernate.InvestmentMutualFund;



public class MutualFund {
	SessionFactory sessionFactory = null;
	Session session = null;
	SessionInformation si = new SessionInformation();
	int uid;

	public void insertInvestmentMutualFund(String cname,String sname,String sclass,String stype,String scode,String splan,String des,Date d){
		uid = si.GetSessionid();

		try {

			sessionFactory = new Configuration().configure()
					.buildSessionFactory();
			session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			InvestmentMutualFund imf=new InvestmentMutualFund();
			
			imf.setUserId(uid);
			imf.setCompanyName(cname);
			imf.setSchemeName(sname);
			imf.setSchemeClass(sclass);
			imf.setSchemeType(stype);
			imf.setSchemeCode(scode);
			imf.setPlanType(splan);
			imf.setDescription(des);
			imf.setBuyDate(d);
			
			session.save(imf);
			tr.commit();
			
	}catch(Exception e){
		System.out.println("Exception : "+e);
	}finally{
		session.flush();
		session.close();
	}
}
	@SuppressWarnings({ "rawtypes" })
	public ArrayList<InvestmentMutualFund> getMFRecord() {
		double sum=0;
		 uid = si.GetSessionid();
		ArrayList<InvestmentMutualFund> mutualfund = new ArrayList<InvestmentMutualFund>();
		try {

			sessionFactory = new Configuration().configure()
					.buildSessionFactory();
			session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();

			String SQL_QUERY = "select imf.Id,imf.UserId,imf.CompanyName,imf.SchemeName,imf.SchemeClass,imf.SchemeType,imf.SchemeCode,imf.PlanType,imf.Description,imf.BuyDate from InvestmentMutualFund imf where imf.UserId='"
					+ uid + "' order by imf.id DESC ";

			Query query=session.createQuery(SQL_QUERY);
			
			//sharemarket = (List<InvestmentShareMarket>) session.createQuery(SQL_QUERY).list();
			
			for(Iterator it=query.iterate();it.hasNext();) {
				
				Object[] row = (Object[]) it.next();
				 //System.out.println(""+row[0].toString()+" & "+row[1].toString()+" & "+row[2].toString());
				// System.out.println(""+row[3].toString()+""+row[4].toString()+" & "+(Date)row[5]+" & "+row[6].toString());
			//	 System.out.println(""+row[7].toString()+" & "+row[8].toString() );
				//sharemarket.add(new InvestmentShareMarket(Integer.parseInt(row[0].toString()),row[1].toString(),row[2].toString(),row[3].toString() ,row[4].toString(),(Date)row[5],row[6].toString(),row[7].toString(),row[8].toString()));
				mutualfund.add(new InvestmentMutualFund(Integer.parseInt(row[0].toString()),Integer.parseInt(row[1].toString()),row[2].toString(),row[3].toString(),row[4].toString(),row[5].toString(),row[6].toString(),row[7].toString(),row[8].toString(),(Date)row[9]));
				System.out.println("asd");
			}
			tr.commit();
			return mutualfund;

		} catch (Exception e) {

			System.out.println("Exception:" + e);
			return null;

		} finally {
			session.flush();
			session.close();
		}
	}	
	
	
	public void deleteMutualFund(int id){
		System.out.println("in delete");
		uid=si.GetSessionid();
		try {
		sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		String SQL_QUERY = "delete from InvestmentMutualFund imf where imf.Id='"+id+"' and imf.UserId='"+uid+"'";
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

	@SuppressWarnings("unchecked")
	public List<InvestmentMutualFund> getSpecificRecord(int id){
		
		List<InvestmentMutualFund> mutualfund = null;
		uid = si.GetSessionid();
		try {
			
			sessionFactory = new Configuration().configure()
					.buildSessionFactory();
			session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			
			String SQL_QUERY = "From InvestmentMutualFund imf where imf.Id='"+id+"' and imf.UserId='"+uid+"' ";

			mutualfund = (List<InvestmentMutualFund>) session.createQuery(SQL_QUERY).list();
			
			tr.commit();
			System.out.println(mutualfund.get(0));
			return mutualfund;
		
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
	
	public void insertEditedMutualFund(String cname,String sname,String sclass,String stype,String scode,String splan,String des,Date d,int id) {
		
		try {

			sessionFactory = new Configuration().configure()
					.buildSessionFactory();
			session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			
			InvestmentMutualFund imf= (InvestmentMutualFund)session.get(InvestmentMutualFund.class, new Integer(id));
		
			imf.setCompanyName(cname);
			imf.setSchemeName(sname);
			imf.setSchemeClass(sclass);
			imf.setSchemeType(stype);
			imf.setSchemeCode(scode);
			imf.setPlanType(splan);
			imf.setDescription(des);
			imf.setBuyDate(d);

			session.save(imf);
			tr.commit();

			System.out.println("Successfully Data Inserted.");

		} catch (Exception e) {

			System.out.println("Exception:" + e);

		} finally {
			session.flush();
			session.close();
		}
	}
}
