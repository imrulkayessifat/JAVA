/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beginnerjava;

import java.util.Scanner;

/**
 *
 * @author imrul
 */
public class CircleDemo {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double radius,ans;
        radius = input.nextDouble();
        ans = 3.1416*radius*radius;
        System.out.println(ans);
    }
    
}
