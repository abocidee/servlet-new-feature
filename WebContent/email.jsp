<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%  
   Integer sum = (Integer)session.getAttribute("sum");
   if(sum==45){
	   out.print("regist successful");
   }
   else{
	   out.print("regist failed ");
   }
%>

</body>
</html>