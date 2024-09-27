<%@ page language="java" %>
<%@ page import="org.springframework.web.context.WebApplicationContext" %>
<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<%@ page import="com.divisosofttech.db.*" %>

<html>
<head>
    <title>Create Employee</title>
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
    <h1 style="text-align: center;">Create New Employee</h1>

    <form method="post" action="createEmployee.jsp">
        <label for="firstName">First Name:</label>
        <input type="text" name="firstName" id="firstName" /><br/>
        <label for="lastName">Last Name:</label>
        <input type="text" name="lastName" id="lastName" /><br/>
        <input type="submit" value="Save Employee" />
    </form>

    <%
        if (request.getMethod().equalsIgnoreCase("POST")) {
            WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(application);
            EmployeeRepository empRep = (EmployeeRepository) context.getBean("employeeRepository");

            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");

            if (firstName != null && lastName != null) {
                Employee emp = new Employee(firstName, lastName);
                empRep.save(emp);
                out.println("<p style='text-align: center; color: #228B22;'>Successfully Saved: " + emp.getFirstName() + " " + emp.getLastName() + "</p>");
            } else {
                out.println("<p style='text-align: center; color: #B22222;'>Please fill in all fields.</p>");
            }
        }
    %>
</body>
</html>
