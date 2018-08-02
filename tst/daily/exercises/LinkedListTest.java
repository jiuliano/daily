package daily.exercises;

import daily.util.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by james on 1/20/2017.
 */
public class LinkedListTest {
    @Test
    public void addNode() throws Exception {
        LinkedList linkedList = new LinkedList();

        linkedList.addNode(new ListNode("hello"));
        linkedList.addNode(new ListNode("hello"));
        linkedList.addNode(new ListNode("goodbye"));
        linkedList.addNode(new ListNode("say"));
        linkedList.addNode(new ListNode("I"));
        linkedList.addNode(new ListNode("hello"));
        linkedList.addNode(new ListNode("say"));
        linkedList.addNode(new ListNode("you"));

        ListNode node = linkedList.getHead();
        assertEquals(node.value, "you");
        node = node.next;
        assertEquals(node.value, "say");
        node = node.next;
        assertEquals(node.value, "hello");
        node = node.next;
        assertEquals(node.value, "I");
        node = node.next;
        assertEquals(node.value, "say");
        node = node.next;
        assertEquals(node.value, "goodbye");
        node = node.next;
        assertEquals(node.value, "hello");
        node = node.next;
        assertEquals(node.value, "hello");
        node = node.next;

        node = linkedList.getHead();
        for ( int n=0; n<2; n++ ) {
            node = node.next;
        }

        linkedList.removeNode(node);

        node = linkedList.getHead();
        linkedList.removeNode(node);

        node = linkedList.getHead();
        assertEquals(node.value, "say");
        node = node.next;
        assertEquals(node.value, "I");

        while ( node.next != null ) {
            node = node.next;
        }

        linkedList.removeNode(node);

        node = linkedList.getHead();
        int count = 0;
        while ( node != null ) {
            ListNode nextNode = node.next;
            linkedList.removeNode(node);
            node = nextNode;
            ++count;
        }

        assertEquals(count, 5);
        assertNull(linkedList.getHead());
    }
}