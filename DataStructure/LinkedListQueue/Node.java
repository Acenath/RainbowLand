package DataStructure.LinkedListQueue;

public class Node<Type> {
    Type data;
    Node<Type> next;

    Node(Type data){
        this.data=data;
        this.next=null;
    }
}
