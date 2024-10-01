<%@ page import="org.springframework.web.context.WebApplicationContext" %>
<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<%@ page import="com.lxisoft.divisosoft.spingconfigdemo.entity.BookShelfEntity"%>
<%@ page import="com.lxisoft.divisosoft.spingconfigdemo.repository.BookShelfRepository"%>


<html>
<head>
    <title>Add New Book to Shelf</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            background-color: #f3f4f6;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .form-container {
            background-color: #ffffff;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 10px 30px rgba(0, 0, 0, 0.1);
            max-width: 400px;
            width: 100%;
        }

        .form-container h1 {
            text-align: center;
            margin-bottom: 20px;
            font-size: 24px;
            color: #333;
        }

        .form-group {
            margin-bottom: 15px;
        }

        .form-group label {
            display: block;
            margin-bottom: 5px;
            font-size: 14px;
            color: #333;
        }

        .form-group input {
            width: 100%;
            padding: 10px;
            border-radius: 5px;
            border: 1px solid #ddd;
            font-size: 14px;
            background-color: #f9fafb;
            transition: border-color 0.3s ease;
        }

        .form-group input:focus {
            border-color: #4a90e2;
            outline: none;
        }

        .form-group button {
            width: 100%;
            padding: 12px;
            background-color: #4a90e2;
            border: none;
            border-radius: 5px;
            color: white;
            font-size: 16px;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }

        .form-group button:hover {
            background-color: #357ab8;
        }
    </style>
</head>
<body>
    <div class="form-container">

        <h1>ADD A BOOK TO YOUR COLLECTION</h1>

        <form action="addBook.jsp" method="POST">
            <div class="form-group">
                <label for="bookId">Book ID</label>
                <input type="number" name="bookId" required>

                <label for="bookName">Book Name</label>
                <input type="text" name="bookName" required>

                <button type="submit">ADD BOOK</button>
            </div>
        </form>

    </div>
<%
    if (request.getMethod().equalsIgnoreCase("POST")) {
        WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(application);
            BookShelfRepository bookShelfRep = (BookShelfRepository) context.getBean("bookShelfRepository");

            long id = Long.parseLong(request.getParameter("bookId"));
            String bookName = request.getParameter("bookName");

            BookShelfEntity bookEntity = new BookShelfEntity(id,bookName);
            bookShelfRep.save(bookEntity);
    }
%>
</body>
</html>