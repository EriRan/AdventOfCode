package fi.eriran._2020.day10.calculation.util;

import java.util.List;

public class LastAdapterFinder {

    private LastAdapterFinder() {
    }

    public static int find(List<Integer> adapters) {
        return adapters.stream()
                .max(Integer::compareTo)
                .orElseThrow(() -> new IllegalStateException("Unable to find max value")) + 3;
    }
}
