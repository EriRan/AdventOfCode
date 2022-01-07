package fi.eriran._2021.day8.parser.decoded.groups;

import java.util.Map;

public class DecodedSevenSegmentGroupFiveParser {

    public void process(String[] fiveGroup, Map<String, Integer> decodedUniqueSignals) {
        // Find the signal that has both segments of 1
        String signalForOne = findDecodedSignalString(1, decodedUniqueSignals);
        for (String fiveLetterSignal : fiveGroup) {
            // Number 3 has both segments of 1. 2 has only one and so does 5
            if (fiveLetterSignal.indexOf(signalForOne.charAt(0)) != 1
                    && fiveLetterSignal.indexOf(signalForOne.charAt(1)) != 1) {
                decodedUniqueSignals.put(fiveLetterSignal, 3);
            }
        }
    }

    private String findDecodedSignalString(int decodedSignal, Map<String, Integer> decodedUniqueSignals) {
        return decodedUniqueSignals.entrySet().stream().filter(entry -> entry.getValue() == 1)
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Unable to find: " + decodedSignal))
                .getKey();
    }
}
