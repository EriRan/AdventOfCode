package fi.eriran._2023.day1;

public class CalibrationValueFinder {

    /**
     * Find first and last digit from a String and turn it into an int
     *
     * @param line
     * @return
     */
    public int find(String line) {
        Character first = null;
        Character last = null;

        for (char c : line.toCharArray()) {
            if (Character.isDigit(c)) {
                if (first == null) {
                    first = c;
                }
                last = c;
            }
        }

        if (first == null) {
            throw new IllegalStateException("Unable to find the first digit!");
        }

        return Integer.parseInt(String.valueOf(first) + last);
    }
}
