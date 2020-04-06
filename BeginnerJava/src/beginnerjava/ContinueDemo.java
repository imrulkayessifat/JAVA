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
public class ContinueDemo {
    public static void main(String[] args) {
        for(int i = 1;i<=20;i++)
        {
            if(i==10)
            {
                continue;
            }
            System.out.println(i);
        }
        
    }
}
