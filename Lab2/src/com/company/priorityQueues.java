package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class priorityQueues {
    public static void main (String[] args){
        PriorityQueue<String> queue1 = new PriorityQueue<String>();
        queue1.offer("George");
        queue1.offer("Jim");
        queue1.offer("John");
        queue1.offer("Blake");
        queue1.offer("Kevin");
        queue1.offer("Michael");

        System.out.println("queue1: "+queue1);
        PriorityQueue<String> queue2 = new PriorityQueue<String>();
        queue2.offer("George");
        queue2.offer("Katie");
        queue2.offer("Kevin");
        queue2.offer("Michelle");
        queue2.offer("Ryan");

        System.out.println("queue2: "+queue2);
        PriorityQueue<String> queue3 = new PriorityQueue<String>();
        while (queue1.size()>0){
            queue3.offer(queue1.remove());
        }
        while (queue2.size()>0){
            queue3.offer(queue2.remove());
        }
        System.out.println("Union:  "+queue3.stream().distinct().collect(Collectors.toList()));
    }

}