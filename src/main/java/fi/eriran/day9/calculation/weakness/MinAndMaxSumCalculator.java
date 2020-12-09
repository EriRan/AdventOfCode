package fi.eriran.day9.calculation.weakness;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

class MinAndMaxSumCalculator {

    private final Logger logger = Logger.getGlobal();

    public Long calculate(List<Long> contiguousSumList) {
        Optional<Long> min = contiguousSumList.stream().min(Long::compareTo);
        if (min.isEmpty()) {
            logger.warning("Unable to find the minimum number");
            return null;
        }
        return contiguousSumList.stream().max(Long::compareTo)
                .map(max -> max + min.get())
                .orElse(null);
    }
}
