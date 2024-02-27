public class PalidromeChecker {
public static boolean isPalindrome(String word) {
        if (word == null) {
            return false;
        }
        String reversed = "";

        word = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        return word.equals(reversed);
    }
}
