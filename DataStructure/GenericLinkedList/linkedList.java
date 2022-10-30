package DataStructure.GenericLinkedList;

public class linkedList<Type> {
    Node<Type> first,last;

    linkedList(){
        this.first=null;
        this.last=null;
    }
    public boolean isEmpty(){return this.first==null;}

    public void insertFirst(Type data){
        Node<Type> expectedFirst=new Node<>(data);
        if(isEmpty()){
            this.last=expectedFirst;
        }
        else{
            expectedFirst.next=first;
        }
        this.first=expectedFirst;
    }

    public void insertLast(Type data){
        Node<Type> expectedLast=new Node<>(data);
        if(isEmpty()){
            this.first=expectedLast;
        }
        else {
            Node<Type> temp = this.first;
            while (temp != last) {
                temp = temp.next;
            }
            temp.next = expectedLast;
        }
        this.last=expectedLast;
    }

    public void insertAfter(Node<Type> intended,Type data){
        Node<Type> expectedOne=new Node<>(data);
        if(isEmpty()){
            this.first=expectedOne;
            this.last=expectedOne;
        }
        else{
            expectedOne.next=intended.next.next;
            intended.next=expectedOne;
        }
    }

    public String toString(){
        Node<Type> temp=first;
        while(temp!=null){
            System.out.print(temp.data);
            if(temp!=last)
                System.out.print("->");
            temp=temp.next;
        }
    return "";}
}
