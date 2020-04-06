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
public class Test1 {
    public static void main(String[] args) {
        Shape[] s = new Shape[3];
        s[0] = new Shape();
        s[1] = new Rectangle(10,20);
        s[2] = new Triangle(10,20);
        
        System.out.println(s[0].area());
        System.out.println(s[1].area());
        System.out.println(s[2].area());
        
    }
}
