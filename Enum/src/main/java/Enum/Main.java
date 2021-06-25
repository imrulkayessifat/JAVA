/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enum;

/**
 *
 * @author imrul
 */
/**enum Level {
  LOW,
  MEDIUM,
  HIGH
}*/
public class Main {

    /**
     * @param args the command line arguments
     */

enum Level {
  LOW,
  MEDIUM,
  HIGH
}
 
  public static void main(String[] args) { 
    Level myVar = Level.MEDIUM; 
    System.out.println(myVar); 
    switch(myVar) {
      case LOW:
        System.out.println("Low level");
        break;
      case MEDIUM:
        System.out.println("Medium level");
        break;
      case HIGH:
        System.out.println("High level");
        break;
    }
    
        for (Level myVar1 : Level.values()) {
      System.out.println(myVar1);
    }
  } 

    
}
