/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashSet;

/**
 *
 * @author imrul
 */
import java.util.HashSet;

public class Main {
  public static void main(String[] args) {
    HashSet<String> cars = new HashSet<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("BMW");
    cars.add("Mazda");
    System.out.println(cars);
    for (String i : cars) {
        System.out.println(i);
    }
    System.out.println(cars.contains("Mazda"));
    cars.remove("Volvo");
    System.out.println(cars);
    System.out.println(cars.size());
    cars.clear();
    
  }
}