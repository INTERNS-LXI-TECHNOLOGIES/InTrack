<%

String username=(String) request.getAttribute("username");
%>
<html>
<head>
    <title>Welcome Page</title>
</head>
<body>
    <h2>Welcome, <%= username %></h2>
</body>
</html>