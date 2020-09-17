package queue;

import abstractclass.IAnimal;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueTest {
    public static void main(String[] args) throws InterruptedException {
//        Queue<String> linkList = new LinkedList<>();
//        linkList.add("cat");
//        linkList.add("dog");
//        linkList.add("hello");
//        System.out.println(linkList.peek());
//        while (!linkList.isEmpty()) {
//            System.out.println(linkList.poll());
//        }

        ArrayBlockingQueue<Integer> array = new ArrayBlockingQueue<>(5);
        array.put(1);
        array.put(2);
        array.put(3);
        array.put(4);
        array.put(5);
        array.put(6);

        while (!array.isEmpty()) {
            System.out.println(array.poll());
        }
    }


}
