<%@ page import="com.lxi.entity.*" %>
<%@ page import="com.lxi.repository.*" %>
<%@ page import="org.springframework.web.context.WebApplicationContext" %>
<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Update Admin</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            text-align: center;
            background-color: #f4f4f4;
            margin: 0;
            padding: 20px;
        }
        h1 {
            color: #333;
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
        label {
            display: block;
            margin-bottom: 8px;
            font-weight: bold;
        }
        input[type="number"], input[type="text"], input[type="submit"] {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-sizing: border-box;
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
            margin-top: 20px;
        }
    </style>
</head>
<body>
    <h1>Update Admin</h1>

    <form method="post" action="updateadmin.jsp">
        <label for="id">Employee ID:</label>
        <input type="number" name="id" id="id" required />
        
        <label for="Name">New Name:</label>
        <input type="text" name="Name" id="Name" />
        
        <label for="email">New Email:</label>
        <input type="text" name="email" id="email" />
        
        <input type="submit" value="Update Employee" />
    </form>

    <%
        if (request.getMethod().equalsIgnoreCase("POST")) {
            WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(application);
            AdminRepo adminRepo = (AdminRepo) context.getBean("adminRepo");

            long id = Long.parseLong(request.getParameter("id"));
            String newName = request.getParameter("Name");
            String newEmail = request.getParameter("email");

            Admin admin = adminRepo.findById(id).orElse(null);

            if (admin != null) {
                
                if (newName != null && !newName.isEmpty()) {
                    admin.setAdminName(newName);
                }
                
                if (newEmail != null && !newEmail.isEmpty()) {
                    admin.setEmail(newEmail);
                }

                adminRepo.save(admin);
                out.println("<p style='color: #228B22;'>Successfully Updated: " + admin.getAdminName() + " (" + admin.getEmail() + ")</p>");
            } 
            else {
                out.println("<p style='color: #B22222;'>Employee not found!</p>");
            }
        }
    %>
</body>
</html>
