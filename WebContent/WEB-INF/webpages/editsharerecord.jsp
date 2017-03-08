<%@page import="com.track365.other.SessionInformation"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<sx:head />
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
		<div id="border" style="width:1000px;  float:left; background-color:red;">
			<div id="borderright" style="width:700px; height:500px;  float:left; background-color:white; ">
				<font face="calibri" size="3">
				<font size="5" color="blue">
				Edit Share Record
				<br/>
				</font> 
				
				<s:form action="addeditedsm" method="post">
				<table>
				<s:hidden name="Id"><s:param name="value"><s:property value="id"></s:property></s:param></s:hidden>
			
				<tr>
				<td><s:textfield name="StockExchange" label="Stock Exchange" ><s:param name="value"><s:property value="StockExchange"></s:property></s:param></s:textfield>
				</td>
				</tr>
				<tr>
				<td><s:textfield label="Company Name" name="CompanyName" ><s:param name="value"><s:property value="CompanyName"></s:property></s:param></s:textfield>
				</td>
				</tr>
				<tr>
				<td><s:textfield name="CompanyCode" label="Company Code"  ><s:param name="value"><s:property value="CompanyCode"></s:property></s:param></s:textfield>
				</td>
				</tr>
				<tr>
				<td><sx:datetimepicker name="BuyDate" label="Format (dd-MMM-yyyy)" displayFormat="dd-MMM-yyyy" value="todayDate" /> </td><s:param name="value"><s:property value="BuyDate"></s:property></s:param>
				</td>
				</tr>
				<tr>
				<td><s:textfield name="Units" label=" Number Of Units"><s:param name="value"><s:property value="Units"></s:property></s:param></s:textfield>
				</td>
				</tr>
				<tr>
				<td> <s:textfield name="UnitPrice" label="Unit Price"><s:param name="value"><s:property value="UnitPrice"></s:property></s:param></s:textfield>
				</td>
				</tr>
				<tr>
				<td> <s:textarea name="Description" label="Description"><s:param name="value"><s:property value="Description"></s:property></s:param></s:textarea>
				</td>
				</tr>
				<tr>
				<td> <s:submit align="Center"></s:submit>
				</td>
				</tr>
				</table>
				</s:form>
 				</font>
			</div>
			<div style="width:299px; height:500px; background-color:white; float:right">
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
					<li><a href="">Mutual Fund</a> </li>
					<br/>
					<li><a href=""> Life Insurance</a> </li>
					</ul>	
					</font>
			</div>
	</div>
	</div>
</center>
</body>
</html>