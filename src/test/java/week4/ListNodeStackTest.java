package week4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import week4.ListNodeStack;

import static org.junit.jupiter.api.Assertions.*;

public class ListNodeStackTest {

    ListNodeStack stack = new ListNodeStack();

    @Test
    public void pustTest() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.head.getData());
    }


    @Test
    public void popTest() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        int pop = stack.pop();
        assertEquals(3,pop);
    }

    @Test
    public void nullPointerExceptionTest() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
    }
}
