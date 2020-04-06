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
public class ConditionDemo {
    
    public static void main(String[] args)
    {
        int num;
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        if(num>0)
        {
            System.out.println("Positive");
        }
        else if(num<0)
        {
            System.out.println("negative");
        }else{
            System.out.println("zero");
        }
    }
    
}
