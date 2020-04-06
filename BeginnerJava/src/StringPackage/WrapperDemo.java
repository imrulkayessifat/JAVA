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
public class WrapperDemo {
    public static void main(String[] args) {
        int x = 30;
        Integer y = Integer.valueOf(x);
        
        Integer z = x;
        
        Double d = new Double(10.25);
        System.out.println(d);
        
        double e = d.doubleValue();
        e = d;
        
    }
}
