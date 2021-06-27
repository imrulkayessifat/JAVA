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
import java.util.*;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Calculte The area of Triangle : ");
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter The base of Triangle : ");
        double base = myObj.nextDouble();
        System.out.print("Enter The height of Triangle : ");
        double height = myObj.nextDouble();
        Triangle t1= new Triangle(base,height);
        System.out.println("Triangle Area is : "+t1.getArea());
        
        System.out.println("Calculte The area of Rectangle : ");
        Scanner myObj1 = new Scanner(System.in);
        System.out.print("Enter The length of Rectangle : ");
        double length = myObj1.nextDouble();
        System.out.print("Enter The width of Rectangle : ");
        double width = myObj1.nextDouble();
        Rectangle r1 = new Rectangle(length,width);
        System.out.println("Rectangle Area is : "+r1.getArea());
    }
    
}
