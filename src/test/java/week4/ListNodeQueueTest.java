package week4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListNodeQueueTest {

    ListNodeQueue queue = new ListNodeQueue();

    @Test
    public void enQueueTest() {
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);

        assertEquals(1, queue.head.getData());
        assertEquals(3, queue.tail.getData());
    }

    @Test
    public void deQueueTest() {
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.deQueue();

        assertEquals(2, queue.head.getData());
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