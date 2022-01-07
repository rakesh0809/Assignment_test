<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="display">
Enter the information here<br>
Enter the Name:<input type="text" name="fname"><br>
Enter the City:<input type="text" name="city"><br>
Enter the Country:<input type="text" name="country"><br>
Enter the UserName:<input type="text" name="uname"><br>
Enter the Password:<input type="password" name="password"><br>
Country:  
<select name="userCountry">  
<option>India</option>  
<option>Pakistan</option>  
<option>other</option> 
<input type="submit" value="submit"><br>
<input type="reset" value="reset"><br>
<a href="index.jsp" >login here</a>
</select>  
  </form>
</body>
</html>