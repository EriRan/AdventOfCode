package fi.eriran._2023.day1;

import java.util.Collection;

public class TrebuchetTaskOne {

    private CalibrationValueFinder calibrationValueFinder;

    public TrebuchetTaskOne() {
        this.calibrationValueFinder = new CalibrationValueFinder();
    }

    public long findSum(Collection<String> lines) {
        long sum = 0;

        for (String line : lines) {
            sum += calibrationValueFinder.find(line);
        }
        return sum;
    }
}
