/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaInitial;

/**
 *
 * @author imrul
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        String name = "John";
        int a = 10;
        float b=19.88f;
        char c = 'a';
        boolean d = true;
        System.out.println(name+" "+a+" "+b+" "+c+" "+d);
        byte myNum = 100;
        System.out.println(myNum);
        short myNum1 = 5000;
        System.out.println(myNum1);
        long myNum2 = 15000000000L;
        System.out.println(myNum2);
        double myNum3 = 19.99d;
        System.out.println(myNum3);
        char e = 65, f = 66, g = 67;
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);


        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0
        
        double myDouble1 = 9.78d;
        int myInt1 = (int) myDouble1; // Manual casting: double to int

        System.out.println(myDouble1);   // Outputs 9.78
        System.out.println(myInt1);      // Outputs 9
        
        String txt = "ABCDacvbfd";
        System.out.println("The length of the txt string is: " + txt.length());
        System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(txt.toLowerCase());   // Outputs "hello world"
        System.out.println(txt.indexOf("v"));
        String firstName = "John ";
        String lastName = "Doe";
        System.out.println(firstName.concat(lastName));
        String txtt = "It\' \\ We are the so-called \"Vikings\" from the north.";
        System.out.println(txtt);
        System.out.println(Math.max(5, 10));  
        System.out.println(Math.min(5, 10));  
        System.out.println(Math.sqrt(64));  
        System.out.println(Math.abs(-4.7)); 
        System.out.println((int)(Math.random() * 101));  // 0 to 100
        System.out.println(10 > 9);
        
        int time = 22;
        if (time < 10) {
          System.out.println("Good morning.");
        } else if (time < 20) {
          System.out.println("Good day.");
        } else {
          System.out.println("Good evening.");
        }
        
        int day = 4;
        switch (day) {
          case 6:
            System.out.println("Today is Saturday");
            break;
          case 7:
            System.out.println("Today is Sunday");
            break;
          default:
            System.out.println("Looking forward to the Weekend");
        }  
        for (int i = 10; i < 15; i++) {
        System.out.println(i);
      }

        
        int i = 0;
        while (i < 5) {
          System.out.println(i);
          i++;
        }
        
        int j = 0;
        do {
          System.out.println(j);
          j++;
        }
        while (j < 5);

        System.out.println("Break : ");
        for (i = 0; i < 10; i++) {
        if (i == 4) {
          break;
        }
        System.out.println(i);
        }
        
        System.out.println("Continue : ");
        for (i = 0; i < 10; i++) {
        if (i == 4) {
          continue;
        }
        System.out.println(i);
      }
        
      String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
      System.out.println(cars[0]);
      
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        int x = myNumbers[1][2];
        System.out.println(x); 
        
        System.out.println("Loop Array : ");
        
     int[][] myNumberss = { {1, 2, 3, 4}, {5, 6, 7} };
     for ( i = 0; i < myNumberss.length; ++i) {
        for( j = 0; j < myNumberss[i].length; ++j) {
           System.out.println(myNumberss[i][j]);
        }
     }
    }
    
}
