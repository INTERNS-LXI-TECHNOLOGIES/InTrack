<%@ page import="com.lxi.entity.*" %>
<%@ page import="com.lxi.repository.*" %>
<%@ page import="org.springframework.web.context.WebApplicationContext" %>
<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<%@ page import="com.lxisoft.utils.MD5HashingExample" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Create Admin</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            text-align: center;
        }
        form {
            margin: 20px auto;
            max-width: 300px;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        input[type="text"], input[type="email"], input[type="password"], input[type="submit"] {
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
            background-color: #4CAF50;
            color: white;
            border: none;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background-color: #45a049;
        }
        p {
            font-size: 1.1em;
        }
    </style>
</head>
<body>
    <h1>Create Admin</h1>

    <form method="post" action="createadmin.jsp">
        <label for="Name">Name:</label>
        <input type="text" name="Name" id="Name" required />
        
        <label for="email">Email:</label>
        <input type="email" name="email" id="email" required />
        
        <label for="password">Password:</label>
        <input type="password" name="password" id="password" required />

        <input type="submit" value="Save Admin Details" />
    </form>

    <%
        if (request.getMethod().equalsIgnoreCase("POST")) {
            WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(application);
            AdminRepo adminRepo = (AdminRepo) context.getBean("adminRepo");

            String adminName = request.getParameter("Name");
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            String hashpass = MD5HashingExample.hashWithMD5(password);


            if (adminName != null && email != null && hashpass != null) {
                Admin admin = new Admin(adminName, email, hashpass);
                adminRepo.save(admin);
                out.println("<p style='color: #228B22;'>Successfully Saved: " + admin.getAdminName() + "</p>");
            } 
            else {
                out.println("<p style='color: #B22222;'>Please fill in all fields.</p>");
            }
        }
    %>
</body>
</html>
