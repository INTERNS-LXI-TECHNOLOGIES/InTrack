<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home Page</title>
    <style>
        body {
            margin: 0;
            font-family: 'Arial', sans-serif;
            background-color: #f5e8e4;
        }

        .container {
            display: flex;
            height: 100vh;
        }

        .sidebar {
            width: 20%;
            background-color: #f1f1f1;
            padding: 20px;
            display: flex;
            flex-direction: column;
            justify-content: start;
        }

        .sidebar h1 {
            margin-bottom: 40px;
            font-family: 'Cursive', sans-serif;
        }

        .sidebar button {
            background-color: #e4b27a;
            border: none;
            padding: 20px;
            margin-bottom: 20px;
            font-size: 18px;
            cursor: pointer;
        }

        .sidebar button:hover {
            background-color: #d69f67;
        }

        .main-content {
            width: 80%;
            padding: 20px;
        }

        .search-bar {
            display: flex;
            justify-content: flex-end;
            margin-bottom: 40px;
        }

        .search-bar input {
            padding: 10px;
            font-size: 16px;
            border-radius: 20px;
            border: 1px solid #ccc;
            width: 250px;
        }

        .search-bar button {
            background: none;
            border: none;
            cursor: pointer;
            margin-left: -40px;
            margin-top: 5px;
        }

        .grid-container {
            display: grid;
            grid-template-columns: repeat(3, 1fr);
            gap: 20px;
        }

        .card {
            background-color: white;
            border: 1px solid #ddd;
            border-radius: 10px;
            text-align: center;
            padding: 20px;
        }

        .card img {
            width: 100px;
            height: 100px;
            margin-bottom: 10px;
        }

        .card p {
            font-size: 18px;
            color: #333;
        }

        .profile-icon {
            float: right;
            margin-right: 20px;
            cursor: pointer;
        }

        .profile-icon img {
            width: 40px;
            height: 40px;
            border-radius: 50%;
        }
    </style>
</head>
<body>

    <div class="container">
        <!-- Sidebar -->
        <div class="sidebar">
            <h1>Home Page</h1>
            <button>Study Material</button>
            <button>Skill Development</button>
            <button>Git</button>
        </div>

        <!-- Main Content -->
        <div class="main-content">
            <div class="search-bar">
                <input type="text" placeholder="Search" />
                <button>
                    <img src="https://img.icons8.com/ios-glyphs/30/000000/search--v1.png"/>
                </button>
                <div class="profile-icon">
                    <img src="https://img.icons8.com/ios-filled/50/000000/user-male-circle.png"/>
                </div>
            </div>

            <!-- Grid Content -->
            <div class="grid-container">
                <div class="card">
                    <img src="https://img.icons8.com/ios-glyphs/90/000000/image.png"/>
                    <p>Meeting</p>
                </div>
                <div class="card">
                    <img src="https://img.icons8.com/ios-glyphs/90/000000/image.png"/>
                    <p>Summary</p>
                </div>
                <div class="card">
                    <img src="https://img.icons8.com/ios-glyphs/90/000000/image.png"/>
                    <p>Review</p>
                </div>
                <div class="card">
                    <img src="https://img.icons8.com/ios-glyphs/90/000000/image.png"/>
                    <p>Attendance</p>
                </div>
                <div class="card">
                    <img src="https://img.icons8.com/ios-glyphs/90/000000/image.png"/>
                    <p>Task</p>
                </div>
                <div class="card">
                    <img src="https://img.icons8.com/ios-glyphs/90/000000/image.png"/>
                    <p>Reward</p>
                </div>
            </div>
        </div>
    </div>

</body>
</html>
