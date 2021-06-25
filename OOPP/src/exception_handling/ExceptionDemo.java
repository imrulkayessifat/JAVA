/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception_handling;

/**
 *
 * @author imrul
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        try{
                int x = 10;
                int y = 0;
                int result = x/y;
                System.out.println(result);
        }catch(ArithmeticException e){
            System.out.println("Exception : " +e);
        }
        finally{
            System.out.println("Last line of the program");
        }
    }
}
