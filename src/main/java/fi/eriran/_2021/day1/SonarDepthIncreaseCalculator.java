package fi.eriran._2021.day1;

import java.util.List;

public class SonarDepthIncreaseCalculator {

    public int calculate(List<Integer> depthMeasurements) {
        Integer previousMeasurement = null;
        int increases = 0;
        for (Integer measurement : depthMeasurements) {
            if (previousMeasurement == null) {
                previousMeasurement = measurement;
                continue;
            }
            if (measurement > previousMeasurement) {
                increases++;
            }
            previousMeasurement = measurement;
        }
        return increases;
    }
}
