package fi.eriran.twozerotwozero.day9.calculation.weakness;

import org.apache.commons.collections4.CollectionUtils;

import java.util.List;
import java.util.logging.Logger;

class MinAndMaxSumCalculator {

    private final Logger logger = Logger.getGlobal();

    public Long calculate(List<Long> longs) {
        if (CollectionUtils.isEmpty(longs) || longs.size() == 1) {
            return null;
        }
        Long min = null;
        Long max = null;
        for (Long currentLong : longs) {
            if (min == null || currentLong < min) {
                min = currentLong;
            }
            if (max == null || currentLong > max) {
                max = currentLong;
            }
        }
        if (min == null) {
            logger.warning("Unable to calculate the sum!");
            return null;
        }
        return min + max;
    }
}
