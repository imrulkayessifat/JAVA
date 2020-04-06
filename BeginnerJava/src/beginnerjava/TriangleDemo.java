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
public class TriangleDemo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double base,height,area;
        base = input.nextDouble();
        height = input.nextDouble();
        area = (0.5)*base*height;
        System.out.println(area);
    }
    
}
