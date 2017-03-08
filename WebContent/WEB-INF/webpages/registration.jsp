<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<html>
<head>
<link rel="shortcut icon" href="icon"/>

<title> Home - TRACK365 </title>

<style type="text/css">
#border
{
border-style:solid;
border-width: 3px;

}
</style>
<script type="text/javascript">
function Upper() {
		
		var s1=document.getElementById('registration_FirstName').value;
		var s2=s1.charAt(0).toUpperCase();
		var s3=s1.substring(1,s1.length);
		var s4=s3.toLowerCase();
		var s5=s2.concat(s4);
		document.getElementById('registration_FirstName').value=s5;
		return true;
}
</script>
<sx:head />
</head>
<body>

<center>

<div style="width:1000px;">
	<div style="width:1000px;  height:100px; float:left; ">
		<div style="width:500px;  height:100px; float:left; background-color:#DADADA;">
			<p align="left" > <font face="calibri" size="7" color="red">  TRACK365  </font> </p>
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
				<p >  <font face="calibri" size="4"> Already Have an Account? &nbsp;&nbsp;  <span style="background-color:maroon" id="border"> <a href="index" style="text-decoration:none"> <font color="white">   Sign In </font> </a> </span> </font> </p>
			</div>
		</div>
	</div>
	<div style="width:1000px; height:25px;  clear:both; background-color:white">
			
	</div> 
	<div style="width:200px; height:400px; background-color:white; float:left;">
	</div>
	<div style="width:600px; height:600px; background-color:#DADADA; float:left" id="border">
	<font face="calibri" size="4">
		<s:form action="registration" method="post">
		<table>
		<tr> 
			<td>  <br/> 
			</td> 
		</tr>
		<tr>
			<td> <font size="5" color="blue">  Register Your Account. </font> 
			</td>
		</tr>
		<tr>
		<td> <br/> <br/> </td>
		</tr>
		<tr>
			<td> <s:textfield name="FirstName" label="FirstName" width="20" onblur="Upper();" required="true"  />
			</td>
		</tr>
		<tr>
			<td> <s:textfield name="LastName" label="LastName" onblur="Upper();" />
			</td>
		</tr>
		<tr>
		<td colspan="2"> <font color="red"> <s:actionerror/></font>
		</td>
		</tr>
		<tr>
			<td> <s:textfield name="Email" label="Email" />
			</td>
		</tr>
		<tr>
			<td> 	<s:password name="Password" label="Choose your Password" />
			</td>
		</tr>
		<tr>
			<td> 	<s:password name="ConfirmPassword" label="Confirm your Password"  />
			</td>
		</tr>
		<tr> <td> Birth Date: </td>
			<td><sx:datetimepicker name="date" displayFormat="dd-MMM-yyyy" value="todayDate" />
			</td>
		</tr>
		<tr>
			<td> <s:radio name="Gender" label="Gender" list="{'Male','Female'}" />
			
			</td>
		</tr>
			<s:submit label="Submit" align="center" />
		</table>
		</s:form>
		</font>
	</div>
	
</div>

</center>
</body>
</html>