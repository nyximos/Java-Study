package week4;

public class ArrayStack {

    public int[] arr;
    public int top = -1;

    public ArrayStack(int length){
        arr = new int[length];
    }

    public void push(int data) {
        if (top < arr.length-1) {
            arr[++top] = data;
        } else {
            throw new StackOverflowError();
        }
    }

    public int pop() {
        if (top>0) {
            int temp = arr[top--];
            return temp;
        } else {
            throw new NullPointerException();
        }
    }

}
