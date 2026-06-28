package Singly_Linked_List;

import java.util.Stack;

public class Delete_From_Back {
    public static void main (String[] args) {
        Delete obj = new Delete();

        obj.insertAtEnd(10);
        obj.insertAtEnd(20);
        obj.insertAtEnd(30);
        obj.insertAtEnd(40);
        obj.insertAtEnd(50);
        obj.insertAtEnd(60);
        obj.insertAtEnd(70);

        obj.display();
        obj.deleteNode(3);
        obj.display();
    }
}

class Delete extends InsertionOperations {
    public Node deleteNode (int N) {
        if (head == null){
            return null;
        }

        Stack<Node> stack = new Stack<>();

        Node current = head;

        while (current != null) {
            stack.push(current);
            current = current.next;
        }

        for (int i=0; i<N-1; i++) {
            stack.pop();
        }

        Node deleteNode = stack.pop();

        if (stack.isEmpty()) {
            return head.next;
        }

        Node prev = stack.pop();
        prev.next = deleteNode.next;

        return head;

    }
}
