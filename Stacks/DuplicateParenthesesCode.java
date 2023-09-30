/*
 *   @Duplicate Parentheses
 *   Givee a balanced expression, find if contains duplicate parentheses or not. A  set of 
 *   parentheses are duplicate if the same subexpression is surrounded by multiple parentheses.
 * 
 *    -> Return a true if it contains duplicates else return false.
 * 
 *   example:  
 *            (i)  -> (((a+(b)))+(c+d))  => true
 *            (ii) -> ((((a)+(b))+c+d))  => true
 *            (iii)-> ((a+b)+(c+d))      => false
 *            (iv) -> (((a+b))+c)        => true
 */

import java.util.Stack;;

public class DuplicateParenthesesCode {

    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // closing
            if (ch == ')') {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if (count < 1) {
                    return true; // duplicate
                } else {
                    s.pop(); // opening pair
                }
            } else {
                // opening
                s.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str1 = "(((a+(b)))+(c+d))";
        System.out.println(isDuplicate(str1)); // false
        String str2 = "((a+b)+(c+d))";
        System.out.println(isDuplicate(str2)); // true

    }
}


/* The provided Java code defines a class named `DuplicateParenthesesCode` that checks if a given string contains duplicate parentheses. Here's a short description of the code:

- The `isDuplicate` method takes a string `str` as input and uses a stack to analyze the presence of duplicate parentheses.
- It iterates through each character in the string from left to right.
- When it encounters an opening parenthesis '(', it pushes it onto the stack.
- When it encounters a closing parenthesis ')', it checks the characters on the stack until it finds the corresponding opening parenthesis '('. It counts the number of characters between the opening and closing parentheses.
- If the count of characters between the parentheses is less than 1 (indicating duplicate parentheses), it returns `true`.
- If the count is greater than or equal to 1, it pops the opening parenthesis from the stack, indicating a valid pair.
- If the loop completes without finding any duplicate parentheses, it returns `false`.

In the `main` method, two example strings (`str1` and `str2`) are provided, and the `isDuplicate` method is called to check for duplicate parentheses in each string. The results are printed to the console.*/
