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
public class StringDemo5 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Anisul");
        System.out.println(sb);
        sb.append(" islam");
        sb.reverse();
        sb.delete(0,5);
        
        sb.setLength(5);
        
    }
}
