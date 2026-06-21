package Singly_Linked_List;

/*

Problem Statement: Given the head of a linked list that may contain a cycle, 
                   return the starting point of that cycle. If there is no cycle in the linked list return null.

*/

class StartFinding extends InsertionOperations {

    public Node findStarting() {
        Node slow = head;
        Node fast = head;

        // Floyd's cycle to find, if there any loop exist. Because, starting pointing is created only if there
        // any loop in the Linked list.
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // If loop detected, then break the control.
            if (slow == fast) {
                // If loop exists, then checking the starting point of the loop.
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
            }
            return slow;
        }

        return null;
    }
}
