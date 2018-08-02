package daily.util;

/**
 * Created by james on 1/19/2017.
 */
public class ListNode {
    public Object value;
    public ListNode next;
    public ListNode prev;

    public ListNode(Object value) {
        this.value = value;
        next = prev = null;
    }
}
