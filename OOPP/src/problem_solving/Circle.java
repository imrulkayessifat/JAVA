/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem_solving;

/**
 *
 * @author imrul
 */
public class Circle extends Shape{
    
    Circle(double r){
        super(r,r);
    }
    void area(){
        double result = 3.1416*dim1*dim2;
        System.out.println(result);
    }
}
