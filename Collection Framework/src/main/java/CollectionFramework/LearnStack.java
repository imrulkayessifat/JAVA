/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionFramework;

import java.util.Stack;

/**
 *
 * @author imrul
 */
public class LearnStack {
    public static void main(String[] args) {
        
        Stack<String>animals = new Stack<>();
        
        animals.push("lion");
        animals.push("dog");
        animals.push("horse");
        animals.push("cat");
        
        System.out.println("Stack : "+animals);
        System.out.println(animals.peek());
        animals.pop();
        System.out.println(animals.peek());
    }
}
