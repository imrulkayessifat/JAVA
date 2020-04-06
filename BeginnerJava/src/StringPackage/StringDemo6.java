/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringPackage;

/**
 *
 * @author imrul
 */
public class StringDemo6 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Anisul");
        System.out.println(str);
        str.append(" islam");
        str.reverse();
        str.delete(2, 5);
    }
}
