/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread;

/**
 *
 * @author imrul
 */
public class Concurrency extends Thread {
  public static int amount = 0;

  public static void main(String[] args) {
    Concurrency thread = new Concurrency();
    thread.start();
    System.out.println(amount);
    amount++;
    System.out.println(amount);
  }

  public void run() {
    amount++;
  }
}
