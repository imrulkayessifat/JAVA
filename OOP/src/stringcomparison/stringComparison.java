/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringcomparison;

/**
 *
 * @author imrul
 */
public class stringComparison {
    public static void main(String[] args) {
        
        String password1 = "hello";
        String password2 = "hello";
        String password3 = new String("hello");
        String password4 = new String("hello");
        
        System.out.println(password1.equals(password2));
        System.out.println(password1.equals(password3));
        System.out.println(password3.equals(password4));
        
        System.out.println(password1 == password2);
        System.out.println(password1 == password3);
        System.out.println(password3 == password4);
        
    }
}
