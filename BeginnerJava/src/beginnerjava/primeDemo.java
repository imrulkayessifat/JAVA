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
public class primeDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int initial,finall,count=0;
        initial = input.nextInt();
        finall = input.nextInt();
        for(int i=initial;i<=finall;i++)
        {
            for (int j = 2; j <=i-1; j++) {
                if(i%j==0)
                {
                    count++;
                    break;
                }
            }
            if(count==0)
                System.out.println(i);
            count=0;
        }
    }
}
