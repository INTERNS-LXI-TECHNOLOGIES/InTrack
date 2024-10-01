<%@ page language="java" %>
<%@ page import="org.springframework.web.context.WebApplicationContext" %>
<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<%@ page import="com.lxi.demo.*" %>
<%@ page import="java.util.List" %>

<html>
<head>
    <title>Update Reward</title>
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
            color: #0073e6;
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
            background-color: #0073e6;
            color: white;
            padding: 10px;
            border: none;
            border-radius: 5px;
            font-size: 16px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #005bb5;
        }

        p {
            text-align: center;
            font-size: 16px;
        }
    </style>
</head>
<body>

    <h1>Update Reward</h1>

    <form method="post" action="updatereward.jsp">
        <label for="id">Reward ID:</label>
        <input type="number" name="id" id="id" required /><br/>

        <label for="Rewardname">New Reward Name:</label>
        <input type="text" name="Rewardname" id="Rewardname" /><br/>

        <label for="Rewardpoints">New Reward Points:</label>
        <input type="text" name="Rewardpoints" id="Rewardpoints" /><br/>

        <input type="submit" value="Update Reward" />
    </form>

    <%
    if (request.getMethod().equalsIgnoreCase("POST")) {
        WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
        RewardRepository rwdRep = context.getBean(RewardRepository.class); // Fetch by type

        long id = Long.parseLong(request.getParameter("id"));
        String newrewardname = request.getParameter("Rewardname");
        String newrewardpoints = request.getParameter("Rewardpoints");

        Reward rwd = rwdRep.findById(id).orElse(null);

        if (rwd != null) {
            if (newrewardname != null && !newrewardname.isEmpty()) {
                rwd.setRewardname(newrewardname);
            }
            if (newrewardpoints != null && !newrewardpoints.isEmpty()) {
                rwd.setRewardpoints(newrewardpoints);
            }

            rwdRep.save(rwd);
            out.println("<p style='text-align: center; color: #228B22;'>Successfully Saved: " + rwd.getRewardname() + " " + rwd.getRewardpoints() + "</p>");
        } else {
            out.println("<p style='text-align: center; color: #B22222;'>Reward not found!</p>");
        }
    }
    %>

</body>
</html>
