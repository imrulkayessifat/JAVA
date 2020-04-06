package problems_solving;


import problems_solving.Box;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author imrul
 */
public class BoxVolume {
    public static void main(String[] args) {
        Box box1 = new Box(10,10,10);
        Box box2 = new Box(20,30,10);
        
        box1.displayVol();
        box2.displayVol();
        
    }
}
