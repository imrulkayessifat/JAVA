/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulation;

/**
 *
 * @author imrul
 */
public class EncapTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("imrul");
        System.out.println(p1.getName());
        
        p1.setAge(10);
        System.out.println(p1.getAge());
        
       
    }
}
