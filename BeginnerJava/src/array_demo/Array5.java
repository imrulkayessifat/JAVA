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
public class Array5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int diagonal=0,upper=0;
        int[][] numbers = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                numbers[i][j]=input.nextInt();
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(i==j)
                {
                    diagonal = diagonal+numbers[i][j];
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(j>i)
                {
                    upper = upper+numbers[i][j];
                }
            }
        }
        System.out.println(diagonal+" "+upper);
    }
}
