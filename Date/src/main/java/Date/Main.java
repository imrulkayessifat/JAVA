/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date;

/**
 *
 * @author imrul
 */
import java.time.LocalDate;  // import the LocalDate class
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Main {  
  public static void main(String[] args) {  
    LocalDate myObj = LocalDate.now();  // Create a date object
    System.out.println(myObj);  // Display the current date
    LocalTime myObj1 = LocalTime.now();
    System.out.println(myObj1);
    LocalDateTime myObj3 = LocalDateTime.now();
    System.out.println(myObj3);
    System.out.println("");
    System.out.println("");
    LocalDateTime myDateObj = LocalDateTime.now();
    System.out.println("Before formatting: " + myDateObj);
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    String formattedDate = myDateObj.format(myFormatObj);
    System.out.println("After formatting: " + formattedDate);
  }  
}  
