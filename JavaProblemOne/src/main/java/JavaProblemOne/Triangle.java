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
public class Triangle extends Area{
    private double base;
    private double height;
    
    public Triangle(double base,double height){
        this.base=base;
        this.height=height;
    }

    @Override
    public double getArea() {
        return 0.5*base*height; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
