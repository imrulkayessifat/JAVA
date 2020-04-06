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
public class ArithmeticDemo {
    public static void main(String[] args){
        int num1,num2,result;
        Scanner input = new Scanner(System.in);
        num1 = input.nextInt();
        num2 = input.nextInt();
        result = num1+num2;
        System.out.println(result);
        
        result = num1-num2;
        System.out.println(result);
        
        result = num1*num2;
        System.out.println(result);
        
        double result1 = (double) num1/num2;
        System.out.println(result1);
        
        result = num1%num2;
        System.out.println(result);
    }
}
