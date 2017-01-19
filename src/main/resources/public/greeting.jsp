<!DOCTYPE HTML>
<%@ page import = "java.util.*" %>
<html>
<head> 
    <title>Getting Started: Serving Web Content</title> 
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<title>
greeting.html
</title>
<body>
Hello, <% request.getParameter("name") %>!
</body>
</html>
