package StringManipulation;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author imrul
 */
public class non_repeat_char {
        static final int NO_OF_CHARS = 256;
    static char count[] = new char[NO_OF_CHARS];
    static void getCharCountArray(String str)
    {
        for (int i = 0; i < str.length(); i++)
            count[str.charAt(i)]++;
    }
    
        static int firstNonRepeating(String str)
    {
        getCharCountArray(str);
        int index = -1, i;
 
        for (i = 0; i < str.length(); i++) {
            if (count[str.charAt(i)] == 1) {
                index = i;
                break;
            }
        }
 
        return index;
    }
    
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter Text : ");
        String str = myObj.nextLine();
        
        int index = firstNonRepeating(str);
        if(index==-1){
            System.out.println("Either all characters are repeating or string is empty");
        }else{
            System.out.println(str.charAt(index));
        }
    }
}
