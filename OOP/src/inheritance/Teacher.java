/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author imrul
 */
public class Teacher extends Person{
    String qualification;
    
    void displayInformation2(){
        displayInformation1();
        System.out.println(qualification);
    }
}
