package com.divisosoft;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.ServletException;

import java.io.IOException;

@WebServlet("/person")
public class Employee extends HttpServlet {
    
    public void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
    
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
    
        response.getWriter().println("<h1> Welcome " + name + "</h1>");
        response.getWriter().println("<h2> You are " + age + " years old </h2>");
    }
}
