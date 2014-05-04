<%@ page import="java.util.*" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Bierauswahl per JSP</title>
</head>
<body>

<h1 align="center">Bierratgeber: Empfehlung (JSP) </h1>
<p>
<%
	List sorten = (List)request.getAttribute("sorten");
	Iterator it = sorten.iterator();
	while(it.hasNext())
	{
		out.print("<br>Probieren Sie mal: " + it.next());
	}
%>
</body>
</html>