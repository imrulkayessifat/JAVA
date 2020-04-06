/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomTest;

import java.util.Random;

/**
 *
 * @author imrul
 */
public class RandomN {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(10) +1;
        System.out.println(randomNumber);
        
        int ran = (int)(Math.random()*10);
        System.out.println(ran);
    }
}
