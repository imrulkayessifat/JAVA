/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringManipulation;

/**
 *
 * @author imrul
 */
import java.util.Scanner;  
public class ReverseString {
    public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.print("Enter name : ");
    String userName = myObj.nextLine();
    byte[] strAsByteArray = userName.getBytes();
    byte[] result = new byte[strAsByteArray.length];
    for (int i = 0; i < strAsByteArray.length; i++)
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];
 
    System.out.println(new String(result));
    }
}
