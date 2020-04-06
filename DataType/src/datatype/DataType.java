/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datatype;

/**
 *
 * @author imrul
 */
public class DataType {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean b = true;
        char c = 'a';
        short s = 100;
        int i = 126587;
        float f = 12344.55f;
        double d = 10.2222;

        System.out.println("b = "+b);
        System.out.printf("b = %b\n",b);//format specifier

        System.out.println("c = "+c);
        System.out.printf("c = %c\n",c);
        System.out.println("s = "+s);
        System.out.printf("s = %d\n",s);
        System.out.printf("i = %d\n",i);
        System.out.println("f = "+f);
        System.out.printf("f = %.2f\n",f);
        System.out.println("d = "+d);
        System.out.printf("d = %f\n",d);
             
    }
    
}
