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
public class Occurrence {
    public static int count(String s, char c)
    {
        int res = 0;
 
        for (int i=0; i<s.length(); i++)
        {
            // checking character in string
            if (s.charAt(i) == c)
            res++;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter Text : ");
        String str = myObj.nextLine();
        char c = 'e';
        System.out.println(count(str,c));
    }
}
