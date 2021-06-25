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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            OuterClass myOuter = new OuterClass();
            OuterClass.InnerClass myInner = myOuter.new InnerClass();
            System.out.println(myInner.y + myOuter.x);
            
            OuterClass.staticClass staticIn = new OuterClass.staticClass();
            System.out.println(staticIn.z);
            
            OuterClass.third thirdIn = myOuter.new third();
            System.out.println(thirdIn.myInnerMethod());
    }
    
}
