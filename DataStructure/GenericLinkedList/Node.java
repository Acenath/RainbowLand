package DataStructure.GenericLinkedList;

public class Node<Type> {
    Node<Type> next;
    Type data;

    Node(Type data){
        this.data=data;
        this.next=null;
    }
}
