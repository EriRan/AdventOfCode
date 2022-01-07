package fi.eriran._2021.day8.parser.decoded.util;

import java.util.Arrays;

public class AlphabeticalSorter {

    private AlphabeticalSorter() {
    }

    public static String sortAlphabetically(String uniqueSignal) {
        char[] asCharArray = uniqueSignal.toCharArray();
        Arrays.sort(asCharArray);
        return new String(asCharArray);
    }
}
