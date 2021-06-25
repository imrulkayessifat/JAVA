/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentList;

import java.util.LinkedList;

/**
 *
 * @author imrul
 */
public class Test {
    public static void main(String[] args) {
        LinkedList<Student>list = new LinkedList<Student>();
        
        Student s1 = new Student(1,"sifat","eleven");
        Student s2 = new Student(2,"rifat","eleven");
        Student s3 = new Student(3,"jahid","eleven");
        Student s4 = new Student(4,"hasan","eleven");
        
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        
        for(Student s : list){
            System.out.println(s.id+" "+s.name+" "+s.className);
            
        }
    }
}
