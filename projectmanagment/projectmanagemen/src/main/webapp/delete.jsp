<%@ page language="java" %>
<%@ page import="org.springframework.web.context.WebApplicationContext" %>
<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<%@ page import="com.divisosofttech.db.*" %>
<%@ page import="com.lxi.project.Project" %>
<%@ page import="com.lxi.project.ProjectRepository" %>

<html>
<head>
    <title>Delete Project</title>
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
    <h1 style="text-align: center;">Delete Project</h1>

    <form method="post" action="delete.jsp">
        <label for="id">Project ID:</label>
        <input type="text" name="id" id="id" required /><br/>
        <input type="submit" value="Delete Project" />
    </form>

    <%
        if (request.getMethod().equalsIgnoreCase("POST")) {
            WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(application);
            ProjectRepository projectRep = (ProjectRepository) context.getBean("projectRepository");

            Long id = Long.parseLong(request.getParameter("id"));
            Project project = projectRep.findById(id).orElse(null);

            if (project != null) {
                projectRep.delete(project);
                out.println("<p style='text-align: center; color: #228B22;'>Successfully Deleted: " + project.getName() + "</p>");
            } else {
                out.println("<p style='text-align: center; color: #B22222;'>Project not found.</p>");
            }
        }
    %>
</body>
</html>
