<%@ page language="java" %>
<%@ page import="org.springframework.web.context.WebApplicationContext" %>
<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<%@ page import="com.divisosoft.reward.*" %>


<html>
    <head>
        <title>Update Reward</title>

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
        input[type="text"], input[type="number"] {
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
    <h1 style="text-align: center;">Update Reward</h1>

    <form method="post" action="updateReward.jsp">
        <label for="id">Reward ID:</label>
        <input type="number" name="id" id="id" required /><br/>
        
        <label for="rewardName">New Reward Name:</label>
        <input type="text" name="rewardName" id="rewardName" /><br/>
        
        <label for="rewardpoints">Reward Points:</label>
        <input type="text" name="rewardPoints" id="rewardPoints" /><br/>
        
        <input type="submit" value="Update Reward" />
    </form>
    <%
    if(request.getMethod().equalsIgnoreCase("POST")){
        WebApplicationContext context=WebApplicationContextUtils.getWebApplicationContext(application);
        RewardRepository rewardrepo=(RewardRepository)context.getBean("rewardRepository");

        Long id=Long.parseLong(request.getParameter("id"));
        String rewardName=request.getParameter("rewardName");
        String rewardPoints=request.getParameter("rewardPoints");

        Reward r=rewardrepo.findById(id).orElse(null);

        if(r!=null){
            if(rewardName!=null && !rewardName.isEmpty() ){
                r.setRewardName(rewardName);
            }
            if(rewardPoints!=null && !rewardPoints.isEmpty() ){
                r.setRewardPoints(rewardPoints);
            }

            rewardrepo.save(r);

            out.println("<p style='text-align: center; color: #228B22;'>Successfully Updated: " + r.getRewardName() + " " + r.getRewardPoints() + "</p>");
        } else {
            out.println("<p style='text-align: center; color: #B22222;'>Reward not found!</p>");
        }
    }
%>
</body>
</html>
