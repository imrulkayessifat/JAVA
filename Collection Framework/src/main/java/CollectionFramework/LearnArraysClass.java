/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionFramework;

import java.util.Arrays;

/**
 *
 * @author imrul
 */
public class LearnArraysClass {
    public static void main(String[] args) {
        //int[] numbers = {1,2,3,4,5,6,7,8,9,10};
       // int index = Arrays.binarySearch(numbers,4);
       // System.out.println("The index of element 4 in the array list : "+index);
          
          int[] numbers = {4,3,5,8,6,10,12,6,9,50,21};
          Arrays.sort(numbers);
          Arrays.fill(numbers, 12);
          for(int i:numbers){
              System.out.print(i+" ");
          }
    }
}
