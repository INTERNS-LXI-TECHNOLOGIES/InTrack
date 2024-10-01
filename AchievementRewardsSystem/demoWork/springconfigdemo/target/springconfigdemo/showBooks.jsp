<%@ page import="org.springframework.web.context.WebApplicationContext" %>
<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<%@ page import="com.lxisoft.divisosoft.spingconfigdemo.entity.BookShelfEntity"%>
<%@ page import="com.lxisoft.divisosoft.spingconfigdemo.repository.BookShelfRepository"%>

<html>
<head>
    <title>VIEW FULL COLLECTION</title>
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
        .message {
            margin-top: 20px;
            font-size: 16px;
            color: green;
        }

        .error {
            margin-top: 20px;
            font-size: 16px;
            color: red;
        }
    </style>
</head>
<body>
    <div class="form-container">
    
        <h1>SHOW BOOKS</h1>

        <form action="showBooks.jsp" method="POST">
            <div class="form-group">

                <label for="bookId">Book ID</label>
                <input type="number" name="bookId" required>

                <button type="submit">SHOW BOOK DETAILS</button>
            </div>
        </form>

    </div>

<%
    if(request.getMethod().equalsIgnoreCase("POST")){
        try{
            WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(application);
            BookShelfRepository bookShelfRep = (BookShelfRepository) context.getBean("bookShelfRepository");

            long id = Long.parseLong(request.getParameter("bookId"));
            BookShelfEntity bookEntity= bookShelfRep.findById(id).orElse(null);

            if(bookEntity!=null){
                out.println("<div class='message'>Book Found: "+ bookEntity.getName() + " " +"Book Id:"+ bookEntity.getId()+"</div>");
            }
            else{
                out.println("<div class='error'> No Book Found with id: "+ bookEntity.getId()+"</div>");
            }
        } catch (Exception e) {
            out.println("<div class='error'>Error occurred: " + e.getMessage() + "</div>");
        }
    }
%>
</body>
</html>