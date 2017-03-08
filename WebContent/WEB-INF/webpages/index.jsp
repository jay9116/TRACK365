<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="shortcut icon" href="icon">
<title> LogIn - TRACK365 </title>
<style type="text/css">
#border
{
border-style:solid;
border-width: 3px;

}
</style>
</head>
<body>

<center>

<div style="width:1000px;">
	<div style="width:1000px;  height:100px; float:left; ">
		<div style="width:500px;  height:100px; float:left; background-color:#DADADA;">
			<p align="left" > <font face="Trebuchet MS" size="7" color="red">  TRACK365  </font> </p>
		</div>
		<div style="width:500px;  height:100px; float:right; background-color:red;">
			<div style="width:500px; height:40px; float:left; background-color:#DADADA;">
				<p align="center"> <font face="calibri" size="4">
					<a href="" style="text-decoration: none">  Contact Us   |         </a>
					<a href=""  style="text-decoration: none"> Feedback   | </a>
					<a href="" style="text-decoration: none"> FAQ   |</a>
					<a href=""  style="text-decoration: none"> About Us </a> </font>
				</p>
			</div>
			<div style="width:500px; height:60px; float:left; background-color:#DADADA;" >
				<p >  <font face="calibri" size="4"> New to TRACK365? &nbsp;&nbsp;  <span style="background-color:blue" id="border"> <a href="register" style="text-decoration:none"> <font color="white">   Create an Account </font> </a> </span> </font> </p>
			</div>
		</div>
		<div style="width:1000px; height:25px;  clear:both; background-color:white">
			
		</div> 
		<div style="width:675px; height:500px; float:left; background-color:white;  "> 
			<font face="calibri" size="6">	TRACK365  </font> <br/>
			<font face="calibri" size="4"> 
				 Helps you to keep the track of your investment.
			</font>
		</div>
		<div id="border"  style="width:300px; height:400px; float:right; background-color:#DADADA;">
		<font face="calibri" size="4">
		<s:form action="login" method="post">
		
		<table >
			<tr>
			<td colspan="2"> <font face="calibri" size="5" color="black">Sign In  </font>
			</td>
			</tr>
			<tr>
			<td>
			<br/>
			</td>
			</tr>
			<tr> 
			<td> <br/>
			</td>
			<td>
			 <s:textfield name="Email" size="25" label="Email"> </s:textfield>
			</td> </tr>
			<tr>
			<td> <br/>
			</td>
			
			<td> <s:password name="Password" size="25" label="Password" > </s:password>
			</td>
			</tr>
			<tr>
			<td colspan="2"> <font color="red"> <s:actionerror/> </font>
			</td>
			</tr>
			<tr>
			<td> <s:submit value="Sign In" align="center"> </s:submit>  </td>
			</tr>
			<tr>
			<td> <br/> <br/>
			</td>
			</tr>
			<tr>
			<td colspan="2">
				<font face="calibri" size=4> <a href="" style="text-decoration:none"> <p align="center"> Forgot Your Password? </p> </a> </font> 
			</td>
			</tr>
		</table>
		
		 </s:form></font>
		</div>	
	</div>
</div>

</center>
</body>
</html>