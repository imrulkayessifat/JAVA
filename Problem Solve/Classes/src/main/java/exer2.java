/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author imrul
 */
public class exer2 {
   public static void main(String[] args) {
      // Test Constructors and toString()
      Circle1 c1 = new Circle1(1.1);
      System.out.println(c1);   // toString()
      Circle1 c2 = new Circle1(); // default constructor
      System.out.println(c2);

      // Test setter and getter
      c1.setRadius(2.2);
      System.out.println(c1);      // toString()
      System.out.println("radius is: " + c1.getRadius());

      // Test getArea() and getCircumference()
      System.out.printf("area is: %.2f%n", c1.getArea());
      System.out.printf("circumference is: %.2f%n", c1.getCircumference());
   }
}