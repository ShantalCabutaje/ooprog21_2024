import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        
        String cleanedString = inputString.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        
        boolean isPalindrome = true;
        for (int i = 0; i < cleanedString.length() / 2; i++) {
            if (cleanedString.charAt(i) != cleanedString.charAt(cleanedString.length() - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        
        if (isPalindrome) {
            System.out.println("This is a palindrome.");
        } else {
            System.out.println("This is not a palindrome.");
        }
    }
}