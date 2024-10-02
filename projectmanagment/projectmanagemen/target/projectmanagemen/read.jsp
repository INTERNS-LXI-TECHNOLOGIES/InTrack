<%@ page language="java" %>
<%@ page import="org.springframework.web.context.WebApplicationContext" %>
<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<%@ page import="com.divisosofttech.db.*" %>
<%@ page import="com.lxi.project.Project" %>
<%@ page import="com.lxi.project.ProjectRepository" %>
<%@ page import="java.util.List" %>

<html>
<head>
    <title>Read Projects</title>
    <style>
        body {
            background-color: #f9f9f9;
            font-family: 'Arial', sans-serif;
            color: #333;
            text-align: center;
        }
        table {
            width: 80%;
            margin: 50px auto;
            border-collapse: collapse;
        }
        table, th, td {
            border: 1px solid #ccc;
            padding: 10px;
        }
        th {
            background-color: #4CAF50;
            color: white;
        }
        td {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
    <h1>Project List</h1>

    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Description</th>
                <th>Start Date</th>
                <th>End Date</th>
            </tr>
        </thead>
        <tbody>
            <%
            WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(application);
            ProjectRepository projectRepo = (ProjectRepository) context.getBean("projectRepository");



                List<Project> projects = projectRepo.findAll();
                if (projects != null && !projects.isEmpty()) {
                    for (Project p : projects) {
                        out.println("<tr><td>" + p.getId() + "</td><td>" + p.getName() + "</td><td>" + p.getDescription() + "</td><td>" + p.getStartDate() + "</td><td>" + p.getEndDate() + "</td></tr>");
                    }
                } else {
                    out.println("<tr><td colspan='5'>No projects found.</td></tr>");
                }
            %>
        </tbody>
    </table>
</body>
</html>
