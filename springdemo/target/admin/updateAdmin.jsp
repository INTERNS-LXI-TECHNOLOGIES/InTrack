<%@ page language="java" %>
<%@ page import="org.springframework.web.context.WebApplicationContext" %>
<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<%@ page import="com.divisosoft.springdemo.entity.AdminDashboard" %>
<%@ page import="com.divisosoft.springdemo.repository.AdminDashboardRepository" %>

<html>
<head>
    <title>Update Admin</title>
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
        input[type="text"], input[type="number"] {
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
    <h1 style="text-align: center;">Update Admin</h1>

    <form method="post" action="updateAdmin.jsp">
        <label for="id">Admin ID:</label>
        <input type="number" name="id" id="id" required /><br/>
        
        <label for="adminName">New Admin Name:</label>
        <input type="text" name="adminName" id="adminName" /><br/>
        
        <label for="role">New Role:</label>
        <input type="text" name="role" id="role" /><br/>
        
        <input type="submit" value="Update Admin" />
    </form>

    <%
        if (request.getMethod().equalsIgnoreCase("POST")) {
            WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(application);
            AdminDashboardRepository adminRep = (AdminDashboardRepository) context.getBean("adminDashboardRepository");

            long id = Long.parseLong(request.getParameter("id"));
            String newAdminName = request.getParameter("adminName");
            String newRole = request.getParameter("role");

            AdminDashboard admin = adminRep.findById(id).orElse(null);

            if (admin != null) {
                if (newAdminName != null && !newAdminName.isEmpty()) {
                    admin.setAdminName(newAdminName);
                }
                if (newRole != null && !newRole.isEmpty()) {
                    admin.setRole(newRole);
                }

                adminRep.save(admin);
                out.println("<p style='text-align: center; color: #228B22;'>Successfully Updated: " + admin.getAdminName() + " (" + admin.getRole() + ")</p>");
            } else {
                out.println("<p style='text-align: center; color: #B22222;'>Admin not found!</p>");
            }
        }
    %>
</body>
</html>
