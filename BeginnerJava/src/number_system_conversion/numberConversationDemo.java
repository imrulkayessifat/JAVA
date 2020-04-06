/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number_system_conversion;

/**
 *
 * @author imrul
 */
public class numberConversationDemo {
    public static void main(String[] args) {
        String binary = "1010";
        Integer decimal = Integer.parseInt(binary, 2);
        System.out.println(decimal);
        
        
        int decimall = 15;
        String binaryy = Integer.toBinaryString(decimal);
    }
}
