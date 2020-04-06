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
public class Array2 {
    public static void main(String[] args) {
        int[][] number = new int[2][3];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                number[i][j]=input.nextInt();
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(number[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
