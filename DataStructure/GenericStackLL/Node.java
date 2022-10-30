package DataStructure.GenericStackLL;

public class Node<type> {
    Node<type> next;
    type data;

    Node(type data){
        this.data=data;
        this.next=null;
    }

}
