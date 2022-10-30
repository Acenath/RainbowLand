package DataStructure.DoubleLinkedList;

public class Main {
    public static void main(String[] args) {
        doubleLinkedList list=new doubleLinkedList();

        /*list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);
         */
        list.insertFirst(1);
        list.insertFirst(0);
        list.insertFirst(-1);

        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);

       /* list.insertAfter(13,list.first);
        list.insertAfter(14,list.first.next);

        */

       /* list.removeFirst();
        list.removeLast();
        list.removeLast();

        */
        /*list.remove(list.last.previous);
        list.remove(list.first);
        list.remove(list.last);
        list.remove(list.first.next);
        list.remove(list.first.next);

         */





        list.goForwardFromHead();
        System.out.println("");
        list.goBackwarFromTail();
    }
}
