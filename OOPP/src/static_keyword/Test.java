/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package static_keyword;

/**
 *
 * @author imrul
 */
public class Test {
    public static void main(String[] args) {
        Student student1 = new Student("imrul",101);
        Student student2 = new Student("kayes",102);
        
        student1.displayInformation();
        student2.displayInformation();
    }
}
