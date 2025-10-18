import java.util.Queue;
import java.util.LinkedList;

public class QueuePractice {
    public static void main(String[] args) {
        Queue<String> strings = new LinkedList<>();

        strings.add("Alice");
        strings.add("Bob");
        strings.add("Charlie");
        strings.add("David");

        System.out.println("The queue is: " + strings);
        System.out.println("The person at the front is: " + strings.peek());
        strings.remove();
        System.out.println("After removing one person, the queue is: " + strings);
        strings.remove();
        System.out.println("After removing another person, the queue is: " + strings);
        System.out.println("The current size of the queue is: " + strings.size());
        System.out.println("Is the queue empty? " + strings.isEmpty());
    }
}