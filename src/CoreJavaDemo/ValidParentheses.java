package CoreJavaDemo;

import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        // Test cases
        String test1 = "()[]{}";
        String test2 = "(]";
        String test3 = "([{}])";
        String test4 = "([)]";
        
        // Check each string and print whether it's valid
        System.out.println("Test1: " + isValid(test1));  // true
        System.out.println("Test2: " + isValid(test2));  // false
        System.out.println("Test3: " + isValid(test3));  // true
        System.out.println("Test4: " + isValid(test4));  // false
    }

    public static boolean isValid(String s) {
        // Stack to hold opening brackets
        Stack<Character> stack = new Stack<>();
        
        // Loop through each character in the string
        for (char c : s.toCharArray()) {
            // Push opening brackets to the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } 
            // Check closing brackets
            else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();  // Pop the matching opening bracket
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                // If no match is found or stack is empty when it shouldn't be
                return false;
            }
        }
        
        // At the end, stack should be empty if all brackets matched correctly
        return stack.isEmpty();
    }
}
