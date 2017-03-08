<%@page import="com.track365.other.SessionInformation"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="display" uri="http://displaytag.sf.net" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="shortcut icon" href="icon">
<title>Profile - TRACK365</title>
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
				<div id="right" style="width:166px; heigh:42px;float:left;"><p align="center"><font face="calibri" size=3 color="#DADADA"> <a class="menu" href="getinvestment" style="text-decoration:none"> Investments </a></font></p></div>
				<div id="right" style="width:166px; heigh:42px;float:left;"><p align="center"><font face="calibri" size=3 color="#DADADA"> <a class="menu" href="#" style="text-decoration:none"> Report </a></font></p></div>
				<div id="right" style="width:166px; heigh:42px;float:left;"><p align="center"><font face="calibri" size=3 color="#DADADA"> <a class="menu" href="#" style="text-decoration:none"> Reminder </a></font></p></div>
				<div style="width:166px; heigh:42px;float:right;"><p align="center"><font face="calibri" size=3 color="#DADADA"> <a class="menu" href="#" style="text-decoration:none"> Logout </a></font></p> </div>
			
		</div>
		<div id="border" style="width:1000px; height:550px;  float:left; ">
			<div id="borderright" style="width:800px; height:500px;  float:left; background-color:white; ">
				<font face="calibri" size="3">
				<display:table id="data" name="sessionScope.list" requestURI="/viewsharerecord.action" pagesize="10" export="true">
				<display:column property="id" title="Id" sortable="true"/>
				<display:column property="stockExchange" title="Stock Exchange" sortable="true"/>
				<display:column property="companyName" title="Company Name" />
				<display:column property="companyCode" title="Company Code" />
				<display:column property="buyDate" title="Date Of Buying" />
			
				<display:column property="units" title="Units" />
				<display:column property="unitPrice" title="Unit Price" />
				<display:column property="description" title="Description" />
				<display:setProperty name="export.excel.filename" value="ShareDetails.xls"/>
            	<display:setProperty name="export.pdf.filename" value="ShareDetails.pdf"/>
            	<display:setProperty name="export.pdf" value="true" />
				</display:table>
				
				
				
				</font>

			</div>
			<div style="width:199px; height:500px; background-color:white; float:right">
					<font face="calibri" size="3">
					<ul>
					<br/>
					<li> <a href="viewsharemarket"> Share Market</a> </li>
					<br/>
						<ul style="list-style: none;">
							<li><a href="addsharerecord"> Add Record </a></li>
							<li><a href="viewsharerecord"> View Record </a></li>
							<li><a href="editsharerecord">Edit Record</a>
							<li><a href="deletesharerecord"> Delete Record </a></li>
						</ul>
					<br/>
					<li><a href="viewmutualfund">Mutual Fund</a> </li>
					<br/>
					<li><a href="viewlifeinsurance"> Life Insurance</a> </li>
					</ul>	
					</font>
			</div>
	</div>
</center>
</body>
</html>