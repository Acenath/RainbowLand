package DataStructure.LinkedListQueue;

public class Queue<Type> {
    Node<Type> first;
    Node<Type> last;

    Queue(){
        this.first=null;
        this.last=null;
    }
    public void enqueue(Type data){
        Node<Type> expectedData=new Node<>(data);
        if(isEmpty()){
            this.first=expectedData;
        }
        else{
            this.last.next=expectedData;
        }
        this.last=expectedData;
    }

    public Type dequeue(){
        if(isEmpty()){
            return null;
        }
        Type temp=first.data;
        first=first.next;
    return temp;}

    public Type peek(){return this.first.data;}
    public boolean isEmpty(){return this.first==null;}


    public String toString(){
        Node<Type> temp=first;
        while(temp!=null){
            System.out.print(temp.data);
            if(temp!=last){
                System.out.print("<-");
            }
            temp=temp.next;
        }
    return "";}

}
