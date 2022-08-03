import org.junit.jupiter.api.*;
import week4.ListNode;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {

    ListNode listNode = new ListNode();

    ListNode five = new ListNode(5);
    ListNode four = new ListNode(4, five);
    ListNode three = new ListNode(3, four);
    ListNode two = new ListNode(2, three);
    ListNode one = new ListNode(1, two);
    ListNode zero = new ListNode(0, one);


    @AfterEach
    void printAll(){
        listNode.printList(zero);
    }


    @DisplayName("더했음")
    @Test()
    public void addTest() throws Exception {
        ListNode six = new ListNode(6);
        zero.add(zero, six, 3);
    }

    @DisplayName("삭제했음")
    @Test
    public void removeTest() throws Exception {
        listNode.remove(zero, 3);
    }

    @DisplayName("포함되어있음")
    @Test
    public void containTest() throws Exception {
        boolean containStatus = zero.contains(zero, three);
        assertTrue(containStatus);
    }

    @DisplayName("포함안되있음")
    @Test
    public void excludeTest() throws Exception {
        ListNode seven = new ListNode(7);
        boolean containStatus = zero.contains(zero, seven);
        assertEquals(false, containStatus);
    }


}
