package fi.eriran._2021.day8.calculation;

import fi.eriran._2021.day8.parser.objects.RawSevenSegmentEntry;

import java.util.List;

public class EasyDigitCountCalculator {

    public int count(List<RawSevenSegmentEntry> entries) {
        int count = 0;
        for (RawSevenSegmentEntry entry : entries) {
            count += countFromOneEntry(entry.getOutputValues());
        }
        return count;
    }

    private int countFromOneEntry(String[] outputValues) {
        int oneEntryCount = 0;
        for (String outputValue : outputValues) {
            int length = outputValue.length();
            if (isEasyDigit(length)) {
                oneEntryCount++;
            }
        }
        return oneEntryCount;
    }

    /**
     * Easy digits always have a certain amount of segments in the seven segment display which no other number has.
     * 1 == 2 segments
     * 4 == 4 segments
     * 7 == 3 segments
     * 8 == 7 segments
     */
    private boolean isEasyDigit(int length) {
        return length == 2 || length == 4 || length == 3 || length == 7;
    }

}
