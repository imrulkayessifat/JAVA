/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method_overloading;

/**
 *
 * @author imrul
 */
public class Method_overloading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Overload ob = new Overload();
        ob.add();
        ob.add(4,5);
        ob.add(3.34,2.434);
        ob.add(2,6,8);
    }
    
}
