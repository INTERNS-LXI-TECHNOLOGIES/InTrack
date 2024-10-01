package com.lxi.model;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet 
{
   
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        response.setContentType("text/html");
        response.getWriter().println("<h1>Hello world </h1>");
    }
        
}
