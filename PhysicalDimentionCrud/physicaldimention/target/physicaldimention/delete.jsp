<%@ page language="java" %>
<%@ page import="org.springframework.web.context.WebApplicationContext" %>
<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<%@ page import="com.diviso.PhysicalDimentional" %>
<%@ page import="com.diviso.PhysicalDimentionalRepo" %>
<%@ page import="java.util.Optional" %>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Delete Physical Dimentional</title>
    <style>
        /* General body styles */
        body {
            font-family: 'Arial', sans-serif;
            margin: 0;
            padding: 0;
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            background: url('https://example.com/your-background-image.jpg') no-repeat center center/cover;
            color: #fff;
        }

        /* Form container */
        .form-container {
            background-color: rgba(0, 0, 0, 0.7);
            padding: 40px;
            border-radius: 10px;
            box-shadow: 0 10px 30px rgba(0, 0, 0, 0.3);
            text-align: center;
        }

        /* Form headings */
        h2 {
            margin-bottom: 20px;
            font-size: 24px;
            color: #00ffcc;
            text-shadow: 0 0 10px #00ffcc;
        }

        /* Input fields */
        input[type="text"], input[type="submit"] {
            display: block;
            width: 100%;
            padding: 15px;
            margin: 10px 0;
            border: none;
            border-radius: 5px;
            font-size: 16px;
            background-color: rgba(255, 255, 255, 0.1);
            color: #fff;
            box-shadow: 0 0 10px #00ffcc;
            transition: 0.3s;
        }

        input[type="text"]:focus, input[type="submit"]:hover {
            background-color: #00ffcc;
            color: #000;
            box-shadow: 0 0 20px #00ffcc, 0 0 30px #00ffcc, 0 0 40px #00ffcc;
        }

        /* Submit button */
        input[type="submit"] {
            background-color: transparent;
            cursor: pointer;
            text-transform: uppercase;
            font-weight: bold;
            letter-spacing: 2px;
        }

    </style>
</head>
<body>
    <div class="form-container">
        <!-- Form for creating MentalDimensional -->
        <form action="delete.jsp" method="post">
            <h2>Enter the Id</h2>
            <input type="number" name="id" id="id" required /><br/>
            <input type="submit" value="submit">

        </form>
    </div>

    <!-- Java code to handle form submission -->
    <%  
    if (request.getMethod().equalsIgnoreCase("POST")) {
        WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(application);        
        PhysicalDimentionalRepo repo = (PhysicalDimentionalRepo) context.getBean("physicalDimentionalRepo"); 

        long id = Long.parseLong(request.getParameter("id"));

        
        Optional<PhysicalDimentional> optionalPhysic = repo.findById(id);
        if (optionalPhysic.isPresent()) {
            PhysicalDimentional physic = optionalPhysic.get();
            repo.delete(physic);
        } else {
            // Handle case where the entity is not found
            out.println("<p>No Physical Dimentional found with ID: " + id + "</p>");
        }
    }
    %>
</body>
</html>
