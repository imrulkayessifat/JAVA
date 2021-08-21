/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringManipulation;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author imrul
 */
public class AnagramString {
    static boolean areAnagram(char[] str1, char[] str2)
    {
        // Get lenghts of both strings
        int n1 = str1.length;
        int n2 = str2.length;
 
        // If length of both strings is not same,
        // then they cannot be anagram
        if (n1 != n2)
            return false;
 
        // Sort both strings
        Arrays.sort(str1);
        Arrays.sort(str2);
 
        // Compare sorted strings
        for (int i = 0; i < n1; i++)
            if (str1[i] != str2[i])
                return false;
 
        return true;
    }
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        
        System.out.print("Enter FirstName : ");
        String str1 = myobj.nextLine();
        
        System.out.print("Enter SecondName : ");
        String str2 = myobj.nextLine();
        char[] ch1 = new char[str1.length()];
  
        // Copy character by character into array
        for (int i = 0; i < str1.length(); i++) {
            ch1[i] = str1.charAt(i);
        }
        
        char[] ch2 = new char[str2.length()];
  
        // Copy character by character into array
        for (int i = 0; i < str2.length(); i++) {
            ch2[i] = str2.charAt(i);
        }
        
        if (areAnagram(ch1, ch2))
            System.out.println("The two strings are"
                               + " anagram of each other");
        else
            System.out.println("The two strings are not"
                               + " anagram of each other");
    }
}
