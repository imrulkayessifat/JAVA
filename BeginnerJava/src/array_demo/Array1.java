/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_demo;

import java.util.Scanner;

/**
 *
 * @author imrul
 */
public class Array1 {
    public static void main(String[] args) {
         double[] number=new double[5];
         int len = number.length;
         double sum=0,average;
         Scanner input = new Scanner(System.in);
         for (int i = 0; i <len; i++) {
            number[i]=input.nextDouble();
        }
         for (int i = 0; i < len; i++) {
            sum=sum+number[i];
        }
         average = sum/len;
         System.out.println(sum+" "+average);
         double max = number[0];
         double min = number[0];
         System.out.println(max);
         System.out.println(min);
         for (int i = 1; i <len; i++) {
            if(max<number[i])
                max=number[i];
            if(min>number[i])
                min = number[i];
        }
         System.out.println(max);
         System.out.println(min);
         
    }
}
