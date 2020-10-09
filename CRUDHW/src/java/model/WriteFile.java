/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author ankur
 */
public class WriteFile {
    public int emailRegistrar(String email) throws IOException{
        File emFile = new File("emails/email.txt");
        if(!emFile.exists()){
            emFile.createNewFile();
        }
        FileWriter fw = new FileWriter(emFile.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(email+"\n");
        bw.close();
        return 1;
    }
    public int usernameRegistrar(String username) throws IOException{
        File userFile = new File("users/users.txt");
        if(!userFile.exists()){
            userFile.createNewFile();
        }
        FileWriter fw = new FileWriter(userFile.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(username+"\n");
        bw.close();
        return 1;
    }
    public void writer(String username, String email, String password, String address, String contact){
         try {
         int a = emailRegistrar(email);
         int b = usernameRegistrar(username);
         String content = "Username:"+username+"\nEmail:"+email+"\nPassword:"+password+"\nAddress:"+address+"\nContact:"+contact;
         File file = new File(username+".txt");
         if (!file.exists()) {
            file.createNewFile();
         } 
         FileWriter fw = new FileWriter(file.getAbsoluteFile());
         BufferedWriter bw = new BufferedWriter(fw);
         bw.write(content);
         bw.close();
         
         System.out.println("Done");
      } catch (IOException e) {
         e.printStackTrace();
      } 
    }
}
