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
public class CapitalSmall {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        char ch;
        ch = input.next().charAt(0);
        if(ch>='a' && ch<='z')
        {
            System.out.println("small");
        }
        else
        {
            System.out.println("Capital");
        }
    }
}
