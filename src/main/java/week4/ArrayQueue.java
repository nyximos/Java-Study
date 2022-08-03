package week4;

public class ArrayQueue {

    public int head;
    public int tail;
    public int queueSize;
    public int[] arr;

    public ArrayQueue(int queueSize){
        head = -1;
        tail = -1;
        this.queueSize = queueSize;
        arr = new int[queueSize];
    }

    public boolean isEmpty() {
        return (head == tail);
    }

    public boolean isFull() {
        return (tail == queueSize - 1);
    }

    public void enQueue(int data) {
        if(isFull()){
            throw new IndexOutOfBoundsException();
        } else {
            arr[++tail] = data;
        }
    }

    public void deQueue() {
        if(isEmpty()){
            throw new NullPointerException();
        } else {
            ++head;
        }
    }
}
