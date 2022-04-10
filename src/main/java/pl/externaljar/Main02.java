package pl.externaljar;

import org.apache.commons.lang3.StringUtils;

public class Main02 {
    public static String toggleChar(String str) {
        return StringUtils.swapCase(str);
    }

    public static void main(String[] args) {
        System.out.println(toggleChar("TaK"));
    }
}
