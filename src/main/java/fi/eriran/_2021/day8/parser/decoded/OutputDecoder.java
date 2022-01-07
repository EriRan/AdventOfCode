package fi.eriran._2021.day8.parser.decoded;

import fi.eriran._2021.day8.parser.decoded.util.AlphabeticalSorter;
import fi.eriran._2021.day8.parser.objects.DecodedSevenSegmentEntry;

import java.util.Map;

public class OutputDecoder {

    public DecodedSevenSegmentEntry decode(String[] outputValues, Map<String, Integer> decodedUniqueSignals) {
        StringBuilder outputStringBuilder = new StringBuilder();
        for (String outputValue : outputValues) {
            Integer decodedNumber = decodedUniqueSignals.get(AlphabeticalSorter.sortAlphabetically(outputValue));
            if (decodedNumber == null || decodedNumber == -1) {
                throw new IllegalStateException("No decoding done for value: " + outputValue);
            }
            outputStringBuilder.append(decodedNumber);
        }
        return new DecodedSevenSegmentEntry(Integer.parseInt(outputStringBuilder.toString()));
    }
}
