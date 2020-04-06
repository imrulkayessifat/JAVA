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
public class ConditionalDemo {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num1,num2,large;
        num1 = input.nextInt();
        num2 = input.nextInt();
        large = (num1>=num2)?num1:num2;
        System.out.println(" large is : "+large);
    }
}
