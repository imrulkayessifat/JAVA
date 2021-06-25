/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problems_solving;

/**
 *
 * @author imrul
 */
public class Box {
    double height,width,depth;
    
    Box(double h,double w,double d){
        height=h;
        width=w;
        depth=d;
    }
    
    void displayVol(){
        double vol = height*width*depth;
        System.out.println(vol);
    }
    
}
