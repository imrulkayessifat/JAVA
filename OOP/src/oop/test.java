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
public class test {
    public static void main(String[] args) {
 //       Teacher teacher1 = new Teacher();
        
//        teacher1.name = "Imrul Kayes";
//        teacher1.gender = "male";
//        teacher1.phone = 1736011747;
//        teacher1.setInformation("Imrul Kayes","male",1736011);
//        teacher1.displayInformation();//System.out.println(name+" "+gender+" "+phone);
    
        Teacher teacher2 = new Teacher("Hasan","male",2314234);
        teacher2.displayInformation();
        
        Teacher teacher3 = new Teacher();
        teacher3.displayInformation();
    }
    
    
}
