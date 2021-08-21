/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringManipulation;

import java.util.Arrays;

/**
 *
 * @author imrul
 */
public class RemoveDuplicateChar {
    static String removeDuplicate(char str[], int n)
    {
        // Used as index in the modified string
        int index = 0;
 
        // Traverse through all characters
        for (int i = 0; i < n; i++)
        {
 
            // Check if str[i] is present before it
            int j;
            for (j = 0; j < i; j++)
            {
                if (str[i] == str[j])
                {
                    break;
                }
            }
 
            // If not present, then add it to
            // result.
            if (j == i)
            {
                str[index++] = str[i];
            }
        }
        return String.valueOf(Arrays.copyOf(str, index));
    }
    public static void main(String[] args) {
        char str[] = "geeksforgeeks".toCharArray();
        int n = str.length;
        System.out.println(removeDuplicate(str, n));
    }
}
