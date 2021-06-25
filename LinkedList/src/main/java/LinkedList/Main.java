/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

/**
 *
 * @author imrul
 */
import java.util.LinkedList;

public class Main { 
  public static void main(String[] args) { 
    LinkedList<String> cars = new LinkedList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);
    cars.addFirst("hello");
    System.out.println(cars);
    cars.addLast("world");
    System.out.println(cars);
    cars.removeFirst();
    System.out.println(cars.getFirst());
    cars.removeLast();
    
    System.out.println(cars.getLast());
  } 
}
