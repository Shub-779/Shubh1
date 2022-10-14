/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.servlet1;

/**
 *
 * @author Shivam
 */
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class Servlet1 extends HttpServlet{
    
    protected void processRequest(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
    {
        response.setContentType("text/html");
        try(PrintWriter out=response.getWriter())
        {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Servlet1</title>");
            out.println("</head>");
            out.println("<body>");
            
            String name =request.getParameter("name");
            out.println("<h1>Hello ," + name + "welcome to my website...</h1>");
            
            out.println("<h1><a href='servlet2'>Go to servlet2</a></h1>");
            
            Cookie c=new Cookie("user_name",name);
            response.addCookie(c);
            
            out.println("</body>");
            out.println("</html>");
            
            
        }
    }
    
}
