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
public class Triangle extends Shape{
    double base,height;
    Triangle(double base,double height){
        this.base = base;
        this.height = height;
    }
    double area(){
        return 0.5*base*height;
    }
}
