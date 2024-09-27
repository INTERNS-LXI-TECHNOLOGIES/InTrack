<%@ page import="java.sql.*" %>
<%@ page import="java.io.*"%>


<html>
<body>

<%

// Database connection details
String url = "jdbc:mysql://localhost:3306/internassist";
String dbusername = "root";
String dbpassword = "root";

// Retrieve form data
String name = request.getParameter("name");
int age=request.getParameter("age");

%>

</body>
</html>
