<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

${wrong}

<form action="addCustomer" method="post">
<label>Name : </label>
<input type="text" id="name" name = "name" value=""/>
<br/>
<label>Password</label>
<input type="password" id = "password" name ="password">
<br/>

<input type = "submit" id = "submit" name = "submit">

</form>

</body>
</html>