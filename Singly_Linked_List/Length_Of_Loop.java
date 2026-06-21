package Singly_Linked_List;

class Length extends InsertionOperations {

    public int findLength() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {

                int length = 1;
                fast = fast.next;
                while (slow != fast) {
                    fast = fast.next;
                    length++;
                }

                return length;
            }
        }
        return 0;
    }
}

public class Length_Of_Loop {
    public static void main(String[] args) {

        Length obj = new Length();

        obj.insertAtEnd(10);
        obj.insertAtEnd(20);
        obj.insertAtEnd(30);
        obj.insertAtEnd(40);
        obj.insertAtEnd(50);
        obj.insertAtEnd(60);

        // Create Loop
        // 60 -> 30
        Node thirdNode = obj.head.next.next; // Node containing 30

        Node temp = obj.head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = thirdNode;

        int length = obj.findLength();

        if (length > 0) {
            System.out.println("Loop Length: " + length);
        } else {
            System.out.println("No Loop Found");
        }
    }
}

/*

Before creating loop.
┌────┐    ┌────┐    ┌────┐    ┌────┐    ┌────┐    ┌────┐
│ 10 │──▶│ 20 │──▶│ 30 │──▶│ 40 │──▶│ 50 │──▶│ 60 │──▶ null
└────┘    └────┘    └────┘    └────┘    └────┘    └────┘

After temp.next = thirdNode;
┌────┐    ┌────┐    ┌────┐    ┌────┐    ┌────┐    ┌────┐
│ 10 │──▶│ 20 │──▶│ 30 │──▶│ 40 │──▶│ 50 │──▶│ 60 │
└────┘    └────┘    └────┘    └────┘    └────┘    └────┘
                     ▲                          │
                     └──────────────────────────┘
                     
*/