<%@ page language="java" %>
<%@ page import="org.springframework.web.context.WebApplicationContext" %>
<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<%@ page import="com.lxi.demo.*" %>
<%@ page import="java.util.List" %>

<html>
<head>
    <title>Read Reward</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f8ff;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        table {
            border-collapse: collapse;
            width: 60%;
            margin-top: 20px;
            background-color: #fff;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }
        th, td {
            padding: 12px 15px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }
        th {
            background-color: #0073e6;
            color: white;
        }
        tr:nth-child(even) {
            background-color: #f2f2f2;
        }
        tr:hover {
            background-color: #f5f5f5;
        }
        td {
            font-size: 16px;
        }
        thead {
            font-size: 18px;
        }
        tbody tr:last-child td {
            border-bottom: none;
        }
    </style>
</head>
<body>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Reward Name</th>
                <th>Reward Points</th>
            </tr>
        </thead>
        <tbody>
<%
    WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
    RewardRepository rwdRep = context.getBean(RewardRepository.class); // Fetch by type

    List<Reward> rwd = rwdRep.findAll();

    if (rwd != null && !rwd.isEmpty()) {
        for (Reward rewd : rwd) {
            out.println("<tr><td>" + rewd.getId() + "</td><td>" + rewd.getRewardname() + "</td><td>" + rewd.getRewardpoints() + "</td></tr>");
        }
    } else {
        out.println("<tr><td colspan='3'>No reward found.</td></tr>");
    }
%>
        </tbody>
    </table>
</body>
</html>
