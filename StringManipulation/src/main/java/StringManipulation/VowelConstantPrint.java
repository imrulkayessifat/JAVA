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
public class VowelConstantPrint {
        public static void count(String str)
    {
        int vow = 0, con = 0;
        // reference String which contains all the vowels //
        String ref = "aeiouAEIOU";
        for (int i = 0; i < str.length(); i++) {
            // Check for any special characters present in
            // the given string
            if ((str.charAt(i) >= 'A'
                 && str.charAt(i) <= 'Z')
                || (str.charAt(i) >= 'a'
                    && str.charAt(i) <= 'z')) {
                if (ref.indexOf(str.charAt(i)) != -1)
                    vow++;
                else
                    con++;
            }
        }
        System.out.println("Number of Vowels = " + vow
                           + "\nNumber of Consonants = "
                           + con);
    }
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter text : ");
        String str = myObj.nextLine();
        count(str);
    }
}
