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
public class BreakDemo {
    public static void main(String[] args) {
        for(int i = 1;i<=100;i++)
        {
            if(i==10)
            {
                break;
            }
            System.out.println(i);
        }
    }
}
