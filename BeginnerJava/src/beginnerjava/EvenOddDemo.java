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
public class EvenOddDemo {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num;
        num = input.nextInt();
        if(num%2==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("odd");
        }
    }
}
