/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashMapDemo;

import java.util.HashMap;

/**
 *
 * @author imrul
 */
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String>customer = new HashMap<Integer,String>();
        customer.put(1,"sifat");
        customer.put(2,"rifat");
        customer.put(3,"hasan");
        customer.put(4,"habib");
        
        System.out.println(customer.get(1));
    }
}
