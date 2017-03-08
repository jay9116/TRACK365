<%@page import="com.track365.other.SessionInformation"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="shortcut icon" href="icon">
<title>Home - TRACK365</title>
<style type="text/css">
#border {
	border-style: solid;
	
}
#right{
	border-right-style: dotted;
	border-right-color: white;
	border-right-width:1px;
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
		<div style="width:1000px; height:50px; clear:both; background-color:#9A9A9A  ">
			
				<div  id="right" style="width:165px; heigh:42px;float:left;"><p align="center"><font face="Trebuchet MS" size=4 color="#DADADA"> <a href="home" class="menu" href="#" style="text-decoration:none"> Home </a></font>  </p> </div>
				<div id="right" style="width:166px; heigh:42px;float:left;"><p align="center"><font face="Trebuchet MS" size=4 color="#DADADA"> <a href="getprofile" class="menu" href="#" style="text-decoration:none"> Profile</a></font> </p> </div>
				<div id="right" style="width:166px; heigh:42px;float:left;"><p align="center"><font face="Trebuchet MS" size=4 color="#DADADA"> <a class="menu" href="getinvestment" style="text-decoration:none"> Investments </a></font></p></div>
				<div id="right" style="width:166px; heigh:42px;float:left;"><p align="center"><font face="Trebuchet MS" size=4 color="#DADADA"> <a class="menu" href="#" style="text-decoration:none"> Report </a></font></p></div>
				<div id="right" style="width:166px; heigh:42px;float:left;"><p align="center"><font face="Trebuchet MS" size=4 color="#DADADA"> <a class="menu" href="#" style="text-decoration:none"> Reminder </a></font></p></div>
				<div style="width:166px; heigh:42px;float:right;"><p align="center"><font face="Trebuchet MS" size=4 color="#DADADA"> <a href="logout" class="menu" href="#" style="text-decoration:none"> Logout </a></font></p> </div>
			
		</div>
		<div id="border1" style="width:1000px; height:500px; float:left; background-color:white;">
			<div style="height: 20px"></div>
			<div style="float: left; width: 500px">
			<iframe scrolling="no" height="280" width="480" src="//www.gmodules.com/ig/ifr?url=http://hosting.gmodules.com/ig/gadgets/file/102891932573414116126/Market-Snapshot.xml&amp;synd=open&amp;ticker=2&amp;title=Sensex+Ticker&amp;&amp;output=html"></iframe>
			</div >
			<div style="float: right; width: 500px">
			<p align="left">
			<font size="3" face="calibri">
			SENSEX is the short form of The Bombay Stock Exchange Sensitive Index. A sweet short name for a long boring name. 
			It is a benchmark that shows the health of the share market. If it goes down, it means that the market is going down (Bear market) and if it goes up, the market is going up (Bull market). Therefore going up is a good sign and it means that you will get more price for the shares you have.
			</font>
			</p> 
			</div>
		</div>
</center>
</body>
</html>