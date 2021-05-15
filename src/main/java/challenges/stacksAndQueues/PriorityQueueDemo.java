package challenges.stacksAndQueues;

// Java program to demonstrate the
// working of PriorityQueue
import java.util.*;

class PriorityQueueDemo {

    // Main Method
    public static void main(String args[])
    {
        // Creating empty priority queue
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();

        // Adding items to the pQueue using add()
        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(15);

        // Printing the top element of PriorityQueue
        System.out.println(pQueue.peek());

        // Printing the top element and removing it
        // from the PriorityQueue container
        System.out.println(pQueue.poll());

        // Printing the top element again
        System.out.println(pQueue.peek());

        // Creating empty priority queue
        PriorityQueue<String> pSQueue = new PriorityQueue<String>();
        pSQueue.add("C");
        pSQueue.add("D");
        pSQueue.add("O");
        pSQueue.add("I");
        pSQueue.add("N");

        System.out.println(pSQueue.poll());
        System.out.println(pSQueue.poll());
    }
}

