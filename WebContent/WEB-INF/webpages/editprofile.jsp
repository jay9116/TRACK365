<%@page import="com.track365.action.EditProfileAction"%>
<%@page import="com.track365.other.SessionInformation"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="shortcut icon" href="icon">
<title>Edit Profile - TRACK365</title>
<style type="text/css">
#border {
	border-style: solid;
	
}
#right{
	border-right-style: dotted;
	border-right-color: white;
	border-right-width:1px;
}

#borderright
{
	border-right-style:solid;
	border-right-color: black;
	border-right-width: 1px;
}
a.menu:VISITED{
	color:white;
}
a.menu:link{
	color:white;
}
a.menu:hover {
	color:aqua;
}   


</style>
</head>
<body>
</head>
<body>
<center>
	<div style="width:1000px;">
		<div style="width:1000px; height:100px; float:left;">
			<div style="width:500px; height:100px; float:left; background-color:#DADADA;">
				<p align="left">
					<font face="calibri" size="7" color="red"> TRACK365 </font>
				</p>
			</div>
			<div style="width:500px; height:100px; float:right; background-color:red;">
				<div style="width: 500px; height: 40px; float: left; background-color: #DADADA;">
					<p align="center">
						<font face="calibri" size="4"> 
							<a href="" style="text-decoration: none"> Contact Us | </a>
							<a href="" style="text-decoration: none"> Feedback | </a>
							<a href=""style="text-decoration: none"> FAQ |</a> 
							<a href="" style="text-decoration: none"> About Us </a> 
						</font>
					</p>
				</div>
				<%
						String temp="";
						String isverified="";
					
						SessionInformation si = new SessionInformation();
						String login = si.GetSessionlogin();
						EditProfileAction ep= new EditProfileAction();
						String name=ep.getDrivingLicence();
						
						if(!login.equals("nosesion")) {
						 temp = si.GetSessionName();
						}
						else
						{
							response.sendRedirect("loginerror.jsp");
						} 
					%>
				<div style="width:500px; height:60px; float:left; background-color:#DADADA;">
					<p>
					<c:if test='<%=login.equals("true")%>'>
						<font face="calibri" size="4">Welcome, <%=temp%> </font>
						<a href="logout" style="text-decoration: none"> 
							<font color="blue" face="calibri" size="3">
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Logout
							</font> 
						</a>
					</c:if>
					</p>
				</div>
			</div>
		</div>
		<div style="width:1000px; height:42px; clear:both; background-color:#9A9A9A  ">
			
				<div  id="right" style="width:165px; heigh:42px;float:left;"><p align="center"><font face="calibri" size=3 color="#DADADA"> <a href="home" class="menu" href="#" style="text-decoration:none"> Home </a></font>  </p> </div>
				<div id="right" style="width:166px; heigh:42px;float:left;"><p align="center"><font face="calibri" size=3 color="#DADADA"> <a href="getprofile" class="menu" href="#" style="text-decoration:none"> Profile</a></font> </p> </div>
				<div id="right" style="width:166px; heigh:42px;float:left;"><p align="center"><font face="calibri" size=3 color="#DADADA"> <a class="menu" href="#" style="text-decoration:none"> Investments </a></font></p></div>
				<div id="right" style="width:166px; heigh:42px;float:left;"><p align="center"><font face="calibri" size=3 color="#DADADA"> <a class="menu" href="#" style="text-decoration:none"> Report </a></font></p></div>
				<div id="right" style="width:166px; heigh:42px;float:left;"><p align="center"><font face="calibri" size=3 color="#DADADA"> <a class="menu" href="#" style="text-decoration:none"> Reminder </a></font></p></div>
				<div style="width:166px; heigh:42px;float:right;"><p align="center"><font face="calibri" size=3 color="#DADADA"> <a class="menu" href="#" style="text-decoration:none"> Logout </a></font></p> </div>
			
		</div>
		<div id="border" style="width:1000px; height:500px;  float:left; background-color:red;">
				<div id="borderright" style="width:700px; height:500px; float:left; background-color: white; ">
					<font face="calibri" size="3">
						<font size="5" color="blue">
							<p> Edit Profile </p>
						</font>
						<s:form action="updateprofile" method="post">
						<table>
						<tr>
						<td><s:textfield label="Driving Licence Number" name="DrivingLicence"> <s:param name="value"><s:property value="DrivingLicence"></s:property></s:param></s:textfield>
						</td>
						</tr>
						<tr>
						<td><s:textfield label="Pan Card Number" name="PanCard"> <s:param name="value"><s:property value="PanCard"></s:property></s:param></s:textfield>
						</td>
						</tr>
						<tr>
						<td><s:textfield label="Election Card Number" name="ElectionCard"> <s:param name="value"><s:property value="ElectionCard"></s:property></s:param></s:textfield>
						</td>
						</tr>
						<tr>
						<td><s:textfield label="Aadhar Card Number" name="AadharCard"> <s:param name="value"><s:property value="AadharCard"></s:property></s:param></s:textfield>
						</td>
						</tr>
						<tr>
						<td><s:textfield label="Ration Card Number" name="RationCard"> <s:param name="value"><s:property value="RationCard"></s:property></s:param></s:textfield>
						</td>
						</tr>
						<tr>
						<td><s:submit align="center" value="Update"> </s:submit>
						</td>
						</tr>
						</table>
						</s:form>
						</font>
				</div> 
							
				<div style="width:299px; height:500px; float:right; background-color:white">
				<br/>
				<br/>
				<font face="calibri" >
				
				<ul type="disc">
				<li><a href="getprofile" > View Profile</a></li>
				<br/>
				<li><a href="changepass" > Change Password</a></li>
				</ul>
				</font>
				</div>	
				
			
		</div>
	</div>
</center>
</body>
</html>