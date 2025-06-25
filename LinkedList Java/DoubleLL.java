public class DoubleLL {

    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size = 0;

    // add

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // removefirst

    public void removeFirst() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            size--;
            return;
        }

        head = head.next;
        head.prev = null;
        size--;
    }

    // addLast
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    //remove last

    public void removeLast(){
        if(head == null ){
            return;
        }
        if(head.next == null){
            head = null;
            size--;
            return;
        }
         
        Node temp = head;
        for (int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;
    }

    // print

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        dll.addFirst(8);
        dll.addFirst(7);
        dll.addFirst(6);
        dll.addFirst(5);
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        dll.removeLast();
        System.out.println(dll.size);

        dll.print();

    }
}
