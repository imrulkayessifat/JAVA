/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author imrul
 */
public class Teacher {
    String name,gender;
    int phone;
    
//    void setInformation(String n,String g,int p){
//        name = n;
//        gender = g;
//        phone = p;
//    }
    
    Teacher(){
        System.out.println("no value");
    }
    Teacher(String na,String ge,int ph){
        name = na;
        gender = ge;
        phone = ph;
    }
    
    void displayInformation(){
                System.out.println(name+" "+gender+" "+phone);

    }
}
