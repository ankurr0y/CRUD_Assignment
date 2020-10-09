/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.servlet.http.HttpServlet;

/**
 *
 * @author ankur
 */
class InteriorPage extends HttpServlet{
    public void getControlPage(String username) throws FileNotFoundException{
        File indexFile = new File("users/users.txt");
        Scanner indexReader = new Scanner(indexFile);
        while(indexReader.hasNextLine()){
            if(username.equals(indexReader.nextLine())){
                continue;
            }
            else{
                File myObj = new File(indexReader.nextLine());
                Scanner myReader = new Scanner(myObj);
                PrintWriter out = new response.getWriter();
            }
        }
    }
}
