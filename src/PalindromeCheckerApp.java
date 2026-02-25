import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        PalindromeStrategy strategy = new StackStrategy();
        String testInput = "level";

        long startTime = System.nanoTime();
        boolean isPalindrome = strategy.check(testInput);
        long endTime = System.nanoTime();

        long duration = endTime - startTime;

        System.out.println("Input : " + testInput);
        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println("Execution Time : " + duration + " ns");
    }
}

interface PalindromeStrategy {
    boolean check(String input);
}

class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
        if (input == null) return false;

        java.util.Stack<Character> stack = new java.util.Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        PalindromeStrategy strategy = new StackStrategy();
        String testInput = "level";

        long startTime = System.nanoTime();
        boolean isPalindrome = strategy.check(testInput);
        long endTime = System.nanoTime();

        long duration = endTime - startTime;

        System.out.println("Input : " + testInput);
        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println("Execution Time : " + duration + " ns");
    }
}

interface PalindromeStrategy {
    boolean check(String input);
}

class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
        if (input == null) return false;

        java.util.Stack<Character> stack = new java.util.Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}