<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Internsassist @lxisoft Workshop Achievers</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            background-color: #f9f9f9;
            color: #333;
            margin: 0;
            padding: 0;
        }
        header {
            background-color: #8B0000;
            color: white;
            padding: 20px;
            text-align: center;
        }
        h1 {
            font-size: 2.5em;
            margin: 0;
        }
        p.motivation {
            font-size: 1.2em;
            margin: 15px 0;
            color: #800000;
        }
        nav {
            background-color: #A52A2A;
            padding: 15px;
            text-align: center;
        }
        nav a {
            color: white;
            font-size: 1.2em;
            margin: 0 15px;
            text-decoration: none;
            padding: 10px 20px;
            border-radius: 5px;
            background-color: #DC143C;
            transition: background-color 0.3s ease;
        }
        nav a:hover {
            background-color: #B22222;
        }
        section {
            padding: 50px;
            text-align: center;
        }
        footer {
            background-color: #8B0000;
            color: white;
            text-align: center;
            padding: 20px;
            position: fixed;
            width: 100%;
            bottom: 0;
        }
        .motivational-message {
            font-size: 1.5em;
            color: #333;
            margin-top: 30px;
            padding: 20px;
            background-color: #FFE4E1;
            border-left: 8px solid #DC143C;
        }
        .cta {
            margin-top: 30px;
        }
        .cta button {
            background-color: #A52A2A;
            color: white;
            padding: 15px 30px;
            font-size: 1.2em;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
        .cta button:hover {
            background-color: #8B0000;
        }
    </style>
</head>
<body>

    <header>
        <h1>Welcome to Internsassist @lxisoft Workshop Achievers!</h1>
        <p class="motivation">"Where Hard Work Meets Smart Work, and Dreams Become Achievements"</p>
    </header>

    <nav>
        <a href="createAdmin.jsp">Create Employee</a>
        <a href="readAdmin.jsp">View Employees</a>
        <a href="updateAdmin.jsp">Update Employee</a>
        <a href="deleteAdmin.jsp">Delete Employee</a>
    </nav>

    <section>
        <h2>Join Us on the Path to Success!</h2>
        <p class="motivational-message">
            "Every achievement begins with a decision to try and the dedication to work towards it. <br>
            Together, we will climb new heights by working smart and hard. Let’s combine our talent, passion, and focus to achieve something extraordinary!"
        </p>

        <div class="cta">
            <button onclick="window.location.href='readEmployees.jsp'">Explore Our Achievers</button>
        </div>
    </section>

    <footer>
        <p>&copy; 2024 Internsassist @lxisoft Workshop Achievers. Scaling new heights together!</p>
    </footer>

</body>
</html>
