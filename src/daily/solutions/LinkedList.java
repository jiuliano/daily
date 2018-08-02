package daily.solutions;

import daily.util.ListNode;

/**
 * Created by james on 1/19/2017.
 */
public class LinkedList {
    ListNode head;
    ListNode tail;

    public LinkedList() {
        head = tail = null;
    }

    public ListNode getHead() {
        return head;
    }

    public void addNode(ListNode node) {
        node.next = head;
		
		if ( head != null ) {
			head.prev = node;
		} else {
			tail = node;
		}
		
		head = node;
    }

    public void removeNode(ListNode node) {
        if ( node.next != null ) {
			node.next.prev = node.prev;
		} else {
			tail = node.prev;
		}
		
		if ( node.prev != null ) {
			node.prev.next = node.next;
		} else {
			head = node.next;
		}
		
		node.next = node.prev = null;
    }
}
