package Singly_Linked_List;

import java.util.HashSet;
import java.util.Set;

class LoopFinding extends InsertionOperations {

    // Time complexity - O(N), Extra space (Hashset) - O(1)
    public boolean detectLoop() {
        Set<Node> set = new HashSet<>();

        Node current = head;

        while (current != null) {
            if (set.contains(current)) {
                return true;
            }

            set.add(current);
            current = current.next;
        }
        return false;
    }

    // Another method to find the loop in LL.
    // Time complexity - O(N), Space complexity - O(1);

    // public boolean detectLoop() {
    // Node slow = head;
    // Node fast = head;

    // while (fast != null && fast.next != null) {
    // slow = slow.next;
    // fast = fast.next.next;

    // if (slow == fast) {
    // return true;
    // }
    // }

    // return false;
    // }
}

public class Detect_Loop {
    public static void main(String[] args) {

        LoopFinding obj = new LoopFinding();

        obj.insertAtEnd(10);
        obj.insertAtEnd(20);
        obj.insertAtEnd(30);
        obj.insertAtEnd(40);
        obj.insertAtEnd(50);
        obj.insertAtEnd(60);
        obj.insertAtEnd(70);

        boolean result = obj.detectLoop();
        if (result)
            System.out.println("Loop detected!");
        else
            System.out.println("No Loop detected!");

    }
}