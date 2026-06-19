package SingleLinkedList;

class DeletionOperations extends InsertionOperations {
    // Deletion operations.
    // 1. Delete at first.
    public Node deleteAtFirst() {
        if (head == null) {
            System.out.println("Invalid delete operation. Error: Null");
            return head;
        }

        head = head.next;

        return head;
    }

    // 2. Delete at last.
    public Node deleteAtEnd() {
        // Edge cases.
        if (head == null) {
            System.out.println("Invalid delete operation. Error: Null");
            return head;
        }

        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;

        return head;
    }

    // 3. Delete at Kth position.
    public Node deleteAtKPosition(int K) {
        // Edge cases.
        if (K < 1  || K > getSize() + 1) {
            System.out.println("Invalid delete operation. Error: Null");
            return head;
        }

        Node current = head;
        for (int i=1; i<K-1; i++) {
            current = current.next;
        }
        current.next = current.next.next;

        return head;
    }

}

public class Deletion {
    public static void main(String[] args) {
        DeletionOperations obj = new DeletionOperations();

        // Adding elements to the linked list.
        obj.insertAtEnd(10);
        obj.insertAtEnd(20);
        obj.insertAtEnd(30);
        obj.insertAtEnd(40);
        obj.insertAtEnd(50);
        obj.insertAtEnd(60);

        // The current linked list.
        obj.display();

        // Deleting at first.
        obj.deleteAtFirst();
        obj.display();

        // Deleting at end.
        obj.deleteAtEnd();
        obj.display();

        // Deleting at Kth position.
        obj.deleteAtKPosition(3);
        obj.display();

    }
}
