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
public class DigitString {
    public static boolean onlyDigits(String str, int n)
    {
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) >= '0'
                && str.charAt(i) <= '9') {
                return true;
            }
            else {
                return false;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter name : ");
        String str = myObj.nextLine();
        int len = str.length();
        System.out.println(onlyDigits(str, len));
    }
}
