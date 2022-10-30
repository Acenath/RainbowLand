package DataStructure.GenericStackLL;

public class Main {
    public static void main(String[] args) {
        GenericStack<String> words=new GenericStack<>();
        words.push("Orhan");
        words.push("Murat");
        words.push("Tuncer");
        words.push("LinkedList");
        words.print();

        words.pop();

        words.print();



    }
}
