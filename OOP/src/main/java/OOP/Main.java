/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

/**
 *
 * @author imrul
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    int x = 5;
    // Static method
      static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }

  // Public method
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }
    public static void main(String[] args) {
        // TODO code application logic here
        myStaticMethod(); 
        Main myObj1 = new Main();
        myObj1.myPublicMethod();
        Main myObj2 = new Main();
        System.out.println(myObj1.x);
        System.out.println(myObj2.x);

        Second myobj3 = new Second();
        System.out.println(myobj3.y);
        myobj3.y=100;
        System.out.println(myobj3.y);
        myobj3.fullThrottle();
        myobj3.speed(300);
    }
    
}
