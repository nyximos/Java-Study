package week4;

public class ListNodeStack {

    public ListNode head;

    public boolean isEmpty(){
        return (head == null);
    }

    public void push(int data) {
        if (isEmpty()) {
            ListNode newNode = new ListNode(data);
            head = newNode;
        } else {
            ListNode newNode = new ListNode(data, head);
            head = newNode;
        }
    }

    public int pop() {
        if (isEmpty()) {
            throw new NullPointerException();
        } else {
            int temp = head.getData();
            head = head.link;
            return temp;
        }
    }
}
