<%@ page language="java" %>
<%@ page import="org.springframework.web.context.WebApplicationContext" %>
<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<%@ page import="com.divisosofttech.db.*" %>

<html>
<head>
    <title>Delete Employee</title>
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
        input[type="number"] {
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
    <h1 style="text-align: center;">Delete Employee</h1>

    <form method="post" action="deleteEmployee.jsp">
        <label for="id">Employee ID:</label>
        <input type="number" name="id" id="id" required /><br/>
        <input type="submit" value="Delete Employee" />
    </form>

    <%
        if (request.getMethod().equalsIgnoreCase("POST")) {
            WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(application);
            EmployeeRepository empRep = (EmployeeRepository) context.getBean("employeeRepository");

            long id = Long.parseLong(request.getParameter("id"));
            Employee emp = empRep.findById(id).orElse(null);

            if (emp != null) {
                empRep.delete(emp);
                out.println("<p style='text-align: center; color: #228B22;'>Successfully Deleted: " + emp.getFirstName() + " " + emp.getLastName() + "</p>");
            } else {
                out.println("<p style='text-align: center; color: #B22222;'>Employee not found!</p>");
            }
        }
    %>
</body>
</html>
