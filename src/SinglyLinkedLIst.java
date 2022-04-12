import java.util.List;
import org.w3c.dom.Node;

public class SinglyLinkedLIst {

//    "{{}}[()()]()"
//    "{{}}[()()()]"
//


//  110001010100100001010010


    // 11 -> 00 -> 01

    public static void main(String[] args) {
        System.out.println(checkBrackets("{{}}[()()]()"));
    }

    public static boolean checkBrackets(String input) {
        String[] split = input.split("");
        Stack stack = new Stack(null);

        for (String element : split) {
            if (element.equals("{") || element.equals("[") || element.equals("(")) {

                stack.put(element);
            }

            String lastOpeningBracket = stack.pop();

            if(
                !(lastOpeningBracket.equals("{") && element.equals("}") ) &&
                !(lastOpeningBracket.equals("[") && element.equals("]") ) &&
                !(lastOpeningBracket.equals("(") && element.equals(")") )
            ) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}


class Stack {

    ListNode head;


    public Stack(ListNode head) {
        this.head = head;
    }

    public void put(String newElement) {
        ListNode newNode = new ListNode(newElement, null);
        newNode.next = this.head;
        this.head = newNode;
    }

    public String pop() {
        ListNode oldHead = this.head;
        this.head = this.head.previous;
        this.head.next = null;
        return oldHead.value;
    }

    public boolean isEmpty() {
        return this.head == null;
    }
}

class ListNode {

    public ListNode(String value, ListNode next) {
        this.value = value;
        this.next = next;
    }

    String value;
    ListNode next;
    ListNode previous;
}
