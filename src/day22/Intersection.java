package day22;
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class Intersection {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        while (headA != null) {

            ListNode temp = headB;

            while (temp != null) {

                if (headA == temp) {
                    return headA;
                }

                temp = temp.next;
            }

            headA = headA.next;
        }

        return null;
    }

    public static void main(String[] args) {
        System.out.println("Intersection Linked List");
    }
}