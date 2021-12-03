package fi.eriran._2021.day3;

import java.util.List;

public abstract class DiagnosticCalculator {

    public abstract int calculate(List<String> lines);

    protected char findMostCommonBit(List<String> lines, int currentIndex) {
        int zeroes = 0;
        int ones = 0;
        for (String oneLine : lines) {
            char bit = oneLine.charAt(currentIndex);
            switch (bit) {
                case '0':
                    zeroes++;
                    break;
                case '1':
                    ones++;
                    break;
                default:
                    throw new IllegalArgumentException("Unknown character encountered: " + bit);
            }
        }
        // I guess the amount of zeroes and ones can't be equal
        if (zeroes > ones) {
            return '0';
        } else {
            return '1';
        }
    }
}
