/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashSetDemo;

import java.util.HashSet;

/**
 *
 * @author imrul
 */
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String>fruitsName = new HashSet<String>();
        fruitsName.add("Apple");
        fruitsName.add("Orange");
        fruitsName.add("Banana");
        fruitsName.add("Strawberry");
        
        System.out.println(fruitsName);
        System.out.println(fruitsName.size());
        
        fruitsName.remove("Apple");
        fruitsName.clear();
        
        boolean value = fruitsName.isEmpty();
        System.out.println(value);
    }
}
