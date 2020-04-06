/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author imrul
 */
public class Rectangle extends Shape{
    double length,width;
    
    Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }
    
    @Override
    double area(){
        return length*width;
    }
}
