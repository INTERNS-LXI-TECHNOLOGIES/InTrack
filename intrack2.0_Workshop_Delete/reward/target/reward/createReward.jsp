<%@ page language="java" %>
<%@ page import="org.springframework.web.context.WebApplicationContext" %>
<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<%@ page import="com.divisosoft.reward.*" %>

<html>
<head>
    <title>Create Employee</title>
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
        input[type="text"] {
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
    <h1 style="text-align: center;">Create New Employee</h1>

    <form action="createReward.jsp" method="post">
    <label for="rewardname">Reward Name:</label>
    <input type="text" name="rewardname" id="rewardname"></br>
    <label for="rewardpoints">Reward Points:</label>
    <input type="text" name="rewardpoints" id="rewardpoints"><br/>

    <input type="submit" value="Save Reward">
</form>
<%

    if(request.getMethod().equalsIgnoreCase("POST")){
        WebApplicationContext context=WebApplicationContextUtils.getWebApplicationContext(application);
        RewardRepository rewardrepo=(RewardRepository) context.getBean("rewardRepository");
        
        String rewardname=request.getParameter("rewardname");
        String rewardpoints=request.getParameter("rewardpoints");

        if( rewardpoints!=null && rewardpoints!=null){
            Reward reward=new Reward(rewardname,rewardpoints);
            rewardrepo.save(reward);
            out.println("<p style='text-align: center; color: #228B22;'>Successfully Saved: " + reward.getRewardName() + " " + reward.getRewardPoints() + "</p>");
        } else {
            out.println("<p style='text-align: center; color: #B22222;'>Please fill in all fields.</p>");
        }
    }
%>
</body>
</html>

        

    