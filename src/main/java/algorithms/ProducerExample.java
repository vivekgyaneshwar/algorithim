package algorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ProducerExample {

    public static void main(String[] args) throws InterruptedException {
        final PC pc= new PC();
        Thread t1= new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2= new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }) ;
        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}

class PC{
    private LinkedList<Integer> buffer= new LinkedList<Integer>();
    int capacity=2;

    public void produce() throws InterruptedException{
        int value=0;
        while (true) {
            synchronized (this) {
                while (buffer.size() == capacity) {
                    wait();
                }
                buffer.add(value++);
                System.out.println("producing"+value);
                notify();
                Thread.sleep(1000);
            }
        }
    }

    public void consume() throws InterruptedException{
        while (true) {
            synchronized (this) {
                while (buffer.size() == 0) {
                    wait();
                }

                Integer val = buffer.removeFirst();
                System.out.println("consuming"+val);
                notify();
                Thread.sleep(1000);
            }
        }
    }
}
