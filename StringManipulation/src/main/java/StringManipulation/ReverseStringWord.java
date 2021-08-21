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
public class ReverseStringWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Original string : ");
 
        String originalStr = scanner.nextLine();
        scanner.close();
 
        String words[] = originalStr.split("\\s");
        String reversedString = "";
 
        //Reverse each word's position
        for (int i = 0; i < words.length; i++) { 
            if (i == words.length - 1) 
                reversedString = words[i] + reversedString; 
            else
                reversedString = " " + words[i] + reversedString; 
        } 
 
        // Displaying the string after reverse
        System.out.print("Reversed string : " + reversedString);
    }
}
