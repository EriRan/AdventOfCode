package fi.eriran._2021.day3;

import fi.eriran._2021.day3.enums.BitPreference;
import fi.eriran._2021.day3.enums.DegreePreference;

import java.util.List;

public abstract class DiagnosticCalculator {

    public abstract int calculate(List<String> lines);

    /**
     * Find a bit from a vertical line with provided parameters
     *
     * @param lines         all lines to iterate
     * @param currentIndex  current "x" coordinate where we are at
     * @param bitPreference Whether to prefer 1 or zero in case there are equal amount of bits
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

        return calculateBitWithPreferences(bitPreference, degreePreference, zeroes, ones);
    }

    private char calculateBitWithPreferences(BitPreference bitPreference, DegreePreference degreePreference, int zeroes, int ones) {
        if (BitPreference.ONE.equals(bitPreference)) {
            if (zeroes > ones) {
                return degreePreference == DegreePreference.MOST ? '0' : '1';
            } else if (zeroes == ones) {
                return '1';
            } else {
                return degreePreference == DegreePreference.MOST ? '1' : '0';
            }
        } else {
            if (ones > zeroes) {
                return degreePreference == DegreePreference.MOST ? '1' : '0';
            } else if (ones == zeroes) {
                return '0';
            } else {
                return degreePreference == DegreePreference.MOST ? '0' : '1';
            }
        }
    }
}
