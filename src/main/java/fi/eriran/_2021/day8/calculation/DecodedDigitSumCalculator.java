package fi.eriran._2021.day8.calculation;

import fi.eriran._2021.day8.parser.objects.DecodedSevenSegmentEntry;

import java.util.List;

public class DecodedDigitSumCalculator {

    public long calculate(List<DecodedSevenSegmentEntry> decodedSevenSegmentEntries) {
        return decodedSevenSegmentEntries.stream()
                .mapToInt(DecodedSevenSegmentEntry::getOutputValue)
                .sum();
    }
}
