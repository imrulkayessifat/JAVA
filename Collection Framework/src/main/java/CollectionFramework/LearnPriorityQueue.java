/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionFramework;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 *
 * @author imrul
 */
public class LearnPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(40);
        pq.offer(30);
        pq.offer(20);
        pq.offer(10);
        pq.offer(400);
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
        System.out.println(pq.peek());
    }
}
