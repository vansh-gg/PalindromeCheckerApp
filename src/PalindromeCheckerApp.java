import java.util.LinkedList;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "level";

        LinkedList<Character> list = new LinkedList<>();

        for (char c : input.toCharArray()) {
            list.add(c);
        }

        boolean isPalindrome = true;

        while (list.size() > 1) {

            if (!list.removeFirst().equals(list.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input String: " + input);
        if (isPalindrome) {
            System.out.println("Result: The input string is a confirmed palindrome.");
        } else {
            System.out.println("Result: The input string is NOT a palindrome.");
        }
    }
}