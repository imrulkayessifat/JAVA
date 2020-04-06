/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.text.DecimalFormat;

/**
 *
 * @author imrul
 */
public class DecimalNumberFormatDemo {
    public static void main(String[] args) {
        DecimalFormat ob = new DecimalFormat("0.00");
        double x = 2.9875488;
        System.out.println(""+ob.format(x));
        
        
    }
}
