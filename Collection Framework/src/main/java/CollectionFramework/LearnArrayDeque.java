/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionFramework;

import java.util.ArrayDeque;

/**
 *
 * @author imrul
 */
public class LearnArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer>adq = new ArrayDeque<>();
        adq.offer(23);
        adq.offerFirst(12);
        adq.offerLast(45);
        System.out.println(adq);
        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());
        
        System.out.println(adq.poll());
        System.out.println("poll() : "+adq);
        
        System.out.println(adq.pollFirst());
        System.out.println("pollFirst() "+adq);
        
        System.out.println(adq.pollLast());
        System.out.println("pollLast() "+adq);
        
    }
}
