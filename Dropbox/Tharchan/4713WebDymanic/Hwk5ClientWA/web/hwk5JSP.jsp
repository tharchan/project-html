<%-- 
    Document   : hwk5JSP
    Created on : Mar 5, 2015, 9:35:22 AM
    Author     : Class
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Mortgage Calculator</h1>
        
    <%-- start web service invocation --%><hr/>
    <%
    try {
	serverpackage.Hwk5ServerWS_Service service = new serverpackage.Hwk5ServerWS_Service();
	serverpackage.Hwk5ServerWS port = service.getHwk5ServerWSPort();
        
	 // reading the inputs passed by the HTML form
	int inputLoan = Integer.parseInt(request.getParameter("loanTxtBx"));
	int inputTerm = Integer.parseInt(request.getParameter("termTxtBx"));
	double inputInterest =Double.parseDouble(request.getParameter("interestTxtBx"));
	// TODO process result here
	java.lang.String result = port.hwk5ServerOp(inputLoan, inputTerm, inputInterest);
	out.println(result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    </body>
</html>
