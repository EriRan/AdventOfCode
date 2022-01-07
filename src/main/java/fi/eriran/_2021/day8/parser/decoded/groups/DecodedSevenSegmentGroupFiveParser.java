package fi.eriran._2021.day8.parser.decoded.groups;

import fi.eriran._2021.day8.parser.decoded.groups.util.DecodedSignalFinder;

import java.util.Map;

public class DecodedSevenSegmentGroupFiveParser {

    /**
     * Find 2, 3 and 5. We expect to have 1,4,7 and 8 processed at this point.
     *
     * @param fiveGroup            unique signals that have five letters
     * @param decodedUniqueSignals map of already decoded signals
     */
    public void process(String[] fiveGroup, Map<String, Integer> decodedUniqueSignals) {
        if (fiveGroup.length != 3) {
            throw new IllegalStateException("Expecting five group to contain 3 numbers but it contained: " + fiveGroup.length);
        }
        // Find the signal that has both segments of 1
        String signalForOne = DecodedSignalFinder.findDecodedSignalString(1, decodedUniqueSignals);
        int indexOfThree = -1;
        for (int i = 0; i < 3; i++) {
            String fiveLetterSignal = fiveGroup[i];
            // Number 3 has both segments of 1. 2 has only one and so does 5
            if (fiveLetterSignal.indexOf(signalForOne.charAt(0)) != -1
                    && fiveLetterSignal.indexOf(signalForOne.charAt(1)) != -1) {
                decodedUniqueSignals.put(fiveLetterSignal, 3);
                indexOfThree = i;
                break;
            }
        }
        if (indexOfThree == -1) {
            throw new IllegalStateException("Unable to find three!");
        }

        String signalForFour = DecodedSignalFinder.findDecodedSignalString(4, decodedUniqueSignals);
        String[] arrayForTwoAndThree = createArrayForTwoAndThree(fiveGroup, indexOfThree);
        String fiveLetterSignal = arrayForTwoAndThree[0];
        // Count matching segments for four. 2 has 2, 5 has 3
        int matches = 0;
        for (char characterFromThree : signalForFour.toCharArray()) {
            if (fiveLetterSignal.indexOf(characterFromThree) != -1) {
                matches++;
            }
        }
        if (matches < 2 || matches > 3) {
            throw new IllegalStateException("Unexpected count of matches. Expected 2 or 3 but got: " + matches);
        }
        if (matches == 2) {
            decodedUniqueSignals.put(fiveLetterSignal, 2);
            decodedUniqueSignals.put(arrayForTwoAndThree[1], 5);
        } else {
            decodedUniqueSignals.put(fiveLetterSignal, 5);
            decodedUniqueSignals.put(arrayForTwoAndThree[1], 2);
        }
    }

    private String[] createArrayForTwoAndThree(String[] fiveGroup, int indexOfThree) {
        String[] twoAndThree = new String[2];
        int nextAvailableIndex = 0;
        for (int i = 0; i < 3; i++) {
            if (i != indexOfThree) {
                twoAndThree[nextAvailableIndex] = fiveGroup[i];
                nextAvailableIndex++;
            }
        }
        return twoAndThree;
    }
}
