/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author imrul
 */
public class LearnArrayList {
    public static void main(String[] args) {
        ArrayList<String> sName = new ArrayList<>();
        sName.add("sifat");
        
        List<Integer>list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        list.add(4);
        System.out.println(list);
        list.add(1,50);
        System.out.println(list);
        
        List<Integer>newList = new ArrayList();
        newList.add(150);
        newList.add(160);
        list.addAll(newList);
        System.out.println(list);
        System.out.println(list.get(1));
        list.remove(3);//for remove index
        list.remove(Integer.valueOf(50));//for remove value
        System.out.println(list);
        list.set(1,1000);
        System.out.println(list);
        System.out.println(list.contains(50));
        for(int i=0;i<list.size();i++)
        {
            System.out.println("The element is "+list.get(i));
        }
        for(Integer element:list){
            System.out.println("Foreach element is "+element);
        }
        Iterator<Integer>it = list.iterator();
        while(it.hasNext()){
            System.out.println("iterator "+it.next());
        }
        list.clear();
    }
}
