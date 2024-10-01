<html>
<head>
    <title>Book-Shelf @lxisoft</title>
    <style>
        body {
            font-family: 'Roboto', sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f8f9fa;
            color: #333;
            text-align: center;
            min-height: 100vh;
            display: flex;
            flex-direction: column;
        }

        header {
            background-color: #343a40;
            padding: 20px;
            color: white;
            font-size: 1.5em;
        }

        h1 {
            margin: 0;
            font-size: 2.2em;
        }

        .book {
            display: flex;
            justify-content: center;
            gap: 15px;
            margin: 40px 0;
        }

        .book a {
            background-color: #007bff;
            color: white;
            text-decoration: none;
            padding: 12px 25px;
            border-radius: 8px;
            font-size: 1.1em;
            transition: background 0.3s ease;
        }

        .book a:hover {
            background-color: #0056b3;
        }

        footer {
            background-color: #f1f1f1;
            color: #555;
            font-size: 0.9em;
            padding: 20px 0;
            width: 100%;
            position: fixed;
            bottom: 0;
            left: 0;
        }
    </style>
</head>
<body>

<header>
    <h1>WELCOME TO YOUR BOOKSHELF</h1>
</header>

<div class="book">
    <a href="addBook.jsp">Add Book</a>
    <a href="showBooks.jsp">Show Books</a>
    <a href="updateBook.jsp">Update Book</a>
    <a href="deleteBook.jsp">Delete Book</a>
</div>

<footer>
    <p>&copy; 2024 BOOKSHELF. View Your Personal Library.</p>
    <p>Powered by @lxi technologies</p>
</footer>

</body>
</html>
