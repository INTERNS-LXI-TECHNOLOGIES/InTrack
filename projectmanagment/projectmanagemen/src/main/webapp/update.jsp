<%@ page language="java" %>
<%@ page import="org.springframework.web.context.WebApplicationContext" %>
<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<%@ page import="com.divisosofttech.db.*" %>
<%@ page import="com.lxi.project.Project" %>
<%@ page import="com.lxi.project.ProjectRepository" %>

<html>
<head>
    <title>Update Project</title>
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
        input[type="text"],
        input[type="date"] {
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
    <h1 style="text-align: center;">Update Project</h1>

    <form method="post" action="update.jsp">
        <label for="id">Project ID:</label>
        <input type="text" name="id" id="id" required /><br/>

        <label for="name">New Project Name:</label>
        <input type="text" name="name" id="name" /><br/>
        
        <label for="description">New Description:</label>
        <input type="text" name="description" id="description" /><br/>

        <label for="startDate">New Start Date:</label>
        <input type="date" name="startDate" id="startDate" /><br/>

        <label for="endDate">New End Date:</label>
        <input type="date" name="endDate" id="endDate" /><br/>

        <input type="submit" value="Update Project" />
    </form>

    <%
        if (request.getMethod().equalsIgnoreCase("POST")) {
            WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(application);
            ProjectRepository projectRep = (ProjectRepository) context.getBean("projectRepository");

            Long id = Long.parseLong(request.getParameter("id"));
            String name = request.getParameter("name");
            String description = request.getParameter("description");
            String startDate = request.getParameter("startDate");
            String endDate = request.getParameter("endDate");

            Project project = projectRep.findById(id).orElse(null);
            if (project != null) {
                if (name != null && !name.isEmpty()) project.setName(name);
                if (description != null && !description.isEmpty()) project.setDescription(description);
                if (startDate != null) project.setStartDate(startDate);
                if (endDate != null) project.setEndDate(endDate);
                
                projectRep.save(project);
                out.println("<p style='text-align: center; color: #228B22;'>Successfully Updated: " + project.getName() + "</p>");
            } else {
                out.println("<p style='text-align: center; color: #B22222;'>Project not found.</p>");
            }
        }
    %>
</body>
</html>
