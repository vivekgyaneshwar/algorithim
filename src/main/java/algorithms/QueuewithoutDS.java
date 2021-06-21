package algorithms;

public class QueuewithoutDS {
    private int [] qarray= new int[200];
    private int front,rear,capacity;

    public QueuewithoutDS() {
        front=rear=0;
        capacity=qarray.length;
    }

    public int enqueue(int item){
        if(rear==capacity){
            System.out.println("Queue is full");
            return -1;
        }else{
           qarray[rear++]=item;
        }
        return 0;
    }

    public int dequeue(){
        int felement;
        if(front==rear){
            System.out.println("queue is empty");
            return -1;
        }else{
            felement=qarray[front];
            for(int i=0;i<rear-1;i++){
                qarray[i]=qarray[i+1];
            }
            qarray[rear]=0;rear--;
        }
        return felement;
    }
}
