/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaProblemTwo;

/**
 *
 * @author imrul
 */
import java.util.*;
public class Main {
   

    /**
     * @param args the command line arguments
     */

    
        public static void main(String args[])
        {
        try {
            String a = null; //null value
            System.out.println(a.charAt(0));
        } catch(NullPointerException e) {
            System.out.println("NullPointerException..");
        }
    }


      
    
}
