package Singly_Linked_List;

class InsertionOperations {
    Node head = null;

    // Creating a new node.
    public Node createNode(int data) {
        return new Node(data);
    }

    // Insert a node at first.
    public Node insertAtFirst(int data) {
        // Creating new node.
        Node newNode = createNode(data);

        // Handling edge case.
        if (head == null) {
            head = newNode;
            return newNode;
        }

        // Setting head to new node.
        newNode.next = head;
        head = newNode;

        return head;
    }

    // Insert at the end of list.
    public Node insertAtEnd(int data) {
        // Creating new node.
        Node newNode = createNode(data);

        // Edge cases.
        if (head == null) {
            head = newNode;
            return newNode;
        }

        // Setting the newnode at end.
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;

        return head;
    }

    // Insert at specified position.
    public Node insertAtKposition(int data, int K) {
        // Creating a node.
        Node newNode = createNode(data);

        // Edge cases.
        if (K < 0 || K > getSize() + 1) {
            System.out.println("Invalid position!");
            return null;
        }

        // If position is 1, then the newnode will be inserted immediately after head.
        if (K == 1) {
            return insertAtFirst(data);
        }

        // Setting up the new node at Kth position.
        Node current = head;
        for (int i = 1; i < K - 1 && current != null; i++) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;

        return head;
    }

    // Display method.
    public void display() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Size of linkedlist.
    public int getSize() {
        Node current = head;

        int count = 0;
        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }
}

public class Insertion {
    public static void main(String[] args) {
        InsertionOperations obj = new InsertionOperations();

        // Add element.
        obj.insertAtFirst(1);

        // Add a element at first.
        obj.insertAtFirst(0);
        obj.display();

        // Add a element at end.
        obj.insertAtEnd(3);
        obj.display();

        // Add an element at Kth position.
        obj.insertAtKposition(2, 2);
        obj.display();

    }
}
