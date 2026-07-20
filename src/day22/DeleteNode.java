package day22;
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class DeleteNode {

    public void deleteNode(ListNode node) {

        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static void main(String[] args) {

        Main obj = new Main();

        ListNode head = new ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(9);

        obj.deleteNode(head.next); // Delete node 5

        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}