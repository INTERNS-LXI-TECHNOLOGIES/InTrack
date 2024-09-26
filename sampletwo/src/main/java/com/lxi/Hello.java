package com.lxi;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.ServletException;

public class Hello extends HttpServlet{

    public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{

        response.setContentType("text/html");
        PrintWriter out =response.getWriter();

        out.println("<h1>Hello World </h1>");

    }
}
