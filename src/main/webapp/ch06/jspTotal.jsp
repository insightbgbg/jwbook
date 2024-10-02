<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>
		<%!String[] members = { "가", "나", "다", "라" };

	int num1 = 10;

	int calc(int num2) {
		return num1 + num2;
	}%>

		<%=num1%>
		<%=calc(100)%>

		<ul>
			<%
			for (String name : members) {
			%>
			<li><h2><%=name%></h2></li>
			<%
			}
			%>
		</ul>

	</h3>

	<!-- include 지시어 -->
	<%@ include file="../hello.jsp"%>

	<!-- script 지시어 -->
	<%
	
	
	%>

</body>
</html>