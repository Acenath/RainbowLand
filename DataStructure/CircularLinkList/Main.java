package DataStructure.CircularLinkList;

public class Main {
    public static void main(String[] args) {
        circularLinkList cList=new circularLinkList();

        cList.addFirst(4);
        cList.addFirst(3);
        cList.addFirst(2);
        cList.addFirst(1);

        cList.addLast(5);
        cList.addLast(6);
        cList.addLast(7);

        cList.addAfter(11,cList.first.next);
        cList.addAfter(10,cList.first.next);

        cList.remove(11);
        cList.remove(2);
        System.out.println(cList);
    }
}
