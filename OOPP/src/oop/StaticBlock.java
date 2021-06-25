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
public class StaticBlock {
    static int id;
    static String  name;
    
    static void info(int i,String n){
        id = i;
        name = n;
    }
    
    static void display(){
        System.out.println(id);
        System.out.println(name);
    }
}
