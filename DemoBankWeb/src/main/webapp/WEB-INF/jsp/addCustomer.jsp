<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <form action="/customer/add" method="post">
      Name:<input type='text' name='cmName'/><br/>
      Phone:<input type='text' name='cmPhone'/><br/>
      <input type='submit' value="add"/>
   </form>
</body>
</html>