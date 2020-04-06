/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;

/**
 *
 * @author imrul
 */
public class FileDemo2 {
    public static void main(String[] args) {
        try{
            Formatter formatter = new Formatter("/home/imrul/NetBeansProjects/OOP/student.txt");
            formatter.format("%s %s\r\n","101","sifat");
            formatter.format("%s %s\r\n","102","rifat");
            formatter.format("%s %s\r\n","103","hasan");
            formatter.format("%s %s\r\n","104","habib");
            formatter.close();
        }catch(FileNotFoundException e){
            System.out.println(e);
        }
        
        
    }
}
