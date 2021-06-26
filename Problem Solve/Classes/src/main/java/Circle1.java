/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author imrul
 */
public class Circle1 {  // Save as "Circle.java"
   // private instance variable, not accessible from outside this class
   private double radius;
   private String color;
   
   // Constructors (overloaded)
   /** Constructs a Circle instance with default value for radius and color */
   public Circle1() {  // 1st (default) constructor
      radius = 1.0;
      color = "red";
   }
   
   public String toString() {
    return "Circle[radius=" + radius + " color=" + color + "]";
   }
   
   /** Constructs a Circle instance with the given radius and default color */
   public Circle1(double r) {  // 2nd constructor
      this.radius = r;
      color = "red";
   }
   public void setRadius(double newRadius) {
        this.radius = newRadius;
   }
 
// Setter for instance variable color
    public void setColor(String newColor){
        color = newColor;
    }
   
   /** Returns the radius */
   public double getRadius() {
     return radius; 
   }
   
   /** Returns the area of this Circle instance */
   public double getArea() {
      return radius*radius*Math.PI;
   }
   public double getCircumference(){
       return 2*Math.PI*radius;
   }
}