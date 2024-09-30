<%@ page language="java" %>
<%@ page import="org.springframework.web.context.WebApplicationContext" %>
<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<%@ page import="com.lxi.intrackdemo.*" %>
<html>
    <head>
        <title>updating page</title>
    </head>
    <body>

        <form action="update.jsp" method="post">
            <label>enter the new project id :</label>
            <input type="text" name="id" required>
            <label>enter the project name :</label>
            <input type="text" name="projectNewName">
            <label>enter the new rating :</label>
            <input type="text" name="newRating">
            <input type="submit" value="update">
        </form>

        <%
            if(request.getMethod().equalsIgnoreCase("post")){
                WebApplicationContext context=WebApplicationContextUtils.getWebApplicationContext(application);
                ProjectRepository ps = (ProjectRepository) context.getBean("projectRepository");

                long id = Long.parseLong(request.getParameter("id"));
                String name = request.getParameter("projectNewName");
                Long rating = Long.parseLong(request.getParameter("newRating"));

                Project myProject = ps.findById(id).orElse(null);
                if(myProject!=null){
                    if(!name.isEmpty()){
                        myProject.setProjectName(name);
                    }
                    if(rating!=null){
                        myProject.setRating(rating);
                    }
                    ps.save(myProject);
                    out.println("<p style='text-align: center; color: #228B22;'>Successfully Updated: " + myProject.getProjectName() + " " + myProject.getRating() + "</p>");
                }
                else{
                    out.println("<p style='text-align: center; color: #228B22;'>no project found in this id</p>");
                }
            }
        %>
    </body>
</html>