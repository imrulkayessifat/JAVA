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
public class Recursion {
  public static int sum(int k) {
    if (k > 0) {
      return k + sum(k - 1);
    } else {
      return 0;
    }
  } 
    public static int summ(int start, int end) {
    if (end > start) {
      return end + summ(start, end - 1);
    } else {
      return end;
    }
  }
  public static void main(String[] args) {
    int result = sum(10);
    System.out.println(result);
    int resultt = summ(5, 10);
    System.out.println(resultt);
  }
}
