<%@ page language="java" %>
<%@ page import="org.springframework.web.context.WebApplicationContext" %>
<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<%@ page import="com.divisosoft.reward.*" %>
<%@ page import="java.util.List" %>



<html>
<head>
    <title>View Rewards</title>
    <style>
        body {
            background-color: #f9f9f9;
            font-family: 'Arial', sans-serif;
            color: #333;
        }
        table {
            width: 60%;
            margin: 50px auto;
            border-collapse: collapse;
            text-align: center;
        }
        th, td {
            padding: 10px;
            border: 1px solid #ccc;
        }
        th {
            background-color: #DC143C;
            color: white;
        }
    </style>
</head>
<body>
    <h1 style="text-align: center;">All Rewards</h1>

   <table>
    <thead>
        <tr>
            <th>ID</th>
            <th>RewardName</th>
            <th>RewardPoints</th>
            
        </tr>
    </thead>
    <tbody>
        <%
        WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(application);
        RewardRepository rewardrepo = (RewardRepository) context.getBean("rewardRepository");

        List<Reward> rewards = rewardrepo.findAll();

        if (rewards != null && !rewards.isEmpty()) {
            for (Reward r : rewards) {
                out.println("<tr><td>" + r.getId() + "</td><td>" + r.getRewardName() + "</td><td>" + r.getRewardPoints() + "</td></tr>");
            }
        } else {
            out.println("<tr><td colspan='3'>No Records found.</td></tr>");
        }
    %>
</tbody>
</table>
</body>
</html>
