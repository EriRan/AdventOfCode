package fi.eriran._2023.day1;

import java.util.Collection;

/**
 * I have an idea how to get rid of this duplicate class. Remove this later
 */
public class TrebuchetTaskTwo {

    private final CalibrationValueWithNumberNameFinder calibrationValueFinder;

    public TrebuchetTaskTwo() {
        this.calibrationValueFinder = new CalibrationValueWithNumberNameFinder();
    }

    public long findSum(Collection<String> lines) {
        long sum = 0;

        for (String line : lines) {
            sum += calibrationValueFinder.find(line);
        }
        return sum;
    }
}
