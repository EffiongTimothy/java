package chapter16;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class queueSample {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>(3);
        queue.offer(7);
        queue.add(5);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println(queue);



        Queue<Integer> queue2 = new ArrayBlockingQueue<>(4);

        queue2.add(1);
        queue2.add(2);
        queue2.add(3);
//        System.out.println(queue2.poll());
        System.out.println(queue2.remove(2));
        System.out.println(queue2.peek());
        queue2.offer(90);
        queue2.add(5);
        System.out.println(queue2);
    }

    }

