package fi.eriran._2021.day6;

import fi.eriran._2021.day6.calculation.counter.LanterfishCounter;
import fi.eriran._2021.day6.calculation.modeler.LanterfishBreedingModelerNaive;
import fi.eriran._2021.day6.constant.LanterfishConstant;
import fi.eriran._2021.day6.parser.LanterfishParser;

import java.util.Collection;

public class PartOneLanterfishCounter {

    public long countAfterBreeding(Collection<String> lines) {
        return countWithDays(lines, LanterfishConstant.PART_ONE_DAYS_ELAPSED);
    }

    public long countAfterBreeding(Collection<String> lines, int daysToCount) {
        return countWithDays(lines, daysToCount);
    }

    private long countWithDays(Collection<String> lines, int daysToCount) {
        return new LanterfishCounter()
                .count(new LanterfishBreedingModelerNaive()
                        .model(new LanterfishParser().parse(lines), daysToCount));
    }
}