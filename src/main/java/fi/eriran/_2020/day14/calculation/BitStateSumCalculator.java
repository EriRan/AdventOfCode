package fi.eriran._2020.day14.calculation;

import org.apache.commons.collections4.MapUtils;

import java.util.Map;

public class BitStateSumCalculator {

    public Long calculate(Map<Integer, Long> memoryState) {
        if (MapUtils.isEmpty(memoryState)) {
            return 0L;
        }
        return memoryState.values().stream()
                .reduce(Long::sum)
                .orElseThrow(() -> new IllegalStateException("Unable to calculate sum"));
    }
}
