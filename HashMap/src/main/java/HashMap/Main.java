/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashMap;

/**
 *
 * @author imrul
 */
import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    HashMap<String, String> capitalCities = new HashMap<String, String>();
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    System.out.println(capitalCities); 
    for (String i : capitalCities.keySet()) {
      System.out.println(i);
    }
    for (String i : capitalCities.values()) {
        System.out.println(i);
    }
    for (String i : capitalCities.keySet()) {
        System.out.println("key: " + i + " value: " + capitalCities.get(i));
    }
    System.out.println(capitalCities.get("England"));
    capitalCities.remove("England");
    System.out.println(capitalCities); 
    capitalCities.clear();
    System.out.println(capitalCities.size());
  }
}