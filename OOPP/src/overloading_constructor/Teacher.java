/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading_constructor;

/**
 *
 * @author imrul
 */
public class Teacher {
    String name,gender;
    int phone;
    
    Teacher(){
        System.out.println("no information");
    }
    Teacher(String n,String g){
        name =n;
        gender = g;
    }
    Teacher(String n,String g,int p){
        name =n;
        gender =g;
        phone = p;
    }
    void displayInformation(){
        System.out.println(name+" "+gender+" "+phone);
    }
}
