/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraction;

/**
 *
 * @author imrul
 */
public class Test {
    public static void main(String[] args) {
        MobileUser ms;
        ms = new Rahim();
        ms.call();
        ms.sendMessage();
        
        ms = new Karim();
        ms.call();
        ms.sendMessage();
    }
}
