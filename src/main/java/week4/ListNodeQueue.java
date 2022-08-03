package week4;

public class ListNodeQueue {

    public ListNode head;
    public ListNode tail;

    public boolean isEmpty() {
        return (head == null);
    }

    public void enQueue(int data) {
        ListNode newNode = new ListNode(data);

        if(isEmpty()){
            head = newNode;
            tail = newNode;
        } else {
            tail.link = newNode;
            tail = newNode;
        }
    }

    public void deQueue() {
        if (isEmpty()) {
            throw new NullPointerException();
        } else {
            head = head.link;
        }
    }
}
