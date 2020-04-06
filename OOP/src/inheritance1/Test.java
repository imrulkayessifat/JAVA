/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance1;

/**
 *
 * @author imrul
 */
public class Test {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setName("imrul");
        t1.setAge(21);
        t1.setQualification("Msc");
        
        System.out.println(t1.getQualification());
        System.out.println(t1.getName());
        System.out.println(t1.getAge());
    }
}
