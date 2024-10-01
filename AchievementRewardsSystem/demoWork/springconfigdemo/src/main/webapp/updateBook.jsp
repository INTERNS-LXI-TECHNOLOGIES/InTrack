<%@ page import="org.springframework.web.context.WebApplicationContext" %>
<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<%@ page import="com.lxisoft.divisosoft.spingconfigdemo.entity.BookShelfEntity"%>
<%@ page import="com.lxisoft.divisosoft.spingconfigdemo.repository.BookShelfRepository"%>

<html>
<head>
    <title>Update Book</title>
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

        <h1>UPDATE BOOK</h1>

        <form action="updateBook.jsp" method="POST">
            <div class="form-group">

                <label for="oldBookId">Old Book ID</label>
                <input type="number" name="oldBookId" required>

                <label for="newBookId">New Book ID</label>
                <input type="number" name="newBookId" required>

                <label for="newBookName">New Book Name</label>
                <input type="text" name="newBookName" required>

                <button type="submit">UPDATE BOOK</button>
            </div>
        </form>

    </div>

<%
    if(request.getMethod().equalsIgnoreCase("POST")){
        try{
            WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(application);
            BookShelfRepository bookShelfRep = (BookShelfRepository)context.getBean("bookShelfRepository");

            long oldId =Long.parseLong(request.getParameter("oldBookId"));
            long newId =Long.parseLong(request.getParameter("newBookId"));
            String latestBookName =request.getParameter("newBookName");

            BookShelfEntity bookEntity =bookShelfRep.findById(oldId).orElse(null);
            if(bookEntity!=null){
                bookShelfRep.delete(bookEntity);
                BookShelfEntity bookEnt= new BookShelfEntity(newId,latestBookName);
                bookShelfRep.save(bookEnt);

                out.println("<div class='message'>Book updated successfully!</div>");
            }
            else{
                out.println("<div class='error'>No book found with ID: " + oldId + "</div>");
            }
        }catch(Exception e){
            out.println("<div class='error'>Error occurred: " + e.getMessage() + "</div>");
        }

    }
%>
</body>
</html>
