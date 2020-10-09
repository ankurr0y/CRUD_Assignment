/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import model.SendEmail;
import model.Verifier;
import model.WriteFile;
/**
 *
 * @author ankur
 */
public class Register extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
       response.setContentType("text/html");
       PrintWriter out= response.getWriter();
       //System.out.println(request.getParameter("username"));
       
       //System.out.println(request.getParameter("username"));
       //System.out.println(request.getParameter("email"));
       //System.out.println(request.getParameter("password"));
       //System.out.println(request.getParameter("address"));
       //System.out.println(request.getParameter("contact"));
       Verifier verify = new Verifier();
       int checker = verify.verifyUser(request.getParameter("username"));
       if(checker==0){
           out.println("Username is already taken");
           out.println("<a href=\" RegistrationForm.jsp \">Return to registration</a>");
       }
       else{
            int checker2= verify.verifyMail(request.getParameter("email"));
            if (checker2==0){
                out.println("This email is already in use");
                out.println("<a href=\" RegistrationForm.jsp \">Return to registration</a>");              
            }
            else{
                WriteFile write= new WriteFile();
                write.writer(request.getParameter("username"), request.getParameter("email"), request.getParameter("password"), request.getParameter("address"), request.getParameter("contact"));
                SendEmail sender = new SendEmail();
                sender.send(request.getParameter("email"));
            }//write.writer("a", "b", "c", "d", "e");
       //out.println("Line");
       }
   }
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

      doGet(request, response);
   }
}
