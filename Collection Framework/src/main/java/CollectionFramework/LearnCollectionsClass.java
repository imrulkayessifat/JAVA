/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author imrul
 */
public class LearnCollectionsClass {
    public static void main(String[] args) {
        List<Integer>list = new ArrayList<>();
        list.add(34);
        list.add(12);
        list.add(24);
        list.add(9);
        list.add(9);
        list.add(9);
        list.add(11);
        list.add(32);
        list.add(29);
        System.out.println("min element : "+Collections.min(list));
        System.out.println("max element : "+Collections.max(list));
        System.out.println(Collections.frequency(list, 9));
        Collections.sort(list,Comparator.reverseOrder());
        System.out.println(list);
        
        List<Student>list1 = new ArrayList<>();
        list1.add(new Student("Anuj",2));
        list1.add(new Student("Bikrom",4));
        list1.add(new Student("imrul",9));
        list1.add(new Student("kayes",6));
        
        Student s1 = new Student("Rakib",2);
        Student s2 = new Student("Rohit",10);
        
        Collections.sort(list1,new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name); //To change body of generated methods, choose Tools | Templates.
            }
        });
        System.out.println(list1);
        
    }
}
