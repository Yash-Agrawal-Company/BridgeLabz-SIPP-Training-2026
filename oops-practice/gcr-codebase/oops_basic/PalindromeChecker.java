public class PalindromeChecker {
    private String text;

    public PalindromeChecker(String text) {
        this.text = text;
    }

    public boolean isPalindrome() {
        if (text == null) return false;
        String cleanText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0, right = cleanText.length() - 1;
        while (left < right) {
            if (cleanText.charAt(left) != cleanText.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public void displayResult() {
        System.out.println("Text: \"" + text + "\" is " + (isPalindrome() ? "" : "NOT ") + "a palindrome.");
    }

    public static void main(String[] args) {
        PalindromeChecker check1 = new PalindromeChecker("A man, a plan, a canal: Panama");
        check1.displayResult();
    }
}