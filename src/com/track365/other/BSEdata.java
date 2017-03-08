package com.track365.other;

import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.track365.hibernate.BSE;

public class BSEdata {

	Session session = null;
	SessionFactory sessionFactory=null;
	ArrayList<BSE> bse=null;
	@SuppressWarnings("unchecked")
	
	public ArrayList<BSE> getdata(){
		
		try{
			
			sessionFactory = new Configuration().configure().buildSessionFactory();
			session =sessionFactory.openSession();
			Transaction tr=session.beginTransaction();
			
			String SQL_QUERY = "select bse.BseName,bse.BseGroup,bse.BseCode from BSE bse";
			
			bse = (ArrayList<BSE>) session.createQuery(SQL_QUERY).list();
			
			tr.commit();
			
			return bse;
			
		}catch (Exception e) {
			
			System.out.println("Exception:"+e);
			return null;
		}
		finally
		{
			session.flush();
			session.close();
		}	
	}
	
}
