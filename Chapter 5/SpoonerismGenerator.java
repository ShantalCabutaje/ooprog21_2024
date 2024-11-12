import java.util.Scanner;

public class SpoonerismGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get two words from the user
        String word1 = getWord(scanner, "Word 1: ");
        String word2 = getWord(scanner, "Word 2: ");

        // Check if words are suitable for spoonerism
        if (isSuitable(word1) && isSuitable(word2)) {
            // Get spoonerized version
            String spoonerized = spoonerize(word1, word2);
            System.out.println(word1 + " and " + word2 + " spoonerized are " + spoonerized);
        } else {
            System.out.println(word1 + " and " + word2 + " are not good words to spoonerize.");
        }
    }

    // Prompts user for a word and returns it
    public static String getWord(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    // Checks if a word is suitable for spoonerism (has a vowel)
    public static boolean isSuitable(String word) {
        return vowelIndex(word) != -1;
    }

    // Finds the index of the first vowel in a word
    public static int vowelIndex(String word) {
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (isVowel(ch)) {
                return i;
            }
        }
        return -1; // No vowel found
    }

    // Checks if a character is a vowel (case-insensitive)
    public static boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }

    // Swaps the initial consonants and returns the spoonerized string
    public static String spoonerize(String word1, String word2) {
        int vowelIndex1 = vowelIndex(word1);
        int vowelIndex2 = vowelIndex(word2);

        if (vowelIndex1 == 0 || vowelIndex2 == 0) {
            // Words start with vowels - not suitable for spoonerism (optional handling)
            return word1 + " and " + word2 + " are not good words to spoonerize.";
        }

        StringBuilder sb1 = new StringBuilder(word1);
        StringBuilder sb2 = new StringBuilder(word2);

        sb1.replace(0, vowelIndex1, word2.substring(0, vowelIndex2));
        sb2.replace(0, vowelIndex2, word1.substring(0, vowelIndex1));

        return sb1.toString() + " " + sb2.toString();
    }
}