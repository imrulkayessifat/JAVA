/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionFramework;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author imrul
 */
public class LearnLinkedListQueue {
    public static void main(String[] args) {
        Queue<Integer>queue=new LinkedList();
        queue.offer(12);//add()
        queue.offer(24);
        queue.offer(36);
        queue.offer(48);
        System.out.println(queue);
        System.out.println(queue.poll());//remove()
        System.out.println(queue);
        System.out.println(queue.peek());//element()
    }
}
