package fi.eriran.day9.calculation;

import fi.eriran.day9.pojo.PreambleDefinition;

import java.util.List;

public class InvalidNumberFinder {

    public Long find(PreambleDefinition container) {
        int currentIndex = container.getPreambleSize();
        while (currentIndex < container.getAllNumbers().size()) {
            Long nextNumber = container.getAllNumbers().get(currentIndex);
            if (!sumOfTwoExistsInPreamble(
                    container.getAllNumbers().subList(currentIndex - container.getPreambleSize(), currentIndex),
                    nextNumber
            )) {
                return nextNumber;
            }
            currentIndex++;
        }
        return null;
    }

    private boolean sumOfTwoExistsInPreamble(List<Long> preamble, Long nextNumber) {
        for (int i = 0; i < preamble.size(); i++) {
            for (int j = i + 1; j < preamble.size(); j++) {
                if (preamble.get(i) + preamble.get(j) == nextNumber) {
                    return true;
                }
            }
        }
        return false;
    }
}
