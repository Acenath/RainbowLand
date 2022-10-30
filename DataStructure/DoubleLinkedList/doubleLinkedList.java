package DataStructure.DoubleLinkedList;

public class doubleLinkedList {
    nodeD first,last;

    doubleLinkedList(){
        this.first=null;
        this.last=null;
    }

    public void insertFirst(int x){
        nodeD expectedFirst=new nodeD(x);
        if(this.last==null){
            this.last=expectedFirst;
            }
        else{
            expectedFirst.next=first;
            first.previous=expectedFirst;
        }
        this.first=expectedFirst;

        }


    public void insertLast(int data){
        nodeD expectedOne=new nodeD(data);
        if(this.first==null){
            this.first=expectedOne;
        }
        else{
            expectedOne.previous=last;
            last.next=expectedOne;
        }
        this.last=expectedOne;

    }

    public void insertAfter(int x,nodeD prev){
        nodeD expectedAfter=new nodeD(x);
        expectedAfter.previous=prev;
        prev.next.previous=expectedAfter;
        expectedAfter.next=prev.next;
        prev.next=expectedAfter;
    }

    public void removeFirst(){
        first.next.previous=null;
        first=first.next;
    }

    public void removeLast(){
        last.previous.next=null;
        last=last.previous;
    }

    public void remove(nodeD notExpected){
        if(notExpected==first){
            removeFirst();
        }
        else if(notExpected==last){
            removeLast();
        }
        else{
            notExpected.previous.next=notExpected.next;
            notExpected.next.previous=notExpected.previous;
        }

    }

    public void goForwardFromHead(){
        nodeD temp=first;
        while(temp!=null){
            System.out.print(temp.data);
            if(temp.next!=null){
                System.out.print("<=>");
            }
            temp=temp.next;
        }
    }
    public void goBackwarFromTail(){
        nodeD temp=last;
        while(temp!=null){
            System.out.print(temp.data);
            if(temp.previous!=null){
                System.out.print("<=>");
            }
            temp=temp.previous;
        }
    }
}
