package fi.eriran.day9.calculation.weakness;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ContiguousSumListFinder {

    public List<Long> find(List<Long> allNumbers, Long targetSum) {
        int currentSumCalculationStartPoint = 0;

        while(currentSumCalculationStartPoint < allNumbers.size()) {
            long currentSum = 0;
            List<Long> currentSumNumbers = new ArrayList<>();
            int currentIndex = currentSumCalculationStartPoint;
            while (currentSum < targetSum) {
                Long newNumber = allNumbers.get(currentIndex);
                currentSum += newNumber;
                currentSumNumbers.add(newNumber);
                currentIndex++;
            }
            if (currentSum == targetSum) {
                return currentSumNumbers;
            } else {
                currentSumCalculationStartPoint++;
            }
        }
        return Collections.emptyList();
    }
}
