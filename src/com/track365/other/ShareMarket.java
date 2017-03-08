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
import com.track365.hibernate.InvestmentShareMarket;

public class ShareMarket {

	SessionFactory sessionFactory = null;
	Session session = null;
	SessionInformation si = new SessionInformation();
	int uid;

	public void insertInvestmentShare(String se, String CompanyName,
			String CompanyCode, Date d, int Units, Double UnitPrice,
			String description) {

		uid = si.GetSessionid();

		try {

			sessionFactory = new Configuration().configure()
					.buildSessionFactory();
			session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();

			InvestmentShareMarket ism = new InvestmentShareMarket();
			ism.setUserId(uid);
			ism.setStockExchange(se);
			ism.setCompanyName(CompanyName);
			ism.setCompanyCode(CompanyCode);
			ism.setBuyDate(d);
			ism.setUnits(Units);
			ism.setUnitPrice(UnitPrice);
			ism.setDescription(description);

			session.save(ism);
			tr.commit();

			System.out.println("Successfully Data Inserted.");

		} catch (Exception e) {

			System.out.println("Exception:" + e);

		} finally {
			session.flush();
			session.close();
		}
	}

	@SuppressWarnings({ "rawtypes" })
	public ArrayList<InvestmentShareMarket> getShareRecord() {
		double sum=0;
		 uid = si.GetSessionid();
		ArrayList<InvestmentShareMarket> sharemarket = new ArrayList<InvestmentShareMarket>();
		try {

			sessionFactory = new Configuration().configure()
					.buildSessionFactory();
			session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();

			String SQL_QUERY = "select ism.Id,ism.UserId,ism.StockExchange,ism.CompanyName,ism.CompanyCode,ism.BuyDate,ism.Units,ism.UnitPrice,ism.Description from InvestmentShareMarket ism where ism.UserId='"
					+ uid + "' order by ism.id DESC ";

			Query query=session.createQuery(SQL_QUERY);
			
			//sharemarket = (List<InvestmentShareMarket>) session.createQuery(SQL_QUERY).list();
			
			for(Iterator it=query.iterate();it.hasNext();) {
				
				Object[] row = (Object[]) it.next();
				 //System.out.println(""+row[0].toString()+" & "+row[1].toString()+" & "+row[2].toString());
				// System.out.println(""+row[3].toString()+""+row[4].toString()+" & "+(Date)row[5]+" & "+row[6].toString());
			//	 System.out.println(""+row[7].toString()+" & "+row[8].toString() );
				sum=sum+(Integer.parseInt(row[6].toString())*(Double.parseDouble(row[7].toString())));
				sharemarket.add(new InvestmentShareMarket(Integer.parseInt(row[0].toString()),row[1].toString(),row[2].toString(),row[3].toString() ,row[4].toString(),(Date)row[5],row[6].toString(),row[7].toString(),row[8].toString()));

			}
			tr.commit();
			System.out.println(sum);
			return sharemarket;

		} catch (Exception e) {

			System.out.println("Exception:" + e);
			return null;

		} finally {
			session.flush();
			session.close();
		}
	}
	
	public void deleteInvestmentShare(int id){
		System.out.println("in delete");
		uid=si.GetSessionid();
		try {
		sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		String SQL_QUERY = "delete from InvestmentShareMarket st where st.Id='"+id+"' and st.UserId='"+uid+"'";
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
	public List<InvestmentShareMarket> getSpecificRecord(int id){
		
		List<InvestmentShareMarket> sharemarket = null;
		uid = si.GetSessionid();
		try {
			
			sessionFactory = new Configuration().configure()
					.buildSessionFactory();
			session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			
			String SQL_QUERY = "From InvestmentShareMarket ism where ism.Id='"+id+"' and ism.UserId='"+uid+"' ";

			sharemarket = (List<InvestmentShareMarket>) session.createQuery(SQL_QUERY).list();
			
			tr.commit();
			System.out.println(sharemarket.get(0));
			return sharemarket;
		
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
	
	public void insasdertEditedInvestmentShare(String se, String CompanyName,
			String CompanyCode, Date d, int Units, Double UnitPrice,
			String description,int id) {

		 

		try {

			sessionFactory = new Configuration().configure()
					.buildSessionFactory();
			session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			InvestmentShareMarket ism = (InvestmentShareMarket)session.get(InvestmentShareMarket.class, new Integer(id));
		
		
			ism.setStockExchange(se);
			ism.setCompanyName(CompanyName);
			ism.setCompanyCode(CompanyCode);
			ism.setBuyDate(d);
			ism.setUnits(Units);
			ism.setUnitPrice(UnitPrice);
			ism.setDescription(description);

			session.save(ism);
			tr.commit();

			System.out.println("Successfully Data Inserted.");

		} catch (Exception e) {

			System.out.println("Exception:" + e);

		} finally {
			session.flush();
			session.close();
		}
	}

	public void insertEditedInvestmentShare(String se, String CompanyName,
			String CompanyCode, Date d, int Units, Double UnitPrice,
			String description,int id) {
		
		try {

			sessionFactory = new Configuration().configure()
					.buildSessionFactory();
			session = sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
			InvestmentShareMarket ism = (InvestmentShareMarket)session.get(InvestmentShareMarket.class, new Integer(id));
		
		
			ism.setStockExchange(se);
			ism.setCompanyName(CompanyName);
			ism.setCompanyCode(CompanyCode);
			ism.setBuyDate(d);
			ism.setUnits(Units);
			ism.setUnitPrice(UnitPrice);
			ism.setDescription(description);

			session.save(ism);
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

