
package Polymorphism;

public class TestPolymorphism {
    public static void main(String[] args) {
        Shape s1=new Circle(5.5,"red",false);
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
      //  System.out.println(s1.getRadius());
      
      
       Circle c1=(Circle)(s1);
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());
        
        
       Shape s2=new Rectangle(5.0,5.0,"red",false);
        System.out.println(s2);
        System.out.println(s2.getArea());
        System.out.println(s2.getPerimeter());
        System.out.println(s2.getColor());
        System.out.println(s2.isFilled());
      //  System.out.println(s1.getRadius());
      
      
    }
}
