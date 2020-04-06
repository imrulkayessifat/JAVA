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
public class FactorialDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,ans=1;
        num=input.nextInt();
        for (int i = num; i >=1; i--) {
            ans=ans*i;
        }
        System.out.println(ans);
    }
}
