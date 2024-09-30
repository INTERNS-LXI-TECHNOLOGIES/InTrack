<%@ page language="java" %>
<%@ page import="org.springframework.web.context.WebApplicationContext" %>
<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<%@ page import="com.divisosoft.springdemo.entity.AdminDashboard" %>
<%@ page import="com.divisosoft.springdemo.repository.AdminDashboardRepository" %>
<%@ page import="java.util.List" %>

<html>
<head>
    <title>View Admins</title>
    <style>
        body {
            background-color: #f9f9f9;
            font-family: 'Arial', sans-serif;
            color: #333;
        }
        table {
            width: 60%;
            margin: 50px auto;
            border-collapse: collapse;
            text-align: center;
        }
        th, td {
            padding: 10px;
            border: 1px solid #ccc;
        }
        th {
            background-color: #DC143C;
            color: white;
        }
    </style>
</head>
<body>
    <h1 style="text-align: center;">All Admins</h1>

    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Admin Name</th>
                <th>Role</th>
            </tr>
        </thead>
        <tbody>
            <%
                WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(application);
                AdminDashboardRepository adminRep = (AdminDashboardRepository) context.getBean("adminDashboardRepository");

                List<AdminDashboard> admins = adminRep.findAll();

                if (admins != null && !admins.isEmpty()) {
                    for (AdminDashboard admin : admins) {
                        out.println("<tr><td>" + admin.getId() + "</td><td>" + admin.getAdminName() + "</td><td>" + admin.getRole() + "</td></tr>");
                    }
                } else {
                    out.println("<tr><td colspan='3'>No admins found.</td></tr>");
                }
            %>
        </tbody>
    </table>
</body>
</html>
