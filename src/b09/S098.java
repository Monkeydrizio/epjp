package b09;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class S098 {
    public static void main(String[] args) {
        Queue<Integer> q = aQueue();
        System.out.println(q);

        if (q.offer(18)) {
            System.out.println("18 has been added");
        }

        System.out.println("The first element in queue (or throws exception): " + q.element());
        System.out.println("Again, the first element (or null): " + q.peek());

        System.out.println("Remove (or throws excpetion): " + q.remove());
        System.out.println("Poll (or null): " + q.poll());
        System.out.println(q);
    }

    private static Queue<Integer> aQueue() {
        return new LinkedList<>(Arrays.asList(5, -3, -1, 12, 27, 5));
    }
}
