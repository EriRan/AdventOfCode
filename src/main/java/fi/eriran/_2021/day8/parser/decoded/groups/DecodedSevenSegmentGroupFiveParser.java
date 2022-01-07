package fi.eriran._2021.day8.parser.decoded.groups;

import fi.eriran._2021.day8.parser.decoded.groups.util.DecodedSignalFinder;

import java.util.Map;

public class DecodedSevenSegmentGroupFiveParser {

    /**
     * 2, 3 and 5. We expect to have 1,4,7 and 8 processed at this point. This class will add 3, 2 and 5
     *
     * @param fiveGroup            unique signals that have five letters
     * @param decodedUniqueSignals map of already decoded signals
     */
    public void process(String[] fiveGroup, Map<String, Integer> decodedUniqueSignals) {
        // Find the signal that has both segments of 1
        String signalForOne = DecodedSignalFinder.findDecodedSignalString(1, decodedUniqueSignals);
        int indexOfThree = -1;
        String signalForThree = null;
        for (int i = 0, fiveGroupLength = fiveGroup.length; i < fiveGroupLength; i++) {
            String fiveLetterSignal = fiveGroup[i];
            // Number 3 has both segments of 1. 2 has only one and so does 5
            if (fiveLetterSignal.indexOf(signalForOne.charAt(0)) != 1
                    && fiveLetterSignal.indexOf(signalForOne.charAt(1)) != 1) {
                decodedUniqueSignals.put(fiveLetterSignal, 3);
                signalForThree = fiveLetterSignal;
                indexOfThree = i;
                break;
            }
        }
        if (signalForThree == null) {
            throw new IllegalStateException("Unable to find three!");
        }

        String[] arrayForTwoAndThree = createArrayForTwoAndThree(fiveGroup, indexOfThree);
        String fiveLetterSignal = arrayForTwoAndThree[0];
        // Count matches
        int matches = 0;
        for (char characterFromThree : signalForThree.toCharArray()) {
            if (fiveLetterSignal.indexOf(characterFromThree) != -1) {
                matches++;
            }
        }
        if (matches == 2) {
            decodedUniqueSignals.put(fiveLetterSignal, 2);
            decodedUniqueSignals.put(arrayForTwoAndThree[1], 5);
        } else if (matches == 5) {
            decodedUniqueSignals.put(fiveLetterSignal, 5);
            decodedUniqueSignals.put(arrayForTwoAndThree[1], 2);
        }
    }

    private String[] createArrayForTwoAndThree(String[] fiveGroup, int indexOfThree) {
        String[] twoAndThree = new String[2];
        int nextAvailableIndex = 0;
        for (int i = 0; i < 3; i++) {
            if (i == indexOfThree) {
                twoAndThree[nextAvailableIndex] = fiveGroup[i];
                nextAvailableIndex++;
            }
        }
        return twoAndThree;
    }
}
