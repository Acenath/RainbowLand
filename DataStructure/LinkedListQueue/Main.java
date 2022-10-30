package DataStructure.LinkedListQueue;

public class Main {
    public static void main(String[] args) {
        Queue<String> words=new Queue<>();
        words.enqueue("Organ");
        words.enqueue("Mafyasu");


        System.out.println(words);
        System.out.println(words.dequeue());
        System.out.println(words);
    }
}
