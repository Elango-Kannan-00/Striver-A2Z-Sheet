package Singly_Linked_List;

/*

Input: head = [1,2,3,4,5]
Output: [1,3,5,2,4]

*/

class Odd_Even extends InsertionOperations {
    public Node oddEvenIndexing() {
        Node odd = head;
        Node even = head.next;
        Node evenHead = even;

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;

        return head;
    }
}

public class Odd_Even_Indexing {
    public static void main(String[] args) {
        Odd_Even obj = new Odd_Even();

        obj.insertAtEnd(10);
        obj.insertAtEnd(20);
        obj.insertAtEnd(30);
        obj.insertAtEnd(40);
        obj.insertAtEnd(50);
        obj.insertAtEnd(60);
        obj.insertAtEnd(70);

        obj.display();
        obj.oddEvenIndexing();
        obj.display();
    }

}