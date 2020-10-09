/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import model.ReadFile;
import org.glassfish.soteria.Utils;
/**
 *
 * @author ankur
 */
public class Login extends HttpServlet{
     @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
       response.setContentType("text/html");
       PrintWriter out= response.getWriter();
       //System.out.println(request.getParameter("username"));
       ReadFile read = new ReadFile();
       int sessionQuestion=read.reader(request.getParameter("username"), request.getParameter("password"));
       if (sessionQuestion==0){
           out.println("Password is wrong");
           out.println("<a href=\"LoginForm.java\">Go back to login page</a>");
       }
       else{
           InteriorPage interiorPage = new InteriorPage();
           interiorPage.getControlPage(request.getParameter("username"));
       }
   }
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

      doGet(request, response);
   }
}
