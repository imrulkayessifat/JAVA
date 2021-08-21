/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringManipulation;

import java.util.Scanner;

/**
 *
 * @author imrul
 */
public class StringToInt {
    static int myAtoi(String str)
    {
        // Initialize result
        int res = 0;

        for (int i = 0; i < str.length(); ++i)
            res = res * 10 + str.charAt(i) - '0';
        return res;
    }
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter text : ");
        String str = myObj.nextLine();
        
        int val = myAtoi(str);
        System.out.println(val);
    }
}
