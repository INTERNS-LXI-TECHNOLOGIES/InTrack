<%@ page language="java" %>
<%@ page import="org.springframework.web.context.WebApplicationContext" %>
<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<%@ page import="com.divisosoft.reward.*" %>

<html>
<head>
    <title>Delete Reward</title>
    <style>
        body {
            background-color: #f9f9f9;
            font-family: 'Arial', sans-serif;
            color: #333;
        }
        form {
            margin: 50px auto;
            width: 300px;
        }
        label {
            font-weight: bold;
        }
        input[type="number"] {
            width: 100%;
            padding: 8px;
            margin: 5px 0;
            border-radius: 4px;
            border: 1px solid #ccc;
        }
        input[type="submit"] {
            background-color: #DC143C;
            color: white;
            border: none;
            padding: 10px;
            width: 100%;
            cursor: pointer;
            border-radius: 4px;
        }
        input[type="submit"]:hover {
            background-color: #B22222;
        }
    </style>
</head>
<body>
    <h1 style="text-align: center;">Delete Reward</h1>
    <form method="post" action="deleteReward.jsp">
        <label for="id">Reward ID:</label>
        <input type="number" name="id" id="id" required /><br/>
        <input type="submit" value="Delete Reward" />
    </form>
    <%
    if(request.getMethod().equalsIgnoreCase("POST")){
        WebApplicationContext context=WebApplicationContextUtils.getWebApplicationContext(application);
        RewardRepository rewardrepo=(RewardRepository)context.getBean("rewardRepository");

        long id = Long.parseLong(request.getParameter("id"));
        Reward r = rewardrepo.findById(id).orElse(null);

        if (r != null) {
            rewardrepo.delete(r);
            out.println("<p style='text-align: center; color: #228B22;'>Successfully Deleted: " + r.getRewardName() + " " + r.getRewardPoints() + "</p>");
        } else {
            out.println("<p style='text-align: center; color: #B22222;'>Reward not found!</p>");
        }
    }
%>
</body>
</html>
