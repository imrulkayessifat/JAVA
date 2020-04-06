/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intanceof;

/**
 *
 * @author imrul
 */
public class Test {
    public static void main(String[] args) {
         Animal a = new Animal();
         Person p = new Person();
         Teacher t = new Teacher();
         
         System.out.println(a instanceof Animal);
         System.out.println(t instanceof Person);
         System.out.println(p instanceof Animal);
         System.out.println(t instanceof Animal);
         System.out.println(p instanceof Teacher);
    }
    
               
}
