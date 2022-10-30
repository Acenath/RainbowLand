package DataStructure.GenericStackLL;

public class GenericStack<Type> {
    Node<Type> first,last;
    int size;

    GenericStack(){
        this.first=null;
        this.last=null;
        this.size=0;
    }

    public void push(Type data){
        Node<Type> expectedOne=new Node<>(data);
        if(this.last==null){
            this.last=expectedOne;
        }
        else{
           expectedOne.next=first;
        }
        this.first=expectedOne;
        size++;
    }
    public boolean isEmpty(){

    return size==0;}

    public Type peek(){
        if(isEmpty())
            return null;

    return first.data;}

    public Type pop(){
        if(isEmpty())
            return null;

        Type temp=first.data;
        Node<Type> nodeTemp=first.next;
        this.first.next=null;
        this.first=nodeTemp;
        size--;



       return temp;}

    public void print() {
        if (isEmpty())
            System.out.println();

        else {
            Type temp = peek();
            pop();
            System.out.print(temp);
            if(size!=0){
                System.out.print("<-");
            }
            print();
            push(temp);

        }
    }
}
