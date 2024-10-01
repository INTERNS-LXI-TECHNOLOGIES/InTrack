<%@ page language="java" %>
<%@ page import="org.springframework.web.context.WebApplicationContext" %>
<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<%@ page import="com.lxi.demo.*" %>
<%@ page import="java.util.List" %>

<html>
<head>
    <title>Create Reward</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f5f5f5;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        form {
            background-color: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            width: 300px;
        }
        label {
            display: block;
            margin-bottom: 8px;
            font-weight: bold;
        }
        input[type="text"] {
            width: 100%;
            padding: 8px;
            margin-bottom: 12px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }
        input[type="submit"] {
            width: 100%;
            padding: 10px;
            background-color: #0073e6;
            color: white;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            font-size: 16px;
        }
        input[type="submit"]:hover {
            background-color: #005bb5;
        }
        p {
            text-align: center;
            font-size: 14px;
        }
    </style>
</head>
<body>
    <form method="post" action="createreward.jsp">
        <label for="Rewardname">Reward Name:</label>
        <input type="text" name="Rewardname" id="Rewardname" required/><br/>
        
        <label for="Rewardpoints">Reward Points:</label>
        <input type="text" name="Rewardpoints" id="Rewardpoints" required/><br/>
        
        <input type="submit" value="Save Reward" />
    </form>

    <%
    if (request.getMethod().equalsIgnoreCase("POST")) {
        WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
        RewardRepository rwdRep = context.getBean(RewardRepository.class); // Fetch by type
        
        String points = request.getParameter("Rewardpoints");
        String name = request.getParameter("Rewardname");

        if (points != null && name != null) {
            Reward rwd = new Reward();
            rwd.setRewardname(name);
            rwd.setRewardpoints(points);
            rwdRep.save(rwd);
            out.println("<p style='color: #228B22;'>Successfully Saved: " + rwd.getRewardname() + " (" + rwd.getRewardpoints() + " points)</p>");
        } else {
            out.println("<p style='color: #B22222;'>Please fill in all fields.</p>");
        }
    }
    %>
</body>
</html>
