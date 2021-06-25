/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InnerClass;

/**
 *
 * @author imrul
 */
class OuterClass {
  int x = 10;
  int a = 500;
  class InnerClass {
    int y = 5;
  }
  
  class third{
    public int myInnerMethod() {
      return a;
    } 
  }
  
  static class staticClass{
      int z = 12;
  }
}
