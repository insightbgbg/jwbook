<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<thead>
		</thead>
		<tbody>
		
			<% 
				String[] mlist = {"A","B","C"};
			%>
			<% 
				for (String name : mlist) {
			%>
		
			<tr>
				<td><%= name %></td>

			</tr>
			<% } %>
		
		</tbody>
		
	</table>

	<table>
		<thead>
		</thead>
		<tbody>
		
			<% 
				String[] mlist2 = {"A","B","C"};
			%>
			<c:forEach var ="m" items = "${mlist2}">
			<tr>
				<td>${m}</td>
			</tr>
			</c:forEach>
			
		</tbody>
		
	</table>
	
	
</body>
</html>