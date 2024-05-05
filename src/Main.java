import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        palindrome();
    }

    public static void palindrome() {
        String text = new Scanner(System.in).nextLine();
        StringBuilder builder = new StringBuilder();
        StringBuilder append = builder.append(text);

        if (isPalindrome(append)) System.out.println("Palindrome");
        else System.out.println("Is not a palindrome");
    }

    public static StringBuilder reverseStringBuilderText(StringBuilder text) {
        StringBuilder reverseText = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            reverseText.append(text.charAt(i));
        }
        return reverseText;
    }

    public static boolean isPalindrome(StringBuilder text) {
        return text.toString().equals(reverseStringBuilderText(text).toString());
    }

}
