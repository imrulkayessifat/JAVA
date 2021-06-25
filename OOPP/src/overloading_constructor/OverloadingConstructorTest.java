/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading_constructor;

/**
 *
 * @author imrul
 */
public class OverloadingConstructorTest {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        Teacher teacher2 = new Teacher("anis","male");
        teacher2.displayInformation();
        Teacher teacher3 = new Teacher("rahman","male",24324);
        teacher3.displayInformation();
    }
}
