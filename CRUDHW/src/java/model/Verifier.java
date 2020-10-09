/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author ankur
 */
public class Verifier {
    public int verifyUser(String username){
        File file=new File(username+".txt");
        if(file.exists()){
            return 0;
        }
        else{
            return 1;
        }
    }
    public int verifyMail(String email) throws FileNotFoundException{
        File myObj = new File("emails/email.txt");
        Scanner myReader = new Scanner(myObj);
        while(myReader.hasNextLine()){
            String data= myReader.nextLine();
            if(data.equalsIgnoreCase(email)){
                return 0;
            }
        }
        return 1;
    }
}
