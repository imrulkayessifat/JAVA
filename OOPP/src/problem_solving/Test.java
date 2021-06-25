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
public class Test {
    public static void main(String[] args) {
        Shape shape;
        shape = new Rectangle(10,20);
        shape.area();
        
        shape = new Triangle(10,20);
        shape.area();
        
        shape = new Circle(5);
        shape.area();
    }
}
