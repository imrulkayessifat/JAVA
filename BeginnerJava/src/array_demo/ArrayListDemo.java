/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_demo;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author imrul
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(20);
        number.add(-3);
        number.add(18);
        number.add(30);
        number.add(92);
        number.add(0);
        number.add(50);
        Collections.sort(number);
        Collections.sort(number,Collections.reverseOrder());
        
    }
}
