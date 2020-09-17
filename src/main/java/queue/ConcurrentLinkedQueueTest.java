package queue;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueueTest {
    public static void main(String[] args) {
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        concurrentLinkedQueue.add("Dog");
        concurrentLinkedQueue.add("Cat");
        while (!concurrentLinkedQueue.isEmpty()) {
            System.out.println(concurrentLinkedQueue.poll());
        }
    }
}
