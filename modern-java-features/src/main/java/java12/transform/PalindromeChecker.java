package java12.transform;

public class PalindromeChecker {

    boolean isPalindrome(String text) {
        // implement here
        // TIP: you can use StringBuilder.reverse method


        return text.equals(new StringBuilder(text).reverse().toString());
    }
}
