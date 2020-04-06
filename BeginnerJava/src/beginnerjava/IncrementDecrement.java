/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beginnerjava;

/**
 *
 * @author imrul
 */
public class IncrementDecrement {
    public static void main(String[] args)
    {
        int x = 25;
        int y = x++;
        System.out.println(y);
        y=x;
        System.out.println(y);
        
        int m = 34;
        int n = --m;
        System.out.println(n);

    }
}
