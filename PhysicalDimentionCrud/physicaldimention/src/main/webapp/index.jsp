<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Physical Dimension Page</title>
    <style>
        /* General body styles */
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            background: url('https://example.com/your-background-image.jpg') no-repeat center center/cover;
            color: #fff;
        }

        /* Container for links */
        .container {
            text-align: center;
            background-color: rgba(0, 0, 0, 0.7); /* Semi-transparent box */
            padding: 30px;
            border-radius: 15px;
            box-shadow: 0 10px 30px rgba(0, 0, 0, 0.3);
        }

        /* Neon button styles */
        .neon-button {
            display: inline-block;
            padding: 15px 30px;
            margin: 10px;
            font-size: 18px;
            color: #fff;
            text-decoration: none;
            text-transform: uppercase;
            letter-spacing: 2px;
            background-color: transparent;
            border: 2px solid #00ffcc;
            border-radius: 5px;
            transition: 0.3s ease;
            box-shadow: 0 0 10px #00ffcc, 0 0 20px #00ffcc, 0 0 40px #00ffcc;
        }

        .neon-button:hover {
            background-color: #00ffcc;
            color: #000;
            box-shadow: 0 0 20px #00ffcc, 0 0 30px #00ffcc, 0 0 60px #00ffcc;
        }

        /* Glowing bulb effect */
        .bulb {
            width: 100px;
            height: 100px;
            background-color: #f4ff81;
            border-radius: 50%;
            position: relative;
            margin: 0 auto 20px;
            box-shadow: 0 0 60px rgba(255, 255, 0, 0.5), 0 0 100px rgba(255, 255, 0, 0.8);
            animation: glow 2s infinite ease-in-out;
        }

        /* Glow animation for bulb */
        @keyframes glow {
            0%, 100% {
                box-shadow: 0 0 20px rgba(255, 255, 0, 0.5), 0 0 40px rgba(255, 255, 0, 0.8);
            }
            50% {
                box-shadow: 0 0 60px rgba(255, 255, 0, 0.8), 0 0 120px rgba(255, 255, 0, 1);
            }
        }

        /* Adding some spacing */
        h2 {
            margin-bottom: 20px;
            font-size: 26px;
        }
    </style>
</head>
<body>
    <div class="container">
        <!-- Glowing Bulb at the top -->
        <div class="bulb"></div>
        
        <h2>Physical Dimension Management</h2>

        <!-- Neon buttons for CRUD operations -->
        <a href="create.jsp" class="neon-button">Create PhysicalDimention</a>
        <a href="read.jsp" class="neon-button">Read PhysicalDimention</a>
        <a href="update.jsp" class="neon-button">Update PhysicalDimention</a>
        <a href="delete.jsp" class="neon-button">Delete PhysicalDimention</a>
    </div>
</body>
</html>