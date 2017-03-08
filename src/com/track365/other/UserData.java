package com.track365.other;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.track365.hibernate.Gender;
import com.track365.hibernate.Isverified;
import com.track365.hibernate.Status;
import com.track365.hibernate.User;
import com.track365.hibernate.UserInfo;

public class UserData {

	Session session = null;
	SessionFactory sessionFactory=null;
	
	public boolean adddata(String email,String password,String firstname,String lastname,String gender,Date bd){
		
	try{
		
		 sessionFactory = new Configuration().configure().buildSessionFactory();
		session =sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		User user=new User();
		user.setEmail(email);
		user.setPassword(password);
		user.setFirstName(firstname);
		user.setLastName(lastname);
		user.setStatus(Status.Active);
		user.setVerificationNumber(new GenerateRandomNumber().generatevalidation());
		user.setIsverified(Isverified.False);
		
		UserInfo userinfo=new UserInfo();
		userinfo.setBirthDate(bd);
		userinfo.setGender(Gender.valueOf(gender));
		userinfo.setDrivingLicence("Not Set");
		userinfo.setAadharCard("Not Set");
		userinfo.setElectionCard("Not Set");
		userinfo.setPanCard("Not Set");
		userinfo.setRationCard("Not Set");
		
		
		user.setUserinfo(userinfo);
		userinfo.setUser(user);
		
		
		session.save(user);
		tr.commit();
		System.out.println("Successfully Data Inserted.");
		return true;
		
	}catch (Exception e) {
		
		System.out.println("Exception:"+e);
		return false;
	}
	finally
	{
		session.flush();
		session.close();
	}
	}
	
	public void UpdateIsverified(int id){
		
	try{
			sessionFactory = new Configuration().configure().buildSessionFactory();
			session =sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
		
			User user = (User)session.get(User.class, new Integer(id));
			user.setIsverified(Isverified.True);
			
			session.save(user);
			tr.commit();
			System.out.println("Updated successfully");
		
		}
		catch(Exception e) {
			System.out.println("Exception:"+e);
		}
		finally
		{
			session.flush();
			session.close();
		}
	}
	
	public void UpdatePassword(String pass) {
	
		SessionInformation si=new SessionInformation();
		int id=si.GetSessionid();
		try{
			sessionFactory = new Configuration().configure().buildSessionFactory();
			session =sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
		
			User user = (User)session.get(User.class, new Integer(id));
			user.setPassword(pass);
			
			session.save(user);
			tr.commit();
			System.out.println("Updated successfully");
		
		}
		catch(Exception e) {
			System.out.println("Exception:"+e);
		}
		finally
		{
			session.flush();
			session.close();
		}
	
	
	}
	
}
