package LinkedList;

public class Main {
    public static void main(String[] args) {

        LL list = new LL();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(4);
        list.insertLast(66);
        list.insertLast(77);

        list.display();
    }
}