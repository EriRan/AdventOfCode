package fi.eriran.day10.calculation;

import java.util.List;
import java.util.stream.Collectors;

public class AdapterPossibleCombinationsCounter {

    public long count(List<Integer> availableAdapters) {
        List<Integer> sortedAdapters = availableAdapters.stream().sorted().collect(Collectors.toList());
        // I probably need to abandon this list structure in its entirety
        int currentEffectiveRating = 0;
        int currentIndex = 0;
        return findTotalJoltages(sortedAdapters, currentEffectiveRating, currentIndex);
    }

    private long findTotalJoltages(List<Integer> adapters,
                                   int currentEffectiveRating,
                                   int currentIndex) {
        long currentIterationTotal = 0;
        for (int i = currentIndex; i < adapters.size(); i++) {
            //Adapter two indexes ahead from the current index. Create a new branch
            if (i + 2 < adapters.size()) {
                Integer thirdAheadJoltage = adapters.get(i + 2);
                if (thirdAheadJoltage - currentEffectiveRating < 4) {
                    currentIterationTotal += findTotalJoltages(
                            adapters,
                            thirdAheadJoltage,
                            i + 3);
                }
            }
            //Adapter one index ahead from the current one. Create a new branch
            if (i + 1 < adapters.size()) {
                Integer secondAheadJoltage = adapters.get(i + 1);
                if (secondAheadJoltage - currentEffectiveRating < 4) {
                    currentIterationTotal += findTotalJoltages(
                            adapters,
                            secondAheadJoltage,
                            i + 2);
                }
            }

            //The adapter at the current index. No need to create a new branch
            Integer currentIndexJoltage = adapters.get(i);
            if (currentIndexJoltage - currentEffectiveRating < 4) {
                currentEffectiveRating = currentIndexJoltage;
            }
        }
        currentIterationTotal += 1;
        return currentIterationTotal;
    }
}
