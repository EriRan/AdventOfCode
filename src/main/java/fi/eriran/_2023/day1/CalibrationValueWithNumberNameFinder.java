package fi.eriran._2023.day1;

public class CalibrationValueWithNumberNameFinder implements ValueFinder {

    /**
     * Find first and last digit from a String and turn it into an int. Will also consider strings one, two, three, four
     * five, six, seven, eight and nine as valid numbers
     */
    public int find(String line) {
        Character first = null;
        Character last = null;

        char[] charArray = line.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char character = charArray[i];
            Character foundNumber = tryToIdentifyNumber(i, character, line);
            if (foundNumber != null) {
                if (first == null) {
                    first = foundNumber;
                }
                last = foundNumber;
            }
        }

        if (first == null) {
            throw new IllegalStateException("Unable to find the first digit!");
        }

        return Integer.parseInt(String.valueOf(first) + last);
    }

    private Character tryToIdentifyNumber(int i, char character, String line) {
        if (Character.isDigit(character)) {
            return character;
        } else {
            return attemptFindingStringNumber(i, line);
        }
    }

    private Character attemptFindingStringNumber(int i, String line) {
        // Shortest number string is at 3
        if (i < 2) {
            return null;
        }
        String potentialThreeLetterNumber = line.substring(i - 2, i + 1);
        if ("one".equals(potentialThreeLetterNumber)) {
            return '1';
        }
        if ("two".equals(potentialThreeLetterNumber)) {
            return '2';
        }
        if ("six".equals(potentialThreeLetterNumber)) {
            return '6';
        }
        // potential 4 letter numbers
        if (i < 3) {
            return null;
        }
        String potentialFourLetterNumber = line.substring(i - 3, i + 1);
        if ("four".equals(potentialFourLetterNumber)) {
            return '4';
        }
        if ("five".equals(potentialFourLetterNumber)) {
            return '5';
        }
        if ("nine".equals(potentialFourLetterNumber)) {
            return '9';
        }

        // potential 5 letter numbers
        if (i < 4) {
            return null;
        }
        String potentialFiveLetterNumber = line.substring(i - 4, i + 1);
        if ("three".equals(potentialFiveLetterNumber)) {
            return '3';
        }
        if ("seven".equals(potentialFiveLetterNumber)) {
            return '7';
        }
        if ("eight".equals(potentialFiveLetterNumber)) {
            return '8';
        }
        return null;
    }
}
