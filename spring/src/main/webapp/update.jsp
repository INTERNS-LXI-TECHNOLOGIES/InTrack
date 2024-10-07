<%@ page language="java" %>
<%@ page import="org.springframework.web.context.WebApplicationContext" %>
<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<%@ page import="com.lxi.model.User" %>
<%@ page import="com.lxi.model.UserRepository" %>

<html>
    <head>
        <title>Update User</title>
        <style>
            body {
                font-family: Arial, sans-serif;
                background-color: #f4f4f4;
                display: flex;
                justify-content: center;
                align-items: center;
                height: 100vh;
                margin: 0;
            }
            .form-container {
                background-color: #fff;
                padding: 20px;
                border-radius: 8px;
                box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
                width: 300px;
            }
            h2 {
                text-align: center;
                color: #333;
                margin-bottom: 20px;
            }
            label {
                display: block;
                margin-bottom: 8px;
                font-weight: bold;
            }
            input[type="text"], input[type="password"] {
                width: 100%;
                padding: 8px;
                margin-bottom: 12px;
                border: 1px solid #ccc;
                border-radius: 4px;
                box-sizing: border-box;
            }
            input[type="submit"] {
                width: 100%;
                background-color: #4CAF50;
                color: white;
                padding: 10px;
                border: none;
                border-radius: 4px;
                cursor: pointer;
                font-size: 16px;
            }
            input[type="submit"]:hover {
                background-color: #45a049;
            }
            .message {
                text-align: center;
                margin-top: 15px;
                font-size: 14px;
            }
        </style>
    </head>
    <body>
        <div class="form-container">
            <h2>Update User</h2>
            <form action="update.jsp" method="post">
                <label for="id">Enter the id</label>
                <input type="text" name="id" required>

                <label for="name">Enter the new name</label>
                <input type="text" name="name">

                <label for="email">Enter the new email</label>
                <input type="text" name="email">

                <label for="password">Enter the new password</label>
                <input type="password" name="pass">

                <input type="submit" value="Update">
            </form>

            <%
                if(request.getMethod().equalsIgnoreCase("POST")) 
                {
                    WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(application);
                    UserRepository userrepo = (UserRepository) context.getBean("userRepository");

                    long id = Long.parseLong(request.getParameter("id"));
                    String newName = request.getParameter("name");
                    String newEmail = request.getParameter("email");
                    String newPass = request.getParameter("pass");

                    User user = userrepo.findById(id).orElse(null);

                    if(user != null) {
                        if(newName != null && !newName.isEmpty()) 
                        {
                            user.setName(newName);
                        }
                        if(newEmail != null && !newEmail.isEmpty()) 
                        {
                            user.setEmail(newEmail);
                        }
                        if(newPass != null && !newPass.isEmpty()) 
                        {
                            user.setPassword(newPass); 
                        }

                        userrepo.save(user);

                        out.println("<p class='message' style='color: #228B22;'>Successfully Updated</p>");
                        out.println("<p class='message'>Updated Name: " + user.getName() + "</p>");
                        out.println("<p class='message'>Updated Email: " + user.getEmail() + "</p>");
                    } 
                    else 
                    {
                        out.println("<p class='message' style='color: #B22222;'>User not found!</p>");
                    }
                }
            %>
        </div>
    </body>
</html>
