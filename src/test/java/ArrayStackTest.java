import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import week4.ArrayStack;


public class ArrayStackTest {

    @Test @DisplayName("push O")
    public void pushTest() throws Exception {
        ArrayStack stack = new ArrayStack(5);

        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(45);


        Assertions.assertEquals(stack.arr[stack.top], stack.arr[4]);
    }

    @Test @DisplayName("ArrayIndexOutOfBoundsException")
    public void ArrayIndexOutOfBoundsExceptionTest() throws Exception {
        ArrayStack stack = new ArrayStack(5);

        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(45);
        stack.push(6);

    }

    @Test @DisplayName("pop O")
    public void popTest() throws Exception {
        ArrayStack stack = new ArrayStack(5);
        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.pop();
        stack.pop();
    }

    @Test @DisplayName("NullPointerException")
    public void popTestFail() throws Exception {
        ArrayStack stack = new ArrayStack(5);
        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.pop();
        stack.pop();
        stack.pop();
    }

}
