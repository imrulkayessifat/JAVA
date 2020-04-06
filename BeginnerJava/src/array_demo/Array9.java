/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_demo;

import java.util.ArrayList;

/**
 *
 * @author imrul
 */
public class Array9 {
    public static void main(String[] args) {
        ArrayList<Integer> number1 = new ArrayList<>();
        ArrayList<Integer> number2 = new ArrayList<>();
        ArrayList<Integer> number3 = new ArrayList<>();
        
        number1.add(10);
        number1.add(20);
        number1.add(30);
        number1.add(40);
        System.out.println(number1);
        
        number2.add(1);
        number2.add(2);
        number2.add(3);
        number2.add(4);
        System.out.println(number2);
        
        number3.addAll(number1);
        System.out.println(number3);
        
        boolean equal = number1.equals(number2);
    }
}
