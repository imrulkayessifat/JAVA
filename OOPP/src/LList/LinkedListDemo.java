/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LList;

import java.util.LinkedList;

/**
 *
 * @author imrul
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String>countryNames = new LinkedList<String>();
        countryNames.add("Bangladesh");
        countryNames.add("India");
        countryNames.add("Pakistan");
        countryNames.add("Nepal");
        countryNames.add(1,"Brazil");
        countryNames.addFirst("Australia");
        countryNames.addLast("japan");
        countryNames.remove("japan");
        countryNames.remove(3);
        countryNames.removeFirst();
        countryNames.removeLast();
        System.out.println(countryNames.getFirst()+" "+countryNames.getLast());
        
        
//        System.out.println(countryNames);
        for(String country : countryNames){
            System.out.println(country);
        }
        System.out.println(countryNames.size());
        countryNames.clear();
        System.out.println(countryNames);
    }
}
