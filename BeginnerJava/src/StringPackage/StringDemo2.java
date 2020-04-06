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
public class StringDemo2 {
    public static void main(String[] args) {
        String firstName = "Anisul ";
        String lastName = "Islam";
        
        String fullName = firstName + lastName;
        String fN = firstName.concat(lastName);
        
        String upperName = fullName.toUpperCase();
        String lowerName = fullName.toLowerCase();
        
        boolean b = firstName.startsWith("A");
        boolean last = lastName.endsWith("m");
        
        String[] names = {"anis","himel","ruddur","niloy"};
        for(String x : names){
            System.out.print(" "+x);
        }
    }
}
