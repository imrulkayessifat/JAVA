/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentList;

/**
 *
 * @author imrul
 */
public class Student {
    String name,className;
    int id;
    Student(int id,String name,String className){
        this.name=name;
        this.className=className;
        this.id = id;
    }
}
