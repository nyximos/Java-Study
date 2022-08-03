package week4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayQueueTest {
    ArrayQueue queue = new ArrayQueue(3);

    @Test
    public void enQueueTest() {
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);

        assertEquals(3, queue.arr[queue.tail]);
    }

    @Test
    public void IndexOutOfBoundsExceptionTest() {
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
    }

    @Test
    public void deQueue() {
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.deQueue();

        assertEquals(2, queue.tail);
    }

    @Test
    public void NullPointerExceptionTest() {
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
    }
}