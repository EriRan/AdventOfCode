package fi.eriran._2021.day7.calculation;

import java.util.List;

public class IntegerMedianCalculator {

    public double calculate(List<Integer> integers) {
        int middle = integers.size() / 2;
        if (integers.size() % 2 == 1)
            return integers.get(middle);
        else
            return (integers.get(middle - 1) + integers.get(middle)) / 2D;
    }
}
