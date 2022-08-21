package solutions;

//  ((({{[]}}))){{{


public class SinglyLinkedList {

    public static void main(String[] args) {
        String input = "((({{}})))[]{}}";

        Stack stack = new Stack();
        for (char c : input.toCharArray()) {
            if (c == '(' ||
                c == '{' ||
                c == '[') {
                stack.push(c);
                continue;
            }
            if (stack.pop() == null) {
                System.out.println("WRONG BRACKETS!");
                return;
            }
            char previousElement = stack.pop();
            if ((previousElement == '(' && c != ')') ||
                (previousElement == '{' && c != '}') ||
                (previousElement == '[' && c != ']')) {
                System.out.println("WRONG BRACKETS!");
                return;
            }

        }
        if (stack.pop() != null) {
            System.out.println("WRONG BRACKETS!");
            return;
        }

        System.out.println("CORRECT BRACKETS!");

    }

}

class Stack {

    Node head;

    public Stack() {
    }

    public void push(Character value) {
        Node newNode = new Node(value, this.head);
        this.head = newNode;
    }

    public Character pop() {
        if (this.head == null) {
            return null;
        }
        Character value = this.head.value;
        this.head = this.head.next;
        return value;
    }
}

class Node {

    Character value;
    Node next;

    public Node(Character value, Node next) {
        this.value = value;
        this.next = next;
    }
}


