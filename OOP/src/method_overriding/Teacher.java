/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method_overriding;

/**
 *
 * @author imrul
 */
public class Teacher extends Person{
    String qualification;
    
    
    @Override
    void displayInformation(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(qualification);
    }
}
