package com.track365.other;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;

public class SessionInformation {

	int id;
	String firstname;
	String email;
	String login;

	HttpServletRequest request = ServletActionContext.getRequest();
	HttpSession session1 = request.getSession();

	public int GetSessionid() {
		if (session1.getAttribute("ID") != null) {
			id = (Integer) session1.getAttribute("ID");
			return id;
		} else
			return 0;

	}

	public String GetSessionEmail() {

		if (session1.getAttribute("EMAIL") != null) {
			email = (String) session1.getAttribute("EMAIL");
			return email;
		} else
			return "nosession";

	}

	public String GetSessionName() {

		if (session1.getAttribute("FIRSTNAME") != null) {
			firstname = (String) session1.getAttribute("FIRSTNAME");
			return firstname;
		} else
			return "nosession";

	}

	public String GetSessionlogin() {

		if (session1.getAttribute("LOGIN") != null) {
			login = (String) session1.getAttribute("LOGIN");
			return login;
		} else
			return "nosession";
	}

	public void SetSessionid(int id) {

		session1.setAttribute("ID", id);

	}

	public void SetSessionemail(String email) {

		session1.setAttribute("EMAIL", email);

	}

	public void SetSessionname(String name) {

		session1.setAttribute("FIRSTNAME", name);

	}

	public void SetSessionlogin() {
		session1.setAttribute("LOGIN", "true");
	}

	public void DestroySession() {

		session1.invalidate();
		System.out.println("Destroyed session");

	}

}
