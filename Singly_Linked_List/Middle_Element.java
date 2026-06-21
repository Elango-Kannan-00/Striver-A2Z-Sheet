package Singly_Linked_List;

class Middle extends InsertionOperations {

    // Rabbit and Hare method to find the middle of linked list.
    // Optimal way than traditional method.
    // Time complexity - O(N/2)

    // This method will return the second middle element if the number of elements
    // in the linked list is even in number.
    public int findMiddle() {
        // Slower pointer
        Node slow = head;
        // Fast pointer
        Node fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.data;
    }

    // This method will return the first middle element if the number of elements
    // in the linked list is even in number.
    // public int findMiddle() {
    //     // Slower pointer
    //     Node slow = head;
    //     // Fast pointer
    //     Node fast = head.next;

    //     while (fast != null && fast.next != null) {
    //         fast = fast.next.next;
    //         slow = slow.next;
    //     }
    //     return slow.data;
    // }
}

public class Middle_Element {
    public static void main (String[] args) {
        Middle obj = new Middle();

        obj.insertAtEnd(10);
        obj.insertAtEnd(20);
        obj.insertAtEnd(30);
        obj.insertAtEnd(40);
        obj.insertAtEnd(50);
        obj.insertAtEnd(60);
        obj.insertAtEnd(70);

        int result = obj.findMiddle();
        System.out.println(result);

    }
}
