package fi.eriran._2021.day6.calculation.counter;

public class LanterfishCounterOptimized {

    public long count(long[] lanterfishBreedingStates) {
        long sum = 0;
        for (long lanterfishBreedingState : lanterfishBreedingStates) {
            sum += lanterfishBreedingState;
        }
        return sum;
    }
}
