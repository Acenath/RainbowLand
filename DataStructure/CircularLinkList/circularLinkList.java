package DataStructure.CircularLinkList;

public class circularLinkList {
    Node first,last;

    circularLinkList(){
        this.first=null;
        this.last=null;
    }
    public void addFirst(int data){
        Node expectedFirst=new Node(data);
        if(this.first==null) {
            this.first = expectedFirst;
            if (this.last == null) {
                this.last = expectedFirst;
            }
            first.previous = last;
            last.next = first;
        }

        else{
            last.next=expectedFirst;
            expectedFirst.next=first;
            expectedFirst.previous=last;
            first.previous=expectedFirst;
            first=expectedFirst;
        }
    }

    public void addLast(int data){
        Node expectedLast=new Node(data);
        if(this.first==null){
            this.first=expectedLast;
            if(this.last==null){
                this.last=expectedLast;
            }
            first.previous = last;
            last.next = first;

        }
        else{
            last.next=expectedLast;
            expectedLast.next=first;
            expectedLast.previous=last;
            first.previous=expectedLast;
            last=expectedLast;
        }
    }

    public void addAfter(int data,Node prev){
        Node expectedAfter=new Node(data);
        if(this.first==null){
            this.first=expectedAfter;
            if(this.last==null){
                this.last=expectedAfter;
            }
            first.previous=last;
            last.next=first;
        }
        else{
            prev.next.previous=expectedAfter;
            expectedAfter.previous=prev;
            expectedAfter.next=prev.next;
            prev.next=expectedAfter;
        }
    }

    public void remove(int n){
        Node temp=first;
        int count=0;
        while(count<=0){
            if(temp.next==first){
                count++;
            }
            if (temp.data == n) {
                temp.next.previous=temp.previous;
                temp.previous.next=temp.next;
                temp.next=null;
                temp.previous=null;
                break;
            }
            temp=temp.next;
        }

    }

    public String toString(){
        Node temp=first;
        int count=0;
        while(count<=0){
            if(temp==last){
                count++;
            }
            System.out.print(temp.data);
            System.out.print(",");

            temp=temp.next;
        }
        System.out.print("....");

    return "";}
}


