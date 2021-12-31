package fi.eriran._2021.day7.calculation;

import java.util.List;
import java.util.stream.Collectors;

public class IntegerMedianCalculator {

    /**
     * Calculates a median from a list of integers
     * @param integers integers that we want a median of
     * @return median as double
     */
    public double calculate(List<Integer> integers) {
        int middle = integers.size() / 2;
        List<Integer> sortedPositions = integers.stream()
                .sorted(Integer::compareTo)
                .collect(Collectors.toList());
        if (sortedPositions.size() % 2 == 1)
            return sortedPositions.get(middle);
        else
            return (sortedPositions.get(middle - 1) + sortedPositions.get(middle)) / 2D;
    }
}
