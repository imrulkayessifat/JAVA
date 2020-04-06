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
public class Series3Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,sum=1;
        n=input.nextInt();
        for (int i = 1; i <=n; i++) {
            sum=sum*i;
        }
        System.out.println(sum);
        sum=1;
        for (int i = 1; i <=n; i=i+2) {
            sum=sum*i;
        }
        System.out.println(sum);
        
        double m,sum1=1;
        m=input.nextDouble();
        for (double i = 1.5; i < m; i++) {
            sum1=sum1*i;
        }
        System.out.println(sum1);
        sum1=1;
        for (double i = 1; i < m; i++) {
            sum1=sum1*i*i;
        }
        System.out.println(sum1);
    }
}
