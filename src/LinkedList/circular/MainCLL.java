package LinkedList.circular;


public class MainCLL {
    public static void main(String[] args) {

        CLL list = new CLL();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
       // list.insertLast(66);
       // list.insertLast(77);
      //  list.insertFirst(5);

        list.display();
       // list.insertMiddleval(44, 77);
        list.delete(3);
        // System.out.println("Deleted " + list.delteFirst());
        //  System.out.println("Deleted " + list.deleteLast());
        //System.out.println("Deleted " + )3;
        list.display();
    }
}