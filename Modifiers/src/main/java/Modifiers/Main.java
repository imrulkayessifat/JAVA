/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modifiers;

/**
 *
 * @author imrul
 */
    // For Public
    // The class is accessible by any other class

    // For Default
    // The class is only accessible by classes in the same package
public class Main {

    /**
     * @param args the command line arguments
     */

    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello World");
        Second myobj = new Second();
        System.out.println(myobj.age);
        System.out.println(myobj.email);
        Sifat myobj1 = new Sifat();
            System.out.println("Name: " + myobj1.fname + " " + myobj1.lname);
    System.out.println("Email: " + myobj1.email);
    System.out.println("Age: " + myobj1.age);
        
    }
    
    
    // For final 
    // The class cannot be inherited by other classes.
    

   
    
}
