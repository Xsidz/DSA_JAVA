public class LinkedList {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static Node head;
    public static Node tail;
    public static int size;

    // Add first

    // 1.create new node
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // 2. new node's next = head

        newNode.next = head;
        // 3.head = new Node
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx, int data) {
        if (head == null) {
            addFirst(data);
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("Ll is empty");
            return Integer.MAX_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MAX_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            return val;

        }
        Node temp = head;
        for (int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }

        int val = temp.next.data;
        temp.next = null;
        tail = temp;
        size--;
        return val;

    }

    public int searchIterative(int key) {
        Node temp = head;
        int idx = 0;
        while (temp.next != null) {
            if (temp.data == key) {
                return idx;
            }
            temp = temp.next;
            idx++;
        }
        return -1;
    }

    public int helperNode(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }

        int idx = helperNode(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public int recursiveSearch(int key) {
        return helperNode(head, key);
    }

    public void reverse() {
        Node curr = tail = head;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }

        head = prev;
    }

    public int removeNFromEnd(int idx) {
        if (idx < 0 || idx > size) {
            System.out.println("Enter the valid idex from end");
            return -1;
        }
        int n = size - idx;
        if (n == 0) {
            return removeFirst();
        }
        Node prev = head;
        int i = 0;
        while (i < n - 1) {
            prev = prev.next;
            i++;
        }
        Node temp = prev.next.next;
        int val = prev.next.data;
        prev.next = temp;
        return val;

    }

    public boolean checkPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }

        // step 1 find mod
        Node miNode = findMid(head);

        // step 2 reverse the half ll

        Node curr = miNode;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev; // head of the right half reversed linkedLst
        Node left = head;

        // check the values of right half to left half

        while (right != null) {
            if (right.data != left.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;

    }

    public Node findMid(Node head) {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void detectLoop() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                System.out.println("Cycle does Exist!!");
                return;
            }

        }
        System.out.println("Cycle does not exist!!");

    }

    public void removeCycle() {
        Node slow = head;
        Node fast = head;

        // Step 1: Detect cycle
        boolean cycleExists = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycleExists = true;
                break;
            }
        }

        // If no cycle, just return
        if (!cycleExists)
            return;

        // Step 2: Find start of cycle
        slow = head;
        Node prev = null;

        // Special case: cycle starts at head
        if (slow == fast) {
            // Move fast to the last node of the cycle
            while (fast.next != slow) {
                fast = fast.next;
            }
            fast.next = null; // Break the cycle
            return;
        }

        // General case
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // Step 3: Remove cycle
        prev.next = null;
    }

    private static Node getmid(Node head) {
        Node fast = head.next;
        Node slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow; // mid value
    }

    private Node mergeNodes(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next;
    }

    public Node mergeSort(Node head) {

        if (head == null || head.next == null) {
            return head;
        }
        // find mid
        Node mid = getmid(head);

        Node rightHead = mid.next;
        mid.next = null;

        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        return mergeNodes(newLeft, newRight);
    }

    public void zigZag(Node head) {
        // find mid
        Node mid = getmid(head);
        // reverse 2nd half
        Node curr = mid.next;
        mid.next =null;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node righth = prev;
        Node lefth = head;
        Node nextR;
        Node nextL;

        // compare and connect

        while (righth != null && lefth != null) {
            nextL = lefth.next;
            lefth.next = righth;
            nextR = righth.next;
            righth.next = nextL;

            righth = nextR;
            lefth = nextL;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(4);
        ll.addFirst(1);
        ll.addFirst(8);
        ll.addFirst(5);
        ll.addFirst(9);
        ll.addFirst(7);

        ll.print();

        head = ll.mergeSort(head);
        ll.print();

        ll.zigZag(head);
        ll.print();

    }
}
