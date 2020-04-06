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
public class CallByReference {
    String name;
    void change(CallByReference r2){
        r2.name = "Rubel";
    }
}
