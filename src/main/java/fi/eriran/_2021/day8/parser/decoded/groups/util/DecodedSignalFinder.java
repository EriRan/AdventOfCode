package fi.eriran._2021.day8.parser.decoded.groups.util;

import java.util.Map;

public class DecodedSignalFinder {

    private DecodedSignalFinder() {
    }

    public static String findDecodedSignalString(int decodedSignal, Map<String, Integer> decodedUniqueSignals) {
        return decodedUniqueSignals.entrySet().stream().filter(entry -> entry.getValue() == 1)
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Unable to find: " + decodedSignal))
                .getKey();
    }
}
