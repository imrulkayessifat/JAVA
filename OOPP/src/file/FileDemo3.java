/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author imrul
 */
public class FileDemo3 {
    public static void main(String[] args) {
        try{
            File file = new File("/home/imrul/NetBeansProjects/OOP/student.txt");
            Scanner scanner = new Scanner(file);
            while(scanner.hasNext()){
                String id = scanner.next();
                String name = scanner.next();
                System.out.println(id+" "+name);
            }
            scanner.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
