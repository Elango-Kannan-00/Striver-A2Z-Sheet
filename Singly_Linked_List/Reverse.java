package Singly_Linked_List;

class LinkedListReverse extends InsertionOperations {
    public Node reverseList() {
        // Declaring pointers for reversal.
        Node current = head;
        Node prev = null;
        Node front = null;

        while (current != null) {
            // Moving one point before.
            front = current.next;
            // Removing connection of first element, and add it to null, and then
            // one after another.
            current.next = prev;
            // Moving previous pointer to the next element.
            prev = current;
            // Moving current pointer to the next element.
            current = front;
        }
        // After the reverse operation, the head points to the first number (here 10),
        // So, when we return head, it only gives output as 10 -> null.
        // To avoid this, the prev pointer is assigned to head, because the prev pointer
        // will have the head of all the elements.
        // Note: The display method consumes current pointer, which is assigned to head.
        // So that, here we re-assigned the prev as head.
        head = prev;
        return head;
    }
}

public class Reverse {
    public static void main(String[] args) {
        LinkedListReverse obj = new LinkedListReverse();

        obj.insertAtEnd(10);
        obj.insertAtEnd(20);
        obj.insertAtEnd(30);
        obj.insertAtEnd(40);
        obj.insertAtEnd(50);
        obj.insertAtEnd(60);
        obj.insertAtEnd(70);

        System.out.println("Before reverse: ");
        obj.display();
        obj.reverseList();
        System.out.println("After reverse: ");
        obj.display();

    }
}
