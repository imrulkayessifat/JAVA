/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package this_keyword;

/**
 *
 * @author imrul
 */
public class Person {
//    String name;
//    int age;
//    String haircolor;
//    
//    Person(String name,int age){
//        this.name = name;
//        this.age = age;
//    }
//    
//    Person(String name,int age,String haircolor){
//        this(name,age);
//        this.haircolor = haircolor;
//    }
    void message(){
        System.out.println("i am message method");
    }
    void display(){
//        System.out.println(name);
//        System.out.println(age);
//        System.out.println(haircolor);
          this.message();
          System.out.println("i am display method");
    }
}
