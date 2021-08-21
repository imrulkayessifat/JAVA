/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringManipulation;

import java.nio.charset.StandardCharsets;

/**
 *
 * @author imrul
 */
public class ByteToString {
    public static void main(String[] args) {
        try{
            byte[] b = "Morning".getBytes(StandardCharsets.UTF_8);     //byte array   
            String string = new String(b, StandardCharsets.UTF_8);   //string with "UTF-8" encoding  
            System.out.println(string);   
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
