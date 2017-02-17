<%@ page contentType="text/html; charset=iso-8859-1" language="java" %>
<%
String userName=request.getParameter("txtName");
String userColor=request.getParameter("color");
String userState=request.getParameter("state");
%>
<!Doctype html>
<html>
	<head>
		<title>Simple Form</title>
		<LINK REL=StyleSheet HREF="css/style.css">
	</head>
	<body>
		Name is <%=userName%> <br>
		Color is <%=userColor%> <br>
		Less visited state is <%=userState%> <br>
	</body>
	
</html>