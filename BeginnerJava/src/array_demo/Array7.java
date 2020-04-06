/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_demo;

import java.util.Arrays;

/**
 *
 * @author imrul
 */
public class Array7 {
    public static void main(String[] args) {
        int[] number = {10,-3,18,5,25};
        Arrays.sort(number);
        for (int i = 0; i < 5; i++) {
            System.out.print(number[i]+ " ");
        }
    }
}
