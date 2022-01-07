package fi.eriran._2021.day8.parser.decoded.groups;

import fi.eriran._2021.day8.parser.decoded.groups.util.DecodedSignalFinder;

import java.util.Map;

public class DecodedSevenSegmentGroupSixParser {

    /**
     * Find 0, 6 and 9. We expect to have 1, 2, 3, 4, 5, 7, 8,  processed at this point.
     *
     * @param sixGroup            unique signals that have six letters
     * @param decodedUniqueSignals map of already decoded signals
     */
    public void process(String[] sixGroup, Map<String, Integer> decodedUniqueSignals) {
        if (sixGroup.length != 3) {
            throw new IllegalStateException("Expecting five group to contain 3 numbers but it contained: " + sixGroup.length);
        }
        // Find 9 first. It should have 4 segment matches to 4
        String signalForFour = DecodedSignalFinder.findDecodedSignalString(4, decodedUniqueSignals);
        int indexOfNine = -1;
        String signalForNine = null;
        for (int i = 0; i < 3; i++) {
            String sixLetterSignal = sixGroup[i];
            // Number 9 has all 4 segments of number four. 0 and 6 have just 3
            if (sixLetterSignal.indexOf(signalForFour.charAt(0)) != -1
                    && sixLetterSignal.indexOf(signalForFour.charAt(1)) != -1
                    && sixLetterSignal.indexOf(signalForFour.charAt(2)) != -1
                    && sixLetterSignal.indexOf(signalForFour.charAt(3)) != -1) {
                decodedUniqueSignals.put(sixLetterSignal, 9);
                signalForNine = sixLetterSignal;
                indexOfNine = i;
                break;
            }
        }
        if (signalForNine == null) {
            throw new IllegalStateException("Unable to find nine!");
        }

        String[] arrayForZeroAndSix = createArrayForZeroAndSix(sixGroup, indexOfNine);

        String signalForFive = DecodedSignalFinder.findDecodedSignalString(5, decodedUniqueSignals);
        String sixLetterSignal = arrayForZeroAndSix[0];
        // Count matches for five. Zero has 4 matches, six has 5
        int matches = 0;
        for (char characterFromFive : signalForFive.toCharArray()) {
            if (sixLetterSignal.indexOf(characterFromFive) != -1) {
                matches++;
            }
            if (matches == 5) {
                break;
            }
        }
        if (matches == 4) {
            decodedUniqueSignals.put(sixLetterSignal, 0);
            decodedUniqueSignals.put(arrayForZeroAndSix[1], 6);
        } else if (matches == 5) {
            decodedUniqueSignals.put(sixLetterSignal, 6);
            decodedUniqueSignals.put(arrayForZeroAndSix[1], 0);
        } else {
            throw new IllegalStateException("Unexpected amount of matches: " + matches);
        }
    }

    private String[] createArrayForZeroAndSix(String[] sixGroup, int indexOfNine) {
        String[] twoAndThree = new String[2];
        int nextAvailableIndex = 0;
        for (int i = 0; i < 3; i++) {
            if (i != indexOfNine) {
                twoAndThree[nextAvailableIndex] = sixGroup[i];
                nextAvailableIndex++;
            }
        }
        return twoAndThree;
    }
}
