/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author ankur
 */
public class ReadFile {
    public int reader(String username, String password){
        try {
            File myObj = new File(username+".txt");
            Scanner myReader = new Scanner(myObj);
            int count=0;
            while(myReader.hasNextLine()){
                String data=myReader.nextLine();
                if(count==2){
                    if(data.equals(password)){
                        return 1;
                    }
                    else{
                        return 0;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
