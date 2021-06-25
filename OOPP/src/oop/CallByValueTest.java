/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author imrul
 */
public class CallByValueTest {
    public static void main(String[] args) {
        CallByValue ob = new CallByValue();
        int x = 10;
        System.out.println(x);
        ob.change(x);
        System.out.println(x);
    }
}
