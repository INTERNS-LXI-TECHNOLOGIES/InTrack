<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Internsassist @lxisoft Project Management</title>
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
        <h1>Welcome to Internsassist @lxisoft Project Management!</h1>
        <p class="motivation">"Where Projects Meet Excellence and Innovations Become Reality"</p>
    </header>

    <nav>
        <a href="createProject.jsp">Create Project</a>
        <a href="viewProjects.jsp">View Projects</a>
        <a href="updateProject.jsp">Update Project</a>
        <a href="deleteProject.jsp">Delete Project</a>
    </nav>

    <section>
        <h2>Manage Your Projects Efficiently!</h2>
        <p class="motivational-message">
            "Success is not just about completing tasks. It's about managing them well, delivering value, and achieving innovation.<br>
            Let's work together to build projects that inspire change and drive progress!"
        </p>

        <div class="cta">
            <button onclick="window.location.href='viewProjects.jsp'">Explore Projects</button>
        </div>
    </section>

    <footer>
        <p>&copy; 2024 Internsassist @lxisoft Project Management. Innovating the future together!</p>
    </footer>

</body>
</html>
