package LinkedList.single;


public class Main {
    public static void main(String[] args) {

        LL list = new LL();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertLast(66);
        list.insertLast(77);
        list.insertMiddle(44, 3);
        list.display();
        System.out.println("Deleted " + list.delteFirst());
        System.out.println("Deleted " + list.deleteLast());
        System.out.println("Deleted " + list.delete(4));
        list.display();
    }
}