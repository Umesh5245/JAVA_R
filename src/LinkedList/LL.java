package LinkedList;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) tail = head;
        size++;
    }

    public void insertMiddle(int val, int index) {
        if (index == 0) insertFirst(val);
        if (index == size) insertLast(val);
        int i = 1;
        Node temp = head;
        while (i < index) {
            temp = temp.next;
            if (index - 1 == i) {
                temp.next = new Node(val, temp.next);
                break;
            }
            i++;
        }
        size++;
    }

    public int delete(int index) {
        if (index == 0) delteFirst();
        if (index == size - 1) deleteLast();
        Node prevnode = get(index - 1);
        Node nextnode = get(index + 1);
        int val = prevnode.next.value;
        prevnode.next = nextnode;
        size--;
        return val;
    }

    public int deleteLast() {
        if (size <= 1) {
            return delteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int delteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public void insertLast(int val) {
        if (tail == null) insertFirst(val);
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println("SEE YOU TATA BYE BYE");
    }

    private static class Node {

        private final int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
