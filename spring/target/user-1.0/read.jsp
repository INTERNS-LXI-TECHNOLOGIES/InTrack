<%@ page language ="java" %>
<%@ page import ="org.springframework.web.context.WebApplicationContext" %>
<%@ page import ="org.springframework.web.context.support.WebApplicationContextUtils" %>
<%@ page import ="com.lxi.model.User" %>
<%@ page import ="com.lxi.model.UserRepository" %>
<%@ page import ="java.util.List" %>

<html>
    <head>
        <title>Show Users</title>
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
            table {
                width: 80%;
                border-collapse: collapse;
                margin: 20px 0;
                background-color: white;
                box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            }
            th, td {
                padding: 12px;
                text-align: center;
                border: 1px solid #ddd;
            }
            th {
                background-color: #007bff;
                color: white;
            }
            tr:nth-child(even) {
                background-color: #f9f9f9;
            }
            tr:hover {
                background-color: #f1f1f1;
            }
            h2 {
                text-align: center;
                color: #333;
            }
        </style>
    </head>
    <body>
        <div>
            <h2>User List</h2>
            <table border="1">
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Email</th>
                    <th>Password</th>
                </tr>
                <%
                    WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(application);
                    UserRepository userRepo = (UserRepository) context.getBean("userRepository");

                    List<User> users = userRepo.findAll();
                    if (users != null && !users.isEmpty()) 
                    {
                        for (User user : users) 
                        {
                %>
                            <tr>
                                <td><%= user.getId() %></td>
                                <td><%= user.getName() %></td>
                                <td><%= user.getEmail() %></td>
                                <td><%= user.getPassword() %></td>
                            </tr>
                <%
                        }
                    } 
                    else 
                    {
                %>
                    <tr><td colspan="4">No users found</td></tr>
                <%
                    }
                %>
            </table>
        </div>
    </body>
</html>
