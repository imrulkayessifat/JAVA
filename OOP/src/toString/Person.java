/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toString;

/**
 *
 * @author imrul
 */
public class Person {
    String name;
    int age;
    Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return name + age;
    }
}
