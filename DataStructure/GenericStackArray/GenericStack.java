package DataStructure.GenericStackArray;

public class GenericStack<type> {
    type[] arrStack;
    int top;

    GenericStack(int size){
        this.arrStack=(type[]) new Object[size];
        this.top=-1;
    }

    public boolean isEmpty(){
        return top==-1;
    }
    public type peek(){
        if(isEmpty())
            return null;

    return arrStack[top];}

    public void push(type data){
        arrStack[++top]=data;
    } //pre incrementation ++top is equal to top+=1 before the statement itself
    public type pop(){
        if(isEmpty())
            return null;
        top--;
        return arrStack[top+1];
    }
    public void resize(int expectedSize){
        type[] temp=(type[]) new Object[expectedSize];//defining a new array with the expected size and then copy all of the data from the old one and then assign the new array as a main array
        for(int i=0;i<top+1;i++){
            temp[i]=arrStack[i];
        }
        arrStack=temp;
    }

    public String toString(){
        for(int i=0;i<top+1;i++){
            System.out.print(arrStack[i]);
            if(i+1!=top+1){
                System.out.print(",");
            }
        }

    return "";}




}
