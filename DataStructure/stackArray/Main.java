package DataStructure.stackArray;

public class Main {
    public static void main(String[] args) {
        arrStack numbers=new arrStack(3);
        numbers.push(1);
        numbers.push(2);
        numbers.push(3);

        System.out.println(numbers);
        numbers.pop();
        numbers.pop();
        numbers.pop();
        System.out.println(numbers);
    }
}
