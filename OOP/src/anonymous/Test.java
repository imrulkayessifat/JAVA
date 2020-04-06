/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anonymous;

/**
 *
 * @author imrul
 */
public class Test {
    public static void main(String[] args) {
        Person p = new Person(){
            @Override
            void display(){
                System.out.println("anonymous classsss");
            }
        };
        p.display();
    }
}
