package com.divisosoft;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Person extends HttpServlet
{
    public void doPost(HttpServletRequest request,HttpServletResponse response)
                throws ServletException,IOException{

                
                String name = request.getParameter("name");
                int age =Integer.parseInt(request.getParameter("age"));

                response.getWriter().println("<h1> Welcome "+name+"<h1>");
                response.getWriter().println("<h2> you are "+age+"<h2>");
        }
            
}

