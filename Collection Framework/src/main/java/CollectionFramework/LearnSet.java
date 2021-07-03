/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author imrul
 */
public class LearnSet {
    public static void main(String[] args) {
        //Set<Integer>set=new HashSet<>();//dont maintain order
        //Set<Integer>set=new LinkedHashSet<>();//for maintaining order
        Set<Integer>set=new TreeSet<>();//for sorting element
        set.add(32);
        set.add(22);
        set.add(42);
        set.add(31);
        set.add(12);
        set.add(35);
        set.add(32);
        System.out.println(set);
        set.remove(12);
        System.out.println(set);
        System.out.println(set.contains(42));
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        set.clear();
        System.out.println(set);
    }
}
