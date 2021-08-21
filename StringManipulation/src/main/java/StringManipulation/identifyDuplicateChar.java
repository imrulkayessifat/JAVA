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
public class identifyDuplicateChar {
    public static void main(String[] args) {
        Scanner myOBj = new Scanner(System.in);
        System.out.print("Enter String : ");
        
        String str = myOBj.nextLine();
        
        int[] count = new int[256];
        for(int i=0;i<str.length();i++)
        {
            count[str.charAt(i)]++;
        }
        
        for(int i=0;i<256;i++)
        {
            if(count[i]>1){
                System.out.println((char)(i) + ", count = " + count[i]);
            }
        }
    }
}
