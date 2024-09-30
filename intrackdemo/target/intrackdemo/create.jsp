<%@ page language="java" %>
<%@ page import="org.springframework.web.context.WebApplicationContext" %>
<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<%@ page import="com.lxi.intrackdemo.*" %>
<html>
    <head><title>create page</title></head>

<body>
    <form action="create.jsp" method="post">
        <label>enter the project name :</label>
        <input type="text" name="projectName"><br><br>
        <label>enter the project rating :</label>
        <input type="text" name="projectRating"><br><br>
        <input type="submit" value="CREATE">
    </form>

    <%
        if (request.getMethod().equalsIgnoreCase("POST")) {
            WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(application);
            ProjectRepository pr = (ProjectRepository) context.getBean("projectRepository");

            String projectName = request.getParameter("projectName");
            Long projectRating = Long.parseLong(request.getParameter("projectRating"));

            if(projectName != null && projectRating != null){
                Project project = new Project();
                project.setProjectName(projectName);
                project.setRating(projectRating);
                pr.save(project);
                out.println("<p style='text-align: center; color: #228B22;'>Successfully Saved: " + project.getProjectName() + " " + project.getRating() + "</p>");

            }
            else{
                out.println("<p style='text-align: center; color: #B22222;'>Please fill in all fields.</p>");

            }
        }
    %>        
</body>
</html>