package fi.eriran._2021;

import java.util.List;

public class SonarThreeMeasurementSlidingWindowCalculator {

    public int calculate(List<Integer> depthMeasurements) {
        if (depthMeasurements.size() < 6) {
            return 0;
        }
        int increases = 0;

        // Start at index 2 (the third number)
        // sumOne is taken from current index plus two indexes below it
        // Sum two climbs one index up: It is taken from one index above the current i index plus the current index
        // and one below it.
        for (int i = 2; i < depthMeasurements.size() - 1; i++) {
            int sumOne = depthMeasurements.get(i) + depthMeasurements.get(i - 1) + depthMeasurements.get(i - 2);
            int sumTwo = depthMeasurements.get(i + 1) + depthMeasurements.get(i) + depthMeasurements.get(i - 1);
            if (sumTwo > sumOne) {
                increases++;
            }
        }
        return increases;
    }

}
