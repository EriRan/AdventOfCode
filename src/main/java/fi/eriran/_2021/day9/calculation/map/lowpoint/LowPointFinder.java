package fi.eriran._2021.day9.calculation.map.lowpoint;

import fi.eriran._2021.day9.calculation.map.lowpoint.objects.LowPoint;

import java.util.ArrayList;
import java.util.Collection;

public class LowPointFinder {

    public Collection<LowPoint> find(int[][] heightMapMatrix) {
        Collection<LowPoint> lowPoints = new ArrayList<>();
        for (int y = 0; y < heightMapMatrix.length; y++) {
            for (int x = 0; x < heightMapMatrix[0].length; x++) {
                Integer lowestValue = null;
                // Up
                if (y != 0) {
                    lowestValue = getLowerValue(heightMapMatrix[y - 1][x], lowestValue);
                }
                // Right
                if (x != heightMapMatrix[0].length - 1) {
                    lowestValue = getLowerValue(heightMapMatrix[y][x + 1], lowestValue);
                }
                // Down
                if (y != heightMapMatrix.length - 1) {
                    lowestValue = getLowerValue(heightMapMatrix[y + 1][x], lowestValue);
                }
                // Left
                if (x != 0) {
                    lowestValue = getLowerValue(heightMapMatrix[y][x - 1], lowestValue);
                }
                // Error scenario
                if (lowestValue == null) {
                    throw new IllegalStateException("Unable to find lowest value!");
                }
                // Check if we've found a low point
                if (heightMapMatrix[y][x] < lowestValue) {
                    lowPoints.add(new LowPoint(x,y, heightMapMatrix[y][x]));
                }
            }
        }
        return lowPoints;
    }

    private Integer getLowerValue(int newValue, Integer currentLowest) {
        if (currentLowest == null) {
            return newValue;
        }
        return Math.min(newValue, currentLowest);
    }
}
