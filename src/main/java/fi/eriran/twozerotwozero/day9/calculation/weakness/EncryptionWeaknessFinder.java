package fi.eriran.twozerotwozero.day9.calculation.weakness;

import fi.eriran.twozerotwozero.day9.calculation.InvalidNumberFinder;
import fi.eriran.twozerotwozero.day9.pojo.PreambleDefinition;
import org.apache.commons.collections4.CollectionUtils;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EncryptionWeaknessFinder {

    private final InvalidNumberFinder invalidNumberFinder;
    private final ContiguousSumListFinder contiguousSumListFinder;
    private final MinAndMaxSumCalculator minAndMaxSumCalculator;

    private final Logger logger = Logger.getGlobal();

    public EncryptionWeaknessFinder() {
        invalidNumberFinder = new InvalidNumberFinder();
        contiguousSumListFinder = new ContiguousSumListFinder();
        minAndMaxSumCalculator = new MinAndMaxSumCalculator();
    }

    public Long find(PreambleDefinition preambleDefinition) {
        Long targetSum = invalidNumberFinder.find(preambleDefinition);
        if (targetSum == null) {
            logger.warning("Unable invalid number");
            return null;
        }
        List<Long> contiguousSumList = contiguousSumListFinder.find(preambleDefinition.getAllNumbers(), targetSum);
        if (CollectionUtils.isEmpty(contiguousSumList)) {
            logger.log(Level.WARNING, "Unable to find contiguous sum list that sums up to {}", targetSum);
            return null;
        }
        return minAndMaxSumCalculator.calculate(contiguousSumList);
    }
}
