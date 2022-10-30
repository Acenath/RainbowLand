package DataStructure.GenericStackArray;

public class Main {
    public static void main(String[] args) {
        GenericStack<Integer> numbers=new GenericStack<>(4);

        numbers.push(1);
        numbers.push(2);
        numbers.push(3);
        numbers.push(4);
        System.out.println(numbers);
        numbers.pop();
        numbers.pop();
        System.out.println(numbers);
        System.out.println(numbers.peek());
        System.out.println(numbers.isEmpty());
        numbers.pop();
        numbers.pop();
        System.out.println(numbers);
        System.out.println(numbers.isEmpty());
        System.out.println(numbers.pop());

        numbers.push(1);
        numbers.push(2);
        numbers.push(3);
        numbers.push(4);
        numbers.resize(8);
        numbers.push(5);
        numbers.push(6);
        numbers.push(7);
        numbers.push(8);
        System.out.println(numbers);




    }
}
