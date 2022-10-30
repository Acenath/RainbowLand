package DataStructure.stackArray;

public class arrStack {
    int[] stackArray;
    int top;

    arrStack(int size){
        stackArray=new int[size];
        this.top=-1;
    }
    public void push(int data){
        stackArray[++top]=data;

    }
    public int pop(){
        if(isEmpty()){
            return -400000000;
        }
        top--;

    return stackArray[top+1];} //the removed integer value still exists in the stack but we can't reach that far by decreasing it

    public int peek(){
        if(isEmpty()){
            return -400000000;
        }
        return stackArray[top];
    }
    public boolean isEmpty(){

    return stackArray.length==0;}

    public String toString(){
        System.out.print("{");
        for(int i=0;i<top+1;i++){
            System.out.print(stackArray[i]);
            if(i+1!=top+1){
                System.out.print(",");
            }
        }
        System.out.print("}");
    return "";}

}
