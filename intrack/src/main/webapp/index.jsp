<%@ page import="org.springframework.web.context.WebApplicationContext" %>
<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<%@ page import="com.divisosoft.intrackapp.model.*" %>
<%@ page import="com.divisosoft.intrackapp.repository.*" %>

<html>
<body>
    <a href="create.html">Create Reward</a>
    <a href="read.html">Read Reward</a>
    <a href="update.html">Update Reward</a>
    <a href="delete.html">Delete Reward</a>

    <%
        WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(application);
        RewardRepository rewardRepo = (RewardRepository) context.getBean("rewardRepository");

        Reward bonus = new Reward();
        bonus.setName("Bonus");
        rewardRepo.save(bonus);

        Reward ticket = new Reward();
        ticket.setName("Ticket");
        rewardRepo.save(ticket);
    %>
</body>
</html>
