package DataStructure.combineNodes;

public class MyLinkedList {
    Node first, last;
    int size;

    public MyLinkedList() {
        first = null;
        last = null;
    }
    public void push(int data){
        Node expectedOne=new Node(data);
        if(this.first==null){
            this.first=expectedOne;
            if(this.last==null){
                this.last=expectedOne;
            }
        }
        else{
            last.next=expectedOne;
            last=expectedOne;
        }
        size++;
    }
    public MyLinkedList combinedNodes(MyLinkedList mylist, int k){
        int summ=0;
        MyLinkedList actual=new MyLinkedList();
        if(first==null || this.size<k){
            return null;
        }
        else{
            int count=0;
            Node temp=first;
            for(int i=0;i<size;i++){
                if(count>=k){
                    summ+=temp.data;
                }
                temp=temp.next;
                count++;
            }
        }
        Node temp1=first;
        for(int m=0;m<k;m++){
            actual.push(temp1.data);
            temp1=temp1.next;
        }
        actual.push(summ);

    return actual;}

    public String toString(){
        Node temp=first;
        while(temp!=null){
            System.out.print(temp.data);
            if(temp.next!=null){
                System.out.print("->");
            }

            temp=temp.next;
        }
    return "";}
}
