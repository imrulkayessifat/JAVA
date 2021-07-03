/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author imrul
 */
public class LearnMap {
    public static void main(String[] args) {
        //Map<String,Integer> numbers = new HashMap<>();
        Map<String,Integer> numbers = new TreeMap<>();//sorting key
        numbers.put("one",1);
        numbers.put("two",2);
        numbers.put("three",5);
        numbers.put("four",14);
        numbers.put("five",15);
        numbers.remove("five");
        if(!numbers.containsKey("one")){
            numbers.put("one",1);
        }
        numbers.putIfAbsent("four", 4);
        System.out.println(numbers);
        
        for(Map.Entry<String,Integer>e:numbers.entrySet()){
            System.out.println(e);
            System.out.print(e.getKey());
            System.out.println(e.getValue());
        }
        
        for(String key: numbers.keySet()){
            System.out.println(key);
        }
        for(Integer value: numbers.values()){
            System.out.println(value);
        }
        System.out.println(numbers.containsValue(3));
        System.out.println(numbers.isEmpty());
        numbers.clear();
    }
}
