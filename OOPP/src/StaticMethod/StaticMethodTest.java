/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StaticMethod;

/**
 *
 * @author imrul
 */
public class StaticMethodTest {
    public static void main(String[] args) {
        StaticMethodDemo  obj = new StaticMethodDemo();
        obj.display1();
        
        StaticMethodDemo.display2();
    }
}
