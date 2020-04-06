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
public class TemperatueConverter {
    public static void main(String[] args)
    {
        double celcius,faren;
        Scanner input = new Scanner(System.in);
        
        celcius = input.nextDouble();
        faren = (1.8)*celcius+32;
        System.out.println(faren);
    }
}
