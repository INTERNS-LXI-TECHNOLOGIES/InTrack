<%@ page language="java" %>
<%@ page import="org.springframework.web.context.WebApplicationContext" %>
<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<%@ page import="com.divisosofttec.mentaldimension.MentalDimensional" %>
<%@ page import="com.divisosofttec.mentaldimension.MentalRepository" %>
<%@ page import="java.util.List" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>All Employees</title>
    <style>
        /* General body styles */
        body {
            font-family: 'Arial', sans-serif;
            margin: 0;
            padding: 20px;
            background: linear-gradient(to right, #141E30, #243B55);
            color: #fff;
            text-align: center;
        }

        /* Main heading */
        h1 {
            color: #00ffcc;
            text-shadow: 0 0 10px #00ffcc, 0 0 20px #00ffcc;
            margin-bottom: 40px;
        }

        /* Table styles */
        table {
            width: 80%;
            margin: 0 auto;
            border-collapse: collapse;
            box-shadow: 0 5px 15px rgba(0, 0, 0, 0.3);
            background-color: rgba(255, 255, 255, 0.1);
            border-radius: 10px;
            overflow: hidden;
        }

        th, td {
            padding: 15px;
            text-align: left;
        }

        th {
            background-color: #00ffcc;
            color: #000;
            text-transform: uppercase;
        }

        tr:nth-child(even) {
            background-color: rgba(255, 255, 255, 0.1);
        }

        tr:nth-child(odd) {
            background-color: rgba(255, 255, 255, 0.05);
        }

        td {
            border-bottom: 1px solid rgba(255, 255, 255, 0.2);
        }

        /* Hover effect on rows */
        tr:hover {
            background-color: rgba(0, 255, 204, 0.2);
            cursor: pointer;
        }

        /* Responsive design */
        @media screen and (max-width: 768px) {
            table {
                width: 100%;
            }

            th, td {
                padding: 10px;
            }
        }
    </style>
</head>

<body>
    <!-- Main heading -->
    <h1>All Employees</h1>

    <!-- Table displaying all employees -->
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Question</th>
                <th>Answer</th>
            </tr>
        </thead>
        <tbody>
            <%
                // Get the WebApplicationContext and the MentalRepository bean
                WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(application);        
                MentalRepository repo = (MentalRepository) context.getBean("mentalRepository"); 
                
                // Retrieve all records from the database
                List<MentalDimensional> mentalList = repo.findAll();

                // Loop through the records and display them in the table
                for(MentalDimensional m : mentalList) {
                    out.println("<tr><td>" + m.getId() + "</td><td>" + m.getQuestion() + "</td><td>" + m.getAnswer() + "</td></tr>");
                }
            %>
        </tbody>
    </table>
</body>
</html>
