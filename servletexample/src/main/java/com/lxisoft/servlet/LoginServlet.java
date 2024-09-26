package com.lxisoft.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



@WebServlet("/login")
public class LoginServlet extends HttpServlet{
    private String name ="Caty";

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) {


        
    }


    
}