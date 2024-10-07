<%@ page language="java" %>
<%@ page import="org.springframework.web.context.WebApplicationContext" %>
<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<%@ page import="com.lxi.model.User" %>
<%@ page import="com.lxi.model.UserRepository" %>

<html>
    <head>
        <title>Delete User</title>
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
                text-align: center;
            }
            h2 {
                color: #333;
            }
            label {
                display: block;
                margin-bottom: 8px;
                font-weight: bold;
                text-align: left;
            }
            input[type="number"] {
                width: 100%;
                padding: 8px;
                margin-bottom: 12px;
                border: 1px solid #ccc;
                border-radius: 4px;
                box-sizing: border-box;
            }
            input[type="submit"] {
                width: 100%;
                background-color: #ff4d4d;
                color: white;
                padding: 10px;
                border: none;
                border-radius: 4px;
                cursor: pointer;
                font-size: 16px;
            }
            input[type="submit"]:hover {
                background-color: #e60000;
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
            <h2>Delete User</h2>
            <form action="delete.jsp" method="post">
                <label for="id">Enter User ID</label>
                <input type="number" id="id" name="id" placeholder="Enter User ID" required>

                <input type="submit" value="Delete">
            </form>

            <%
                if (request.getMethod().equalsIgnoreCase("POST")) 
                {
                    WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(application);
                    UserRepository userrepo = (UserRepository) context.getBean("userRepository");

                    long id = Long.parseLong(request.getParameter("id"));

                    User user = userrepo.findById(id).orElse(null);

                    if (user != null) 
                    {
                        userrepo.delete(user);
                        out.println("<p class='message' style='color: #228B22;'>User deleted successfully:<br>" +
                            "Name: " + user.getName() + "<br>" +
                            "Email: " + user.getEmail() + "</p>");
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
