package LinkedList.circular;

public class CLL {
    private Node head;
    private Node tail;
    private int size;

    public CLL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);

        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        tail = node;
        tail.next = head;
        size++;
    }

/*
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
*/


/*
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
*/


    public void delete(int val) {
        Node temp = head;
        if (temp == null) {
            return;
        }
        if(temp.value==val){
            head=temp.next;
            tail.next=head;
        }
        temp=temp.next;
        while (temp!=head) {
            if (temp.next.value == val) {
                temp.next =temp.next.next;
                break;
            }
            temp=temp.next;
        }
    }


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


/*
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
*/


    public void display() {
        Node temp = head;
        if (head != null) {
            do {
                System.out.println(temp.value);
                temp = temp.next;
            } while (head != temp);
        }
        System.out.println("SEE YOU TATA BYE BYE");


    }

    private class Node {

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
