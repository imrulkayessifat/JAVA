/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author imrul
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author imrul
 */
public class Rectangle {  // Save as "Circle.java"
   // private instance variable, not accessible from outside this class
   private float length;
   private float width;
   
   // Constructors (overloaded)
   /** Constructs a Circle instance with default value for radius and color */
   public Rectangle() {  // 1st (default) constructor
      length=1.0f;
      width=1.0f;
   }
   
   public String toString() {
    return "Rectangle[length=" + length + " width=" + width + "]";
   }
   
   /** Constructs a Circle instance with the given radius and default color */
   public Rectangle(float l,float r) {  // 2nd constructor
      this.length = l;
      this.width = r;
   }
   public void setLength(float newRadius) {
        this.length = newRadius;
   }
 
   public void setWidth(float newRadius) {
        this.width = newRadius;
   }
   

   /** Returns the radius */
   public double getLength() {
     return length; 
   }
   public double getWidth() {
     return width; 
   }
   
   /** Returns the area of this Circle instance */
   public double getArea() {
      return length*width;
   }
   public double getPerimeter(){
       return 2*length+2*width;
   }
}