<%@ page import="com.lxi.entity.*" %>
<%@ page import="com.lxi.repository.*" %>
<%@ page import="java.util.List" %>
<%@ page import="org.springframework.web.context.WebApplicationContext" %>
<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>All Admins</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            text-align: center;
            background-color: #f4f4f4;
            margin: 0;
            padding: 20px;
        }
        table {
            margin: 20px auto;
            border-collapse: collapse;
            width: 80%;
            background-color: white;
            border-radius: 5px;
            overflow: hidden;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
        }
        th, td {
            border: 1px solid #dddddd;
            padding: 12px;
            text-align: left;
        }
        th {
            background-color: #4CAF50;
            color: white;
        }
        tr:nth-child(even) {
            background-color: #f9f9f9;
        }
        tr:hover {
            background-color: #f1f1f1;
        }
        h1 {
            color: #333;
        }
        p {
            font-size: 1.1em;
            color: #555;
        }
    </style>
</head>
<body>
    <h1>All Admins</h1>

    <table>
        <thead>
            <tr>
                <th>Name</th>
                <th>Email</th>
                <th>Password</th>
            </tr>
        </thead>
        <tbody>
            <%
                WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(application);
                AdminRepo adminRepo = (AdminRepo) context.getBean("adminRepo");

                List<Admin> admins = adminRepo.findAll();

                if (admins != null && !admins.isEmpty()) {
                    
                    for (Admin admin : admins) {
                        out.println("<tr>");
                        out.println("<td>" + admin.getAdminName() + "</td>");
                        out.println("<td>" + admin.getEmail() + "</td>");
                        out.println("<td>" + admin.getPassword() + "</td>");
                        out.println("</tr>");
                    }
                } 
                else {
                    out.println("<tr><td colspan='3'>No admins found</td></tr>");
                }
            %>
        </tbody>
    </table>
</body>
</html>
