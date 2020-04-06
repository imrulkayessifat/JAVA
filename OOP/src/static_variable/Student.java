/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package static_variable;

/**
 *
 * @author imrul
 */
public class Student {
    static int count = 0;
    Student(){
        count++;
    }
    void totalStudent(){
        System.out.println(count);
    }
}
