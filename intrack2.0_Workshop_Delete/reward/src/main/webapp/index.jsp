<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Internsassist @lxisoft Workshop Achievers</title>
    <style>
        /* General styling */
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        body {
            font-family: 'Helvetica Neue', sans-serif;
            background-color: #f0f0f5;
            color: #333;
        }

        header {
            background: linear-gradient(135deg, #1c1f26, #2f3542);
            color: #f1f1f1;
            text-align: center;
            padding: 50px 20px;
        }

        h1 {
            font-size: 3em;
            letter-spacing: 2px;
        }

        p.motivation {
            font-size: 1.3em;
            font-style: italic;
            color: #d1d1d1;
            margin-top: 10px;
        }

        nav {
            background-color: #2f3542;
            display: flex;
            justify-content: center;
            padding: 15px 0;
        }

        nav a {
            color: white;
            font-size: 1.1em;
            margin: 0 20px;
            text-decoration: none;
            padding: 12px 25px;
            border-radius: 30px;
            background-color: #57606f;
            transition: background-color 0.3s ease, transform 0.3s ease;
        }

        nav a:hover {
            background-color: #70a1ff;
            transform: scale(1.1);
        }

        section {
            padding: 60px 20px;
            text-align: center;
        }

        section h2 {
            font-size: 2.5em;
            color: #2f3542;
            margin-bottom: 30px;
        }

        .motivational-message {
            font-size: 1.3em;
            line-height: 1.8em;
            padding: 30px;
            background-color: #ffffff;
            color: #2f3542;
            margin: 20px auto;
            border-left: 10px solid #70a1ff;
            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);
            max-width: 800px;
        }

        .cta {
            margin-top: 40px;
        }

        .cta button {
            background-color: #70a1ff;
            color: white;
            padding: 15px 50px;
            font-size: 1.2em;
            font-weight: bold;
            border: none;
            border-radius: 30px;
            cursor: pointer;
            transition: background-color 0.3s ease, transform 0.3s ease;
        }

        .cta button:hover {
            background-color: #2f3542;
            transform: scale(1.1);
        }

        footer {
            background-color: #2f3542;
            color: #d1d1d1;
            text-align: center;
            padding: 20px 0;
            font-size: 1em;
            position: fixed;
            width: 100%;
            bottom: 0;
            left: 0;
        }

        footer p {
            margin: 0;
        }
    </style>
</head>

<body>

    <header>
        <h1>Welcome to Internsassist @lxisoft Workshop Achievers!</h1>
        <p class="motivation">"Where Hard Work Meets Smart Work, and Dreams Become Achievements"</p>
    </header>

    <nav>
        <a href="createReward.jsp">Create Reward</a>
        <a href="readReward.jsp">View Reward</a>
        <a href="updateReward.jsp">Update Reward</a>
        <a href="deleteReward.jsp">Delete Reward</a>
    </nav>

    <section>
        <h2>Join Us on the Path to Success!</h2>
        <p class="motivational-message">
            "Every achievement begins with a decision to try and the dedication to work towards it. <br>
            Together, we will climb new heights by working smart and hard. Let’s combine our talent, passion, and focus to achieve something extraordinary!"
        </p>

        <div class="cta">
            <button onclick="window.location.href='readReward.jsp'">Explore Our Rewards</button>
        </div>
    </section>

    <footer>
        <p>&copy; 2024 Internsassist @lxisoft Workshop Achievers. Scaling new heights together!</p>
    </footer>

</body>

</html>
