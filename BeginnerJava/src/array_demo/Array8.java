/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_demo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author imrul
 */
public class Array8 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        System.out.println(number.size());
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3,40);
        System.out.println(number.size());
        for(int x:number){
            System.out.print(" "+x);
        }
        System.out.println("");
        Iterator itr = number.iterator();
        while(itr.hasNext()){
            System.out.print(" "+itr.next());
        }
        number.remove(2);
        number.removeAll(number);
        number.clear();
        boolean check = number.isEmpty();
        boolean contain = number.contains(30);
        int pos = number.indexOf(40);
        number.set(4,50);
        number.get(0);
        
    }
}
