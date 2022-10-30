package DataStructure.combineNodes;

public class Main {
    public static void main(String[] args) {
        MyLinkedList numbers=new MyLinkedList();
        numbers.push(1);
        numbers.push(2);
        numbers.push(3);
        numbers.push(4);
        System.out.println(numbers.combinedNodes(numbers,2));

        System.out.println(numbers);

    }

}
