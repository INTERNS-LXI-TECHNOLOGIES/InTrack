<%@ page language="java" %>
<%@ page import="org.springframework.web.context.WebApplicationContext" %>
<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<%@ page import="com.divisosoft.springdemo.entity.AdminDashboard" %>
<%@ page import="com.divisosoft.springdemo.repository.AdminDashboardRepository" %>

<html>
<head>
    <title>Create Admin</title>
    <style>
        body {
            background-color: #f9f9f9;
            font-family: 'Arial', sans-serif;
            color: #333;
        }
        form {
            margin: 50px auto;
            width: 300px;
        }
        label {
            font-weight: bold;
        }
        input[type="text"] {
            width: 100%;
            padding: 8px;
            margin: 5px 0;
            border-radius: 4px;
            border: 1px solid #ccc;
        }
        input[type="submit"] {
            background-color: #DC143C;
            color: white;
            border: none;
            padding: 10px;
            width: 100%;
            cursor: pointer;
            border-radius: 4px;
        }
        input[type="submit"]:hover {
            background-color: #B22222;
        }
    </style>
</head>
<body>
    <h1 style="text-align: center;">Create New Admin</h1>

    <form method="post" action="createAdmin.jsp">
        <label for="firstName">Admin Name:</label>
        <input type="text" name="adminName" id="firstName" /><br/>
        <label for="role">Role:</label>
        <input type="text" name="role" id="role" /><br/>
        <input type="submit" value="Save admin" />
    </form>

    <%
        if (request.getMethod().equalsIgnoreCase("POST")) {
            WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(application);
            AdminDashboardRepository adminRep = (AdminDashboardRepository) context.getBean("adminDashboardRepository");

            String adminName = request.getParameter("adminName");
            String role = request.getParameter("role");

            if (adminName != null && role != null && !adminName.isEmpty() && !role.isEmpty()) {
                AdminDashboard admin = new AdminDashboard(adminName, role);
                adminRep.save(admin);
                out.println("<p style='text-align: center; color: #228B22;'>Successfully Saved: " + admin.getAdminName() + " (" + admin.getRole() + ")</p>");
            } else {
                out.println("<p style='text-align: center; color: #B22222;'>Please fill in all fields.</p>");
            }
        }
    %>
</body>
</html>
