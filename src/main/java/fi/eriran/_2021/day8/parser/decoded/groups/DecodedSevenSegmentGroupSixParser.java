package fi.eriran._2021.day8.parser.decoded.groups;

import fi.eriran._2021.day8.parser.decoded.groups.util.DecodedSignalFinder;

import java.util.Map;

public class DecodedSevenSegmentGroupSixParser {

    /**
     * Find 0, 6 and 9. We expect to have 1, 2, 3, 4, 5, 7, 8,  processed at this point.
     *
     * @param sixGroup             unique signals that have six letters
     * @param decodedUniqueSignals map of already decoded signals
     */
    public void process(String[] sixGroup, Map<String, Integer> decodedUniqueSignals) {
        if (sixGroup.length != 3) {
            throw new IllegalStateException("Expecting five group to contain 3 numbers but it contained: " + sixGroup.length);
        }
        // Find 6 first. It should only one match to segments of one
        String signalForOne = DecodedSignalFinder.findDecodedSignalString(1, decodedUniqueSignals);
        int indexOfSix = -1;
        for (int i = 0; i < 3; i++) {
            String sixLetterSignal = sixGroup[i];
            // 6 has just one of 1's segments. 9 and zero have two
            if ((sixLetterSignal.indexOf(signalForOne.charAt(0)) != -1 && sixLetterSignal.indexOf(signalForOne.charAt(1)) == -1)
                    || (sixLetterSignal.indexOf(signalForOne.charAt(0)) == -1 && sixLetterSignal.indexOf(signalForOne.charAt(1)) != -1)) {
                decodedUniqueSignals.put(sixLetterSignal, 6);
                indexOfSix = i;
                break;
            }
        }
        if (indexOfSix == -1) {
            throw new IllegalStateException("Unable to find six!");
        }

        String[] arrayForZeroAndNine = createArrayForZeroAndSix(sixGroup, indexOfSix);

        String signalForFive = DecodedSignalFinder.findDecodedSignalString(5, decodedUniqueSignals);
        String zeroOrSixSignal = arrayForZeroAndNine[0];
        // Count matches for five. Zero has 4 matches, six has 5
        int matches = 0;
        for (char characterFromFive : signalForFive.toCharArray()) {
            if (zeroOrSixSignal.indexOf(characterFromFive) != -1) {
                matches++;
                if (matches == 5) {
                    break;
                }
            }
        }
        if (matches == 4) {
            decodedUniqueSignals.put(zeroOrSixSignal, 0);
            decodedUniqueSignals.put(arrayForZeroAndNine[1], 9);
        } else if (matches == 5) {
            decodedUniqueSignals.put(zeroOrSixSignal, 9);
            decodedUniqueSignals.put(arrayForZeroAndNine[1], 0);
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
