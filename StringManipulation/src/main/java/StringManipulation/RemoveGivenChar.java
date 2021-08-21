/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringManipulation;

/**
 *
 * @author imrul
 */
public class RemoveGivenChar {
    public static String charRemoveAt(String str, int p) {  
              return str.substring(0, p) + str.substring(p + 1);  
           }  
    public static void main(String[] args) {
     String word = "Java";
     String replaced = word.replace("J", "K");
        System.out.println(replaced);
        
     String str = "Scala is good programming language";
     replaced = str.replaceAll("Scala", "Java");
     System.out.println(replaced);
     
     String str1 = "India is my country";  
              System.out.println(charRemoveAt(str1, 7)); 
    }
}
