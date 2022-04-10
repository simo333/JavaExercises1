package pl.externaljar;

import org.apache.commons.lang3.StringUtils;

public class Main03 {
    public static String stringFromArray(String[] str) {
        return StringUtils.join(str);
    }

    public static void main(String[] args) {
        System.out.println(stringFromArray(new String[]{"Ala ", "ma ", "kota"}));
    }
}
