package com.divisosoft.loginform;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    
        public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
            String username=request.getParameter("username");
            //response.getWriter().println(name+"Successfully login");

            request.setAttribute("username", username);
            
            RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
            rd.forward(request,response);

    
        }
    
        
    }

    
