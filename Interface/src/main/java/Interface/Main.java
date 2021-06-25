/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author imrul
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Pig myPig = new Pig();
            myPig.animalSound();
            myPig.sleep();
            
            DemoClass myObj = new DemoClass();
            myObj.myMethod();
            myObj.myOtherMethod();
    }
    
}
