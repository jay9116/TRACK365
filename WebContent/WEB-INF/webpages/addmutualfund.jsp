<%@page import="com.track365.other.SessionInformation"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>

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
<sx:head />
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
				Add Mutual Fund Record
				<br/>
				</font>
				<s:form action="addmf" method="post">
				<table>
				<tr>
				<td><s:select label="Company Name" name="CompanyName" list="{'aig-global-investment-group-mutual-fund','axis-mutual-fund','bnp-paribas-mutual-fund','baroda-pioneer-mutual-fund','bharti-axa-mutual-fund',
               'birla-sun-life-mutual-fund','canara-robeco-mutual-fund','dsp-blackrock-mutual-fund','daiwa-mutual-fund','deutsche-mutual-fund','edelweiss-mutual-fund',
                'escorts-mutual-fund','fidelity-mutual-fund','franklin-templeton-mutual-fund','goldman-sachs-mutual-fund','goldman-sachs-mutual-fund','hdfc-mutual-fund',
                'hsbc-mutual-fund','icici-prudential-mutual-fund','idbi-mutual-fund','idfc-mutual-fund','iifl-mutual-fund','ing-mutual-fund','indiabulls-mutual-fund',
                'jm-financial-mutual-fund','jp-morgan-mutual-fund','kotak-mahindra-mutual-fund','landt-mutual-fund','lic-nomura-mutual-fund','mirae-asset-mutual-fund',
                'morgan-stanley-mutual-fund','motilal-oswal-mutual-fund','peerless-mutual-fund','pramerica-mutual-fund','principal-mutual-fund','quantum-mutual-fund',
                'reliance-mutual-fund','religare-mutual-fund','sbi-mutual-fund','sahara-mutual-fund','sundaram-mutual-fund','tata-mutual-fund','taurus-mutual-fund','uti-mutual-fund',
                'union-kbc-mutual-fund'}"/>
				</td>
				</tr>
				<tr>
				<td><s:textfield label="Scheme Name" name="SchemeName" />
				</td>
				</tr>
				<tr>
				<td><s:select list="{'Debt - FMP','Debt - Floaters','Debt - Gilt / Govt','Debt - Income','Debt - MIP Fund','Debt - Medium Term','Debt - Short Term','Debt-with Marginal Equity','Equity - Balanced Fund','Equity - Diversified','Equity - ELSS','Equity - Index Fund','Equity - Sector Fund','Funds of Funds','Gilt Fund','Liquid Fund','Special Fund'}" label="Select Class" name="SchemeClass" />
				</td>
				</tr>
				<tr>
				<td><s:select list="{'Open Ended','Interval Scheme','Closed Ended'}" label="Scheme type" name="SchemeType" />
				</td>
				</tr>
				<tr>
				<td><s:textfield label="Scheme Code" name="SchemeCode" />
				</td>
				</tr>
				<tr>
				<td><s:select list="{'Appreciation','Bonus','Cyclical Series','Daily Dividend Reinvestment','Discipline Advantage','Dividend','Dividend-Annual',
                'Dividend-Bimonthly','Dividend-Daily','Dividend-Flexi','Dividend-Fortnightly','Dividend-Half Yearly',
               'Dividend-Monthly','Dividend-Quarterly','Dividend-Reinvestment','Dividend-Weekly','Fortnightly Dividend Reinvestment',
       			'Growth','Growth Auto Income Payout','Monthly Dividend Reinvestment','Payment-Monthly','Quarterly Dividend Reinvestment','Weekly Dividend Reinvestment'}" label="Scheme Plan" name="PlanType"/>
				</tr>
				<tr>
				<td><s:textarea name="Description" cols="7" rows="4" label="Description"/> </td>
				</tr>
				<tr>
				<td><sx:datetimepicker name="buyDate" label="Buying Date (dd-MMM-yyyy)" displayFormat="dd-MMM-yyyy" value="todayDate" /> </td>
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
					<li><a href="viewmutualfund">Mutual Fund</a> </li>
					<br/>
						<ul style="list-style: none;">
						<li><a href="addmutualfund">Add Record</a></li>
						<li><a href="viewmutualfund">View Record</a></li>
						<li><a href="editmutualfund">Edit Record</a></li>
						<li><a href="deletemutualfund">Delete Record</a></li>
						</ul>
					<br/>
					<li><a href="viewlifeinsurance"> Life Insurance</a> </li>
					</ul>	
					</font>
			</div>
	</div>
	</div>
</center>
</body>
</html>