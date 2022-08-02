package week4.linkedList;

public class ListNode {
    private int data;
    public ListNode link;

    public ListNode() {
        this.data = 0;
        this.link = null;
    }

    public ListNode(int data){
        this.data = data;
        this.link = null;
    }

    public ListNode(int data, ListNode link) {
        this.data = data;
        this.link = link;
    }

    public int getData(){
        return this.data;
    }

    public ListNode add(ListNode head, ListNode nodeToAdd, int position) {
        ListNode node = head;

        for (int i=0; i < position-1; i++) {
            node = node.link;
        }

        nodeToAdd.link = node.link;
        node.link = nodeToAdd;
        return nodeToAdd;

    }

    public ListNode remove(ListNode head, int positionToRemove) {
        ListNode node = head;

        for (int i=0; i < positionToRemove-1; i++) {
            node = node.link;
        }

        ListNode temp = node.link;
        node.link = temp.link;
        temp.link = null;
        return temp;

    }

    public boolean contains(ListNode head, ListNode nodeTocheck) {
        ListNode node = head;

        while (node.link != null) {
            if (node == nodeTocheck){
                return true;
            }
            node = node.link;
        }
        return false;
    }

    public void printList(ListNode head) {
        ListNode temp = head;
        System.out.print(" 시작 : ");
        while (temp.link != null) {
            System.out.print(temp.data + ", ");
            temp = temp.link;
        }
        System.out.println(temp.data);
    }
}
