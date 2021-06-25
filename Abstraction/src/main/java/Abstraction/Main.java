/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstraction;

/**
 *
 * @author imrul
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    // Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
    // Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass 
    
    public static void main(String[] args) {
        // TODO code application logic here
        Pig myPig = new Pig(); // Create a Pig object
        myPig.animalSound();
        myPig.sleep();
    }
    
}
