/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author imrul
 */
public class Test {
    public static void main(String[] args) {
        Person p = new Person();
        p.display();
        
        p = new Teacher();
        p.display();
        
        p = new Student();
        p.display();
        

    }
}
