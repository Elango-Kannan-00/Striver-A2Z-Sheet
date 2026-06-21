package Singly_Linked_List;

class LinkedList extends InsertionOperations {

    // Searching an element in a singly linked list.
    public void searching(int data) {
        Node current = head;
        
        boolean isFound = false;
        int result = 0;
        while (current.next != null) {
            if (current.data != data) {
                current = current.next;
            } else {
                isFound = true;
                result = current.data;
                break;
            }
        }

        if (isFound) {
            System.out.println(result);
        } else {
            System.out.println("No such element found!");
        }
    }
}

public class Searching extends InsertionOperations {
    public static void main (String[] args) {

        LinkedList obj = new LinkedList();

        obj.insertAtEnd(10);
        obj.insertAtEnd(20);
        obj.insertAtEnd(30);
        obj.insertAtEnd(40);
        obj.insertAtEnd(50);
        obj.insertAtEnd(60);

        obj.searching(30);
        obj.searching(100);

    }
}
