/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaInitial;

/**
 *
 * @author imrul
 */
public class Method {
  static void myMethod() {
    System.out.println("I just got executed!");
  }

  static void strPass(String name,int age){
      System.out.println("imrul kayes "+name+" "+age);
  }
  static int rtnValue(int n){
      return 5+n;
  }
  
  static int plusMethodInt(int x, int y) {
    return x + y;
  }
  
  static double plusMethodDouble(double x, double y) {
    return x + y;
  }
  
  public static void main(String[] args) {
    myMethod();
    strPass("sifat",22);
    System.out.println(rtnValue(3));
    
    System.out.println("Method Overloading : ");
    int myNum1 = plusMethodInt(8, 5);
    double myNum2 = plusMethodDouble(4.3, 6.26);
    System.out.println("int: " + myNum1);
    System.out.println("double: " + myNum2);  
  }
}
