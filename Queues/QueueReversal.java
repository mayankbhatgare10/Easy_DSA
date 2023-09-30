/*
 *  Queue Reversal
 *  {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
 *  rv -> {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}
*/

import java.util.*;

public class QueueReversal {

    public static void reverse(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();
        while (!q.isEmpty()) {
            s.push(q.remove());
        }
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        reverse(q);
        System.out.println(q);
    }
}

/*
 * Output:
 * 10 9 8 7 6 5 4 3 2 1
 */


/*The provided Java code defines a class named `QueueReversal` that reverses the elements of a Queue using a Stack. Here's a short description of the code:

- The `reverse` method takes a Queue of integers as input and uses a Stack to reverse the order of elements in the Queue.
- It iterates through the original Queue and pushes each element onto the Stack, effectively reversing their order in the Stack.
- Then, it pops the elements from the Stack and adds them back to the original Queue, reversing the elements' order in the Queue itself.

In the `main` method, an example Queue `q` containing integers from 1 to 10 is created. The `reverse` method is called to reverse the order of elements in the Queue, and the modified Queue is printed to the console, demonstrating the reversal.*/
