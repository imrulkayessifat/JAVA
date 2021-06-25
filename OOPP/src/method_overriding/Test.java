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
public class Test {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.name="sifat";
        t1.age = 21;
        t1.qualification = "msc";
        
        t1.displayInformation();
    }
}
