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


public class Servlet2 extends HttpServlet{
    
    protected void processRequest(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
    {
        response.setContentType("text/html;charset=UTF-8");
        try(PrintWriter out=response.getWriter())
        {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Servlet2</title>");
            out.println("</head>");
            out.println("<body>");
            
             Cookie[] cookies=request.getCookies();
            
            boolean f =false;
            String name="";
            if(cookies==null)
            {
                out.println("<h1>you are new user go to home page amd submit yur name ");
                
            }
            else{
                for(Cookie c:cookies){
                    String tname=c.getName();
                    if(tname.equals("user_name")){
                        f=true;
                        
                        name=c.getValue();
                    }
                }
            }
            
            if(f){
             
            out.println("<h1>Hello ," + name + "welcome back to my website...</h1>");
            
            out.println("<h1>Thank you</h1>");
            
            //grtting all the cookies
            
           
            }else
            {
                
                out.println("<h1>you are new user go to home page amd submit yur name ");
                return;
            }
            out.println("</body>");
            out.println("</html>");
        }
    
}
}