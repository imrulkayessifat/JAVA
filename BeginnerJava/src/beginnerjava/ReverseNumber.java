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
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int temp,r,sum=0;
        temp=input.nextInt();
        while(temp!=0)
        {
            r=temp%10;
            sum=sum*10+r;
            temp=temp/10;
        }
        System.out.println(sum);
    }
}
