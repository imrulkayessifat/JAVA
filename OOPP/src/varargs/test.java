/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package varargs;

/**
 *
 * @author imrul
 */
public class test {
    public static void main(String[] args) {
        AddDemo ob = new AddDemo();
        
        ob.add(10,20);
        ob.add(10,20,30);
        ob.add(10,20,30,40);
        
    }
}
