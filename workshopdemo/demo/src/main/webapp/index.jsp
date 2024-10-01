<html>
<head>
    <title>Welcome Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f8ff;
            color: #333;
            margin: 0;
            padding: 0;
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            height: 100vh;
        }
        h1 {
            color: #0073e6;
            font-size: 36px;
        }
        nav {
            margin-top: 20px;
        }
        nav a {
            text-decoration: none;
            background-color: #0073e6;
            color: white;
            padding: 10px 20px;
            margin: 0 10px;
            border-radius: 5px;
            transition: background-color 0.3s ease;
        }
        nav a:hover {
            background-color: #005bb5;
        }
    </style>
</head>
<body>
    <h1>Welcome to the Reward Page</h1>

    <nav>
        <a href="createreward.jsp">Create Reward</a>
        <a href="readreward.jsp">Read Reward</a>
        <a href="updatereward.jsp">Update Reward</a>
        <a href="deletereward.jsp">Delete Reward</a>
    </nav>
</body>
</html>
