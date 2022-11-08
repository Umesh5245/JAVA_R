package LinkedList.doubly;

public class DLL {
    private Node head;
    private int size;

    public DLL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
        size++;
    }

    public Node find(int val) {
        Node temp = head;
        while (temp != null) {
            if (temp.value == val) {
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }


    public void insertMiddleval(int val, int after) {
        Node node = new Node(val);
        Node temp = find(after);
        while (temp != null) {
                node.next = temp.next;
                temp.next = node;
                node.prev = temp;
                if (node.next != null) node.next.prev = node;
                break;
        }
        size++;
    }


/*
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
*/

/*
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
*/

/*
    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
*/

/*
    public int delteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }
*/


    public void insertLast(int val) {
        Node node = new Node(val);
        Node last = head;
        node.next = null;
        if (head == null) {
            node.prev = null;
            head = node;
            return;
        }
        while (last.next != null) {
            last = last.next;
        }
        last.next = node;
        node.prev = last;
        size++;
    }


    public void display() {
        Node temp = head;
        Node last = null;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
            last = temp;
        }
        System.out.println("SEE YOU TATA BYE BYE");
        while (last != null) {
            System.out.println(last.value);
            last = last.prev;
        }

    }

    private class Node {

        private final int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
