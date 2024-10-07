<%@ page language="java" %>
<%@ page import="org.springframework.web.context.WebApplicationContext" %>
<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<%@ page import="com.lxi.model.*" %>

<html>
    <head>
        <title>Create User</title>
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
            <h2>Create User</h2>
            <form action="create.jsp" method="post">
                <label for="name">User Name:</label>
                <input type="text" name="name" required>

                <label for="email">Email:</label>
                <input type="text" name="email" required>

                <label for="password">Password:</label>
                <input type="password" name="password" required>

                <input type="submit" value="Submit">
            </form>

            <%
                if (request.getMethod().equalsIgnoreCase("POST")) 
                {
                    WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(application);
                    UserRepository userrepo = (UserRepository) context.getBean("userRepository");

                    String name = request.getParameter("name");
                    String email = request.getParameter("email");
                    String password = request.getParameter("password");

                    User user = new User(name, email, password);
                    userrepo.save(user);

                    out.println("<p class='message' style='color: #228B22;'>Successfully Saved:<br>" +
                        "Name: " + user.getName() + "<br>" +
                        "Email: " + user.getEmail() + "<br>" +
                        "Password: " + user.getPassword() + "</p>");
                }
            %>
        </div>
    </body>
</html>
