package srv.world.yeahbutstill;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TanpaReverseString {

    public boolean isPalindrome(String value) {

        for (int i = 0; i < value.length(); i++) {
            int indexAwal = i;
            int indexAkhir = value.length() - i - 1;

            if (value.charAt(indexAwal) != value.charAt(indexAkhir)) {
                return false;
            }
        }

        return true;

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
