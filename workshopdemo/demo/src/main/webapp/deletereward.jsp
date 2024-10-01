<%@ page language="java" %>
<%@ page import="org.springframework.web.context.WebApplicationContext" %>
<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<%@ page import="com.lxi.demo.*" %>
<%@ page import="java.util.List" %>

<html>
<head>
    <title>Delete Reward</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f9;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }

        h1 {
            text-align: center;
            color: #dc3545;
        }

        form {
            background-color: white;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            padding: 20px;
            width: 300px;
        }

        label {
            display: block;
            font-weight: bold;
            margin-bottom: 5px;
        }

        input[type="text"],
        input[type="number"] {
            width: 100%;
            padding: 8px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }

        input[type="submit"] {
            width: 100%;
            background-color: #dc3545;
            color: white;
            padding: 10px;
            border: none;
            border-radius: 5px;
            font-size: 16px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #c82333;
        }

        p {
            text-align: center;
            font-size: 16px;
        }
    </style>
</head>
<body>

    <h1>Delete Reward</h1>

    <form method="post" action="deletereward.jsp">
        <label for="id">Reward ID:</label>
        <input type="number" name="id" id="id" required /><br/>
        <input type="submit" value="Delete Reward" />
    </form>

    <%
    if (request.getMethod().equalsIgnoreCase("POST")) {
        WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
        RewardRepository rwdRep = context.getBean(RewardRepository.class); // Fetch by type

        long id = Long.parseLong(request.getParameter("id"));
        Reward rwd = rwdRep.findById(id).orElse(null);

        if (rwd != null) {
            rwdRep.delete(rwd);
            out.println("<p style='text-align: center; color: #228B22;'>Successfully Deleted: " + rwd.getRewardname() + " " + rwd.getRewardpoints() + "</p>");
        } else {
            out.println("<p style='text-align: center; color: #B22222;'>Reward not found!</p>");
        }
    }
    %>

</body>
</html>
