/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaProblemOne;

/**
 *
 * @author imrul
 */
public class Rectangle extends Area {
    private double length;
    private double width;
    
    public Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }

    @Override
    public double getArea() {
        return length*width; //To change body of generated methods, choose Tools | Templates.
    }
    
}
