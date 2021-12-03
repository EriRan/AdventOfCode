package fi.eriran._2021.day3;

import fi.eriran._2021.day3.enums.BitPreference;
import fi.eriran._2021.day3.enums.DegreePreference;

import java.util.List;

public abstract class DiagnosticCalculator {

    public abstract int calculate(List<String> lines);

    /**
     * Find a bit from a vertical line with provided parameters
     *
     * @param lines            all lines to iterate
     * @param currentIndex     current "x" coordinate where we are at
     * @param bitPreference    Whether to prefer 1 or zero in case there are equal amount of bits
     * @param degreePreference Whether to search for the most common or least common bit
     * @return most common bit (1 or 0)
     */
    protected char findBit(List<String> lines, int currentIndex, BitPreference bitPreference, DegreePreference degreePreference) {
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

        return calculateBitWithPreferences(zeroes, ones, bitPreference, degreePreference);
    }

    private char calculateBitWithPreferences(int zeroes, int ones, BitPreference bitPreference, DegreePreference degreePreference) {
        int comparison = Integer.compare(zeroes, ones);
        switch (comparison) {
            case -1:
                return degreePreference == DegreePreference.MOST ? '1' : '0';
            case 0:
                return bitPreference == BitPreference.ONE ? '1' : '0';
            case 1:
                return degreePreference == DegreePreference.MOST ? '0' : '1';
            default:
                throw new IllegalStateException("Prevent compilation error");
        }
    }
}
