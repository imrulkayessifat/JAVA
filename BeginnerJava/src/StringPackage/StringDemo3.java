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
public class StringDemo3 {
    public static void main(String[] args) {
        String country = "     Bangladesh is my country   ";
        String s3 = country.trim();
        char ch = country.charAt(0);
        int value = country.codePointAt(0);
        int pos = country.indexOf('n');
        pos = country.lastIndexOf('n');
    }
}
