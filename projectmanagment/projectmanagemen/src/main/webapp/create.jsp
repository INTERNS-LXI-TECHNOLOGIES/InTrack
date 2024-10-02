<%@ page language="java" %>
<%@ page import="org.springframework.web.context.WebApplicationContext" %>
<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<%@ page import="com.lxi.project.Project" %>
<%@ page import="com.lxi.project.ProjectRepository" %>
<%@ page import="com.lxi.project.Task" %>
<%@ page import="com.lxi.project.TaskRepository" %>

<html>
<head>
    <title>Create Project</title>
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
    <h1 style="text-align: center;">Create New Project</h1>

    <form method="post" action="create.jsp">
        <label for="name">Project Name:</label>
        <input type="text" name="name" id="name" required /><br/>
        
        <label for="description">Description:</label>
        <input type="text" name="description" id="description" required /><br/>
    
        <label for="startDate">Start Date:</label>
        <input type="date" name="startDate" id="startDate" required /><br/>
    
        <label for="endDate">End Date:</label>
        <input type="date" name="endDate" id="endDate" required /><br/>
    
        <!-- New section for adding tasks -->
        <label for="tasks">Task Name:</label>
        <input type="text" name="taskName" id="taskName" /><br/>
    
        <label for="taskDescription">Task Description:</label>
        <input type="text" name="taskDescription" id="taskDescription" /><br/>
    
        <label for="dueDate">Due Date:</label>
        <input type="date" name="dueDate" id="dueDate" /><br/>
    
        <input type="submit" value="Save Project" />
    </form>
    
    <%
    if (request.getMethod().equalsIgnoreCase("POST")) {
        WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(application);
        ProjectRepository pr = (ProjectRepository) context.getBean("projectRepository");
        
        // Get project data from form
        String name = request.getParameter("name");
        String description = request.getParameter("description");
        String startDate = request.getParameter("startDate");
        String endDate = request.getParameter("endDate");

        // Check if the required fields are present
        if (name != null && description != null && startDate != null && endDate != null) {
            // Create a new project
            Project project = new Project(name, description, startDate, endDate);
            
            // Handle task data from the form
            String taskName = request.getParameter("taskName");
            String taskDescription = request.getParameter("taskDescription");
            String dueDate = request.getParameter("dueDate");
    
            if (taskName != null && taskDescription != null && dueDate != null) {
                // Create and add the task to the project
                Task task = new Task(taskName, taskDescription, dueDate, project);
                project.getTasks().add(task);  // Add the task to the project
            }

            // Save the project (and associated tasks)
            pr.save(project);
            out.println("<p style='text-align: center; color: #228B22;'>Successfully Saved: " + project.getName() + "</p>");
        } else {
            out.println("<p style='text-align: center; color: #B22222;'>Please fill in all fields.</p>");
        }
    }
    %>
</body>
</html>
