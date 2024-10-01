<%@ page import="com.lxi.entity.*" %>
<%@ page import="com.lxi.repository.*" %>
<%@ page import="org.springframework.web.context.WebApplicationContext" %>
<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Delete Admin</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            text-align: center;
            background-color: #f4f4f4;
            margin: 0;
            padding: 20px;
        }
        form {
            margin: 20px auto;
            max-width: 300px;
            padding: 20px;
            background-color: white;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
        }
        input[type="number"], input[type="submit"] {
            display: block;
            width: 100%;
            margin: 10px 0;
            padding: 10px;
            box-sizing: border-box;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        label {
            font-weight: bold;
            display: block;
            margin-bottom: 5px;
        }
        input[type="submit"] {
            background-color: #d9534f;
            color: white;
            border: none;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background-color: #c9302c;
        }
        p {
            font-size: 1.1em;
        }
    </style>
</head>
<body>
    <h1>Delete Admin</h1>

    <form method="post" action="deleteadmin.jsp">
        <label for="id">Admin ID:</label>
        <input type="number" name="id" id="id" required />
        
        <input type="submit" value="Delete Admin" />
    </form>

    <%
        if (request.getMethod().equalsIgnoreCase("POST")) {
            WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(application);
            AdminRepo adminRepo = (AdminRepo) context.getBean("adminRepo");

            long id = Long.parseLong(request.getParameter("id"));
            Admin admin = adminRepo.findById(id).orElse(null);

            if (admin != null) {
                adminRepo.delete(admin);
                out.println("<p style='color: #228B22;'>Successfully Deleted: " + admin.getAdminName() + "</p>");
            } 
            else {
                out.println("<p style='color: #B22222;'>Admin not found!</p>");
            }
        }
    %>
</body>
</html>
