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
	
	int n1 = Integer.parseInt(request.getParameter("n1"));
	System.out.print(n1);

	int n2 = Integer.parseInt(request.getParameter("n2"));
	System.out.print(n2);

	int op = Integer.parseInt(request.getParameter("op"));
	System.out.print(op);
	
	response.setContentType("text/html; charset=utf-8");
	response.getWriter()
	.append("" +  n1)
	.append("" +  n2)
	.append("" +  op)		
	.append(request.getContextPath());	


%>
</body>
</html>