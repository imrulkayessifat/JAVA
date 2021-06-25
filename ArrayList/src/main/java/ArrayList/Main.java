/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

/**
 *
 * @author imrul
 */
import java.util.ArrayList;
import java.util.Collections;
public class Main {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);
    for (int i = 0; i < cars.size(); i++) {
      System.out.println(cars.get(i));
    }
    for (String i : cars) {
      System.out.println(i);
    }
    System.out.println(cars.get(0));
    cars.set(1, "Opel");
    System.out.println(cars.get(1));
    cars.remove(0);
    System.out.println(cars);
    System.out.println(cars.size());
    cars.clear();
    System.out.println(cars.size());
    
    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
    myNumbers.add(30);
    myNumbers.add(15);
    myNumbers.add(20);
    myNumbers.add(25);
    Collections.sort(myNumbers);
    for (int i : myNumbers) {
      System.out.println(i);
    }
  }
}
