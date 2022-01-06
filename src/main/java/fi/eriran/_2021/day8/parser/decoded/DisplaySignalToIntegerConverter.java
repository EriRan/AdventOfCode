package fi.eriran._2021.day8.parser.decoded;

import fi.eriran._2021.day8.parser.objects.SevenSegmentDisplay;

public class DisplaySignalToIntegerConverter {

    /**
     * Returns -1 if received an unrecognizable number. There are plenty of those running around
     */
    public int convert(SevenSegmentDisplay display) {

        if (display.isD() && display.isE() && display.isA() && display.isG() && display.isB() && display.isC()) {
            return 0;
        }
        if (display.isD() && display.isA() && display.isF() && display.isE() && display.isC()) {
            return 2;
        }
        if (display.isD() && display.isA() && display.isF() && display.isB() && display.isC()) {
            return 3;
        }
        if (display.isD() && display.isE() && display.isF() && display.isB() && display.isC()) {
            return 5;
        }
        if (display.isD() && display.isE() && display.isF() && display.isG() && display.isB() && display.isC()) {
            return 6;
        }
        if (display.isD() && display.isE() && display.isA() && display.isF() && display.isB() && display.isC()) {
            return 9;
        }
        return -1;
    }
}
