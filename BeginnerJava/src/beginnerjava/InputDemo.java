/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beginnerjava;

import java.util.Scanner;

/**
 *
 * @author imrul
 */
public class InputDemo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number;
        double number1;
        number = input.nextInt();
        String name;
        name = input.nextLine();
        number1 = input.nextDouble();
        System.out.println(number+ " "+name+" "+number1);
    }
         
    
}
