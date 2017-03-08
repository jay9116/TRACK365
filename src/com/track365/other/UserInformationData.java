package com.track365.other;

import java.util.ArrayList;
import java.util.Iterator;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.track365.hibernate.UserInfo;

public class UserInformationData {
	
	SessionInformation si = new SessionInformation();
	SessionFactory sessionFactory=null;
	Session session=null;
	
	public ArrayList<Object> getProfileInfo() {

		SessionInformation si = new SessionInformation();
		
		int id = si.GetSessionid();
		ArrayList<Object> al = new ArrayList<Object>();

		try {

		sessionFactory = new Configuration().configure().buildSessionFactory();
		session = sessionFactory.openSession();
		
			String SQL_QUERY = "from User as a inner join a.userinfo as b with b.Id ='"+ id + "' ";
			// from Person as a inner join a.PersonSecrets as b with b.User.Id =
			// :userId and b.RemindeBirthday = :remind
			Query query = session.createQuery(SQL_QUERY);

			for (@SuppressWarnings("rawtypes")
			Iterator it = query.iterate(); it.hasNext();) {
				
				Object[] row = (Object[]) it.next();
				al.add(row[0]);
				al.add(row[1]);
			}
			System.out.println(al.get(0));
			System.out.println("Successfully Data get.");
			
			return al;

		} catch (Exception e) {

			System.out.println("Exception:" + e);
			return al;

		} finally {
			session.flush();
			session.close();
		}
	}
	
	public ArrayList<String> getPrivateInfo(){
		
		int id = si.GetSessionid();
		ArrayList<String> userinfo=new ArrayList<String>();
		try {

			sessionFactory = new Configuration().configure().buildSessionFactory();
			session = sessionFactory.openSession();

			String SQL_QUERY = "select user_info.DrivingLicence,user_info.PanCard,user_info.ElectionCard,user_info.AadharCard,user_info.RationCard from UserInfo user_info where user_info.Id='"+id+"'";
			
			Query query = session.createQuery(SQL_QUERY);

			for (@SuppressWarnings("rawtypes")
			Iterator it = query.iterate(); it.hasNext();) {
				Object[] row = (Object[]) it.next();
				System.out.println("in 1");
				userinfo.add(row[0].toString());
				userinfo.add(row[1].toString());
				userinfo.add(row[2].toString());
				userinfo.add(row[3].toString());
				userinfo.add(row[4].toString());
				
			}
			
			System.out.println("Successfully Data get.");
			
			return userinfo;
		} catch (Exception e) {

			System.out.println("Exception:" + e);
			return null;

		} finally {

			session.flush();
			session.close();
		}
	}
	
	public void UpdateProfileInfo(String dl, String pc, String ec, String ac , String rc){
		
		SessionInformation si=new SessionInformation();
		int id=si.GetSessionid();
		try{
			
			sessionFactory = new Configuration().configure().buildSessionFactory();
			session =sessionFactory.openSession();
			Transaction tr = session.beginTransaction();
		
			UserInfo userinfo = (UserInfo)session.get(UserInfo.class, new Integer(id));
			userinfo.setDrivingLicence(dl);
			userinfo.setPanCard(pc);
			userinfo.setElectionCard(ec);
			userinfo.setAadharCard(ac);
			userinfo.setRationCard(rc);
		
			session.save(userinfo);
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
