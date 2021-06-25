/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception_problem_solving;

import java.util.Scanner;

/**
 *
 * @author imrul
 */
public class ExceptionProblemDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while(true){
            try{
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            System.out.println(num1/num2);
            }catch(Exception e){
                System.out.println(e);
            }   
        }
        
        
    }
}
