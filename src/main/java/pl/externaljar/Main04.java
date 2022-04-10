package pl.externaljar;

import org.apache.commons.lang3.StringUtils;

public class Main04 {
    public static boolean checkPalindrome(String str) {
        str = StringUtils.deleteWhitespace(str);
        StringBuilder reverse = new StringBuilder();
        for ( int i = str.length() - 1; i >= 0; i-- )
            reverse.append(str.charAt(i));
        return str.equals(reverse.toString());
    }

    public static void main(String[] args) {
        System.out.println(checkPalindrome("k aj ak"));
    }
}
