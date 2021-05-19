package srv.world.yeahbutstill;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeTest {

    public boolean isPalindrome(String value) {

        String temp = "";

        for (int i = value.length() - 1; i >= 0; i--) {
            temp = temp + value.charAt(i);
        }
        System.out.println(temp);

        return temp.equals(value);
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
