package DataStructure.QR;

public class Main {
    public static void main(String[] args) {
        QueueArr<Integer> numbers=new QueueArr<>(3);
        numbers.enqueue(1);
        numbers.enqueue(2);
        numbers.enqueue(3);
        numbers.dequeue();

        System.out.println(numbers);


    }
}
