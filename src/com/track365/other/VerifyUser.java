package com.track365.other;

import java.util.Iterator
;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class VerifyUser {
	
	Session session=null;
	
	
	@SuppressWarnings("rawtypes")
	public boolean CheckUser(String email,String password){
		
		try{
			SessionInformation si=new SessionInformation();
			int id;
			String firstname,email1;
			boolean temp=false;
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			session =sessionFactory.openSession();
			String SQL_QUERY ="select user.Id,user.Email,user.FirstName from User user where user.Email='"+email+"'and user.Password='"+password+"'";
			Query query = session.createQuery(SQL_QUERY);
			
			
			
			for(Iterator it=query.iterate();it.hasNext();) {
				System.out.println("in one");
				Object[] row = (Object[]) it.next();
				System.out.println("in to");
				id=Integer.parseInt(row[0].toString());
				email1=row[1].toString();
				firstname=row[2].toString();
				
				si.SetSessionid(id);
				si.SetSessionname(firstname);
				si.SetSessionemail(email1);
				si.SetSessionlogin();
				
				
				temp=true;  
			 }
				
			return temp;
			 
			
		}catch (Exception e) {
			System.out.println("Exception"+e);
			return false;
		}
		finally
		{
			session.flush();
			session.close();
		}
	}
	
	public String CheckIsVerified(){
		
		try{

			String temp="";
			
			SessionInformation si=new SessionInformation();
			
			int id=si.GetSessionid();
			String email= si.GetSessionEmail();
			
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			session =sessionFactory.openSession();
			String SQL_QUERY ="select user.FirstName,user.Isverified  from User user where user.Id='"+id+"'and user.Email='"+email+"'";
			Query query = session.createQuery(SQL_QUERY);
			
			for(@SuppressWarnings("rawtypes")
			
			Iterator it=query.iterate();it.hasNext();) {
				Object[] row = (Object[]) it.next();
			
				System.out.println("Firstname:" + row[0]);
				temp=row[1].toString();
				System.out.println(temp);
			 }
			
			 return temp;
			
		}catch (Exception e) {
			System.out.println("Exception:"+e);
			return "false";
		}
		finally
		{
			session.flush();
			session.close();
		}
	}
	
	public boolean CheckVeriNumber(long verinumber) {
	
		SessionInformation si=new SessionInformation();
		
		int id=si.GetSessionid();
		String email= si.GetSessionEmail();
		
		try{
			boolean temp=false;
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			session =sessionFactory.openSession();
			
			String SQL_QUERY ="select user.FirstName,user.LastName from User user where user.Id='"+id+"' and user.Email='"+email+"' and user.VerificationNumber="+verinumber+"";
			Query query = session.createQuery(SQL_QUERY);
			
			for(@SuppressWarnings("rawtypes")
			
			Iterator it=query.iterate();it.hasNext();) {	
				Object[] row = (Object[]) it.next();
				
				System.out.println("Firstname:"+row[0]);
				System.out.println("Lastname:"+row[1]);
				
				temp=true;
			}
			
				return temp;
			
		}catch(Exception e)
		{
			System.out.println("Exception:"+e);
			return false;
		}
		finally
		{
			session.flush();
			session.close();
		}
	}

	
	public boolean CheckUserEmail(String email) {
		try{
			boolean temp=true;
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			session =sessionFactory.openSession();
			
			String SQL_QUERY ="select user.FirstName from User user where  user.Email='"+email+"' ";
			Query query = session.createQuery(SQL_QUERY);
			
			for(@SuppressWarnings("rawtypes")
			
			Iterator it=query.iterate();it.hasNext();) {	
				Object[] row = (Object[]) it.next();
				
				System.out.println("Firstname:"+row[0].toString());
				temp=false;
				
			}
			
				return temp;
			
		}catch(Exception e)
		{
			System.out.println("Exception:"+e);
			return false;
		}
		finally
		{
			session.flush();
			session.close();
		}
	}	
		
	public boolean CheckPassword(String pass) {
		
		SessionInformation si=new SessionInformation();
		int id=si.GetSessionid();

		try{
			boolean temp=false;
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			session =sessionFactory.openSession();
			
			String SQL_QUERY ="select user.FirstName,user.LastName from User user where  user.Id='"+id+"' and user.Password='"+pass+"' ";
			Query query = session.createQuery(SQL_QUERY);
			
			for(@SuppressWarnings("rawtypes")
			
			Iterator it=query.iterate();it.hasNext();) {	
				Object[] row = (Object[]) it.next();
				
				System.out.println("Firstname:"+row[0]);
				System.out.println("Lastname:"+row[1]);
				
				
				temp=true;
			}
			
				return temp;
			
		}catch(Exception e)
		{
			System.out.println("Exception:"+e);
			return false;
		}
		finally
		{
			session.flush();
			session.close();
		}
		
		
			
			
			
	}
	
}

