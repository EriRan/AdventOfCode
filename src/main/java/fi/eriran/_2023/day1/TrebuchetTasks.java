package fi.eriran._2023.day1;

import java.util.Collection;

public class TrebuchetTasks {

    private ValueFinder valueFinder;

    public long findSum(Collection<String> lines) {
        long sum = 0;

        for (String line : lines) {
            sum += valueFinder.find(line);
        }
        return sum;
    }

    public void setValueFinder(ValueFinder valueFinder) {
        this.valueFinder = valueFinder;
    }
}
