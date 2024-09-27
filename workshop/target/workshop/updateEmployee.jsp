<%@ page language="java" %>
<%@ page import="org.springframework.web.context.WebApplicationContext" %>
<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<%@ page import="com.divisosofttech.db.*" %>

<html>
<head>
    <title>Update Employee</title>
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
        input[type="text"], input[type="number"] {
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
    <h1 style="text-align: center;">Update Employee</h1>

    <form method="post" action="updateEmployee.jsp">
        <label for="id">Employee ID:</label>
        <input type="number" name="id" id="id" required /><br/>
        
        <label for="firstName">New First Name:</label>
        <input type="text" name="firstName" id="firstName" /><br/>
        
        <label for="lastName">New Last Name:</label>
        <input type="text" name="lastName" id="lastName" /><br/>
        
        <input type="submit" value="Update Employee" />
    </form>

    <%
        if (request.getMethod().equalsIgnoreCase("POST")) {
            WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(application);
            EmployeeRepository empRep = (EmployeeRepository) context.getBean("employeeRepository");

            long id = Long.parseLong(request.getParameter("id"));
            String newFirstName = request.getParameter("firstName");
            String newLastName = request.getParameter("lastName");

            Employee emp = empRep.findById(id).orElse(null);

            if (emp != null) {
                if (newFirstName != null && !newFirstName.isEmpty()) {
                    emp.setFirstName(newFirstName);
                }
                if (newLastName != null && !newLastName.isEmpty()) {
                    emp.setLastName(newLastName);
                }

                empRep.save(emp);
                out.println("<p style='text-align: center; color: #228B22;'>Successfully Updated: " + emp.getFirstName() + " " + emp.getLastName() + "</p>");
            } else {
                out.println("<p style='text-align: center; color: #B22222;'>Employee not found!</p>");
            }
        }
    %>
</body>
</html>
