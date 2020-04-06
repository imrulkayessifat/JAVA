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
public class Series2Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,sum=0;
        n=input.nextInt();
        for (int i = 1; i <= n; i++) {
            sum=sum+i;
        }
        System.out.println(sum);
        sum=0;
        for (int i = 1; i <= n; i=i+2) {
            sum=sum+i;
        }
        System.out.println(sum);
        sum=0;
        for (int i = 1; i <n; i++) {
            sum=sum+(i*i);
        }
        System.out.println(sum);
        double m,sum1=0;
        m=input.nextDouble();
        for (double i = 1.5; i <=m; i++) {
            sum1=sum1+i;
        }
        System.out.println(sum1);
        
    }
}
