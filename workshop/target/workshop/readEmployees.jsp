<%@ page language="java" %>
<%@ page import="org.springframework.web.context.WebApplicationContext" %>
<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<%@ page import="com.divisosofttech.db.*" %>
<%@ page import="java.util.List" %>

<html>
<head>
    <title>View Employees</title>
    <style>
        body {
            background-color: #f9f9f9;
            font-family: 'Arial', sans-serif;
            color: #333;
        }
        table {
            width: 60%;
            margin: 50px auto;
            border-collapse: collapse;
            text-align: center;
        }
        th, td {
            padding: 10px;
            border: 1px solid #ccc;
        }
        th {
            background-color: #DC143C;
            color: white;
        }
    </style>
</head>
<body>
    <h1 style="text-align: center;">All Employees</h1>

    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>First Name</th>
                <th>Last Name</th>
            </tr>
        </thead>
        <tbody>
            <%
                WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(application);
                EmployeeRepository empRep = (EmployeeRepository) context.getBean("employeeRepository");

                List<Employee> employees = empRep.findAll();

                if (employees != null && !employees.isEmpty()) {
                    for (Employee emp : employees) {
                        out.println("<tr><td>" + emp.getId() + "</td><td>" + emp.getFirstName() + "</td><td>" + emp.getLastName() + "</td></tr>");
                    }
                } else {
                    out.println("<tr><td colspan='3'>No employees found.</td></tr>");
                }
            %>
        </tbody>
    </table>
</body>
</html>
