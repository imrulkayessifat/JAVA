/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionFramework;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author imrul
 */
public class StudentSet {
    public static void main(String[] args) {
        
        Set<Student> studentSet=new HashSet<>();
        studentSet.add(new Student("anuj",2));
        studentSet.add(new Student("ramesh",4));
        studentSet.add(new Student("shivam",3));
        studentSet.add(new Student("rohit",6));
        studentSet.add(new Student("rohit",6));
        
        Student s1 = new Student("shahin",17);
        Student s2 = new Student("shahin",17);
        System.out.println(s1.equals(s2));
        
        System.out.println(studentSet);
        
    }
}
