package fi.eriran._2021.day8.parser.decoded.groups;

import java.util.Map;

public class DecodedSevenSegmentGroupSixParser {

    public void process(String[] sixGroup, Map<String, Integer> decodedUniqueSignals) {

    }

    private String findDecodedSignalString(int decodedSignal, Map<String, Integer> decodedUniqueSignals) {
        return decodedUniqueSignals.entrySet().stream().filter(entry -> entry.getValue() == 1)
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Unable to find: " + decodedSignal))
                .getKey();
    }
}
