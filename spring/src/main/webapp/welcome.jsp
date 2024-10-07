<html>
    <head>
        <title>Welcome Page</title>
        <style>
            body {
                font-family: Arial, sans-serif;
                background-color: #f0f8ff;
                display: flex;
                flex-direction: column;
                justify-content: center;
                align-items: center;
                height: 100vh;
                margin: 0;
            }
            h1 {
                color: #333;
            }
            .menu {
                display: flex;
                flex-direction: column;
                align-items: center;
            }
            a {
                margin: 10px 0;
                text-decoration: none;
                font-size: 18px;
                color: white;
                background-color: #007bff;
                padding: 10px 20px;
                border-radius: 5px;
                transition: background-color 0.3s ease;
            }
            a:hover {
                background-color: #0056b3;
            }
        </style>
    </head>
    <body>
        <h1>Welcome to User Management</h1>
        <div class="menu">
            <a href="create.jsp">Create User</a>
            <a href="read.jsp">Read User</a>
            <a href="update.jsp">Update User</a>
            <a href="delete.jsp">Delete User</a>
        </div>
    </body>
</html>
