<%@ page language="java" %>
<%@ page import="org.springframework.web.context.WebApplicationContext" %>
<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<%@ page import="com.lxi.intrackdemo.*" %>
<html>
    <head>
        <title>delete page</title>
    </head>
    <body>
        <form action="delete.jsp" method="post">
            <label>enter the id which you want to delete</label>
            <input type="text" name="id">
            <input type="submit" value="delete">
        </form>
        <%
            WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(application);
            ProjectRepository pr =(ProjectRepository) context.getBean("projectRepository");

            if(request.getMethod().equalsIgnoreCase("post")){
                long id = Long.parseLong(request.getParameter("id"));
                Project delProject =pr.findById(id).orElse(null);
                
                if(delProject!=null){
                    pr.delete(delProject);
                    out.println("<p>deleted Successfully"+delProject.getProjectName()+"</p>");
                }
                else{
                    out.println("<p>project not found</p>");
                }
            }
        %>
    </body>
</html>