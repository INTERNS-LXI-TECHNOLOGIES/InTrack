<%@ page language="java" %>
<%@ page import="org.springframework.web.context.WebApplicationContext" %>
<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<%@ page import="com.lxi.intrackdemo.*" %>
<%@ page import="java.util.List" %>

<html>
    <head>
        <title>read page</title>
        <style>
            table {
                width: 60%;
                margin: 50px auto;
                border-collapse: collapse;
                text-align: center;
            }
        </style>
    </head>
    <body>
        <table border="1">
            <thead>
                <tr>
                    <th>id</th>
                    <th>project name</th>
                    <th>rating</th>
                </tr>
            </thead>
            <tbody>
                <%
                    WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(application);
                    ProjectRepository projectRepo = (ProjectRepository) context.getBean("projectRepository");

                    List<Project> projects = projectRepo.findAll();
                    if(!projects.isEmpty()){
                        for(Project p : projects){
                            out.println("<tr><td>" +p.getId()+"</td><td>"+ p.getProjectName() + "</td><td>"+ p.getRating() +"</td></tr>");
                        }
                    }
                    else{
                        out.println("<tr><td colspan='3'>NO PROJECTS FOUND</td></tr>");
                    }
                %>
            </tbody>
        </table>
    </body>
</html>