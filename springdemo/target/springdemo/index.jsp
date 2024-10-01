<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Dashboard</title>

    <!-- Alternative styling for vertical buttons -->
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #e9ecef;
            color: #333;
        }

        nav {
            background-color: #007bff;
            padding: 2rem;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            display: flex;
            flex-direction: column; /* Makes the links stack vertically */
            align-items: center;    /* Centers the buttons horizontally */
            gap: 20px;              /* Adds space between the buttons */
        }

        nav a {
            color: #fff;
            text-decoration: none;
            padding: 10px 40px;
            background-color: #0056b3;
            border-radius: 25px;
            transition: background-color 0.3s ease, transform 0.2s;
            font-size: 1.2rem;
            font-weight: 500;
            width: 200px;           /* Ensures all buttons have the same width */
            text-align: center;     /* Centers the text inside the button */
        }

        nav a:hover {
            background-color: #0069d9;
            transform: scale(1.05);
        }

        nav a.active {
            background-color: #28a745;
        }

        /* Optional styling for the body */
        body {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
    </style>
</head>
<body>

    <nav>
        <a href="createadmin.jsp">Create Admin</a>
        <a href="viewadmin.jsp">View Admin Data</a>
        <a href="updateadmin.jsp">Update Admin</a>
        <a href="deleteadmin.jsp">Delete Admin Data</a>
    </nav>

</body>
</html>
