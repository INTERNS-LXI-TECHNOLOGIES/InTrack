<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome to Intrack</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
            text-align: center;
        }
        .container {
            padding: 50px;
            margin: 0 auto;
            max-width: 800px;
            background-color: white;
            box-shadow: 0px 0px 15px rgba(0, 0, 0, 0.1);
        }
        h1 {
            color: #4CAF50;
            margin-bottom: 40px;
        }
        a {
            display: inline-block;
            margin: 10px 20px;
            padding: 15px 25px;
            background-color: #4CAF50;
            color: white;
            text-decoration: none;
            font-size: 18px;
            border-radius: 5px;
            transition: background-color 0.3s ease;
        }
        a:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Welcome to Intrack</h1>
        <a href="create.jsp">Create</a>
        <a href="read.jsp">Read</a>
        <a href="update.jsp">Update</a>
        <a href="delete.jsp">Delete</a>
    </div>
</body>
</html>
