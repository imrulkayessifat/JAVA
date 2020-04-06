/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dateDemo;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author imrul
 */
public class currentTime {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println(time);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        String s = time.format(formatter);
        System.out.println(s);
    }
}
