package srv.world.yeahbutstill;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OptimasiIterasiPalin {

    // tanpa pengulangan aka recursive
    private boolean isPalindromeRecursive(String value, int i) {

        if (i < value.length() / 2) {
            if (value.charAt(i) != value.charAt(value.length() - i - 1)) {
                return false;
            } else {
                return isPalindromeRecursive(value, i + 1);
            }
        } else {
            return true;
        }

    }

    public boolean isPalindrome(String value) {

        return isPalindromeRecursive( value, 0);

    }

    @Test
    void test() {
        isPalindrome("kodok");
    }

    @Test
    void testPalindrome() {
        Assertions.assertTrue(isPalindrome("a"));
        Assertions.assertTrue(isPalindrome("aba"));
        Assertions.assertTrue(isPalindrome("kodok"));
        Assertions.assertTrue(isPalindrome(""));

        System.out.println("-----Bukan Palindrome----");
        Assertions.assertFalse(isPalindrome("ab"));
        Assertions.assertFalse(isPalindrome("abab"));
        Assertions.assertFalse(isPalindrome("kodcok"));
        Assertions.assertFalse(isPalindrome("dani"));
    }

}
