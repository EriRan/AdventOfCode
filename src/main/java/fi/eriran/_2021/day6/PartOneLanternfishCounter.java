package fi.eriran._2021.day6;

import fi.eriran._2021.day6.calculation.counter.LanternfishCounter;
import fi.eriran._2021.day6.calculation.modeler.LanternfishBreedingModelerNaive;
import fi.eriran._2021.day6.constant.LanternfishConstant;
import fi.eriran._2021.day6.parser.LanternfishParser;

import java.util.Collection;

public class PartOneLanternfishCounter {

    public long countAfterBreeding(Collection<Integer> lines) {
        return countWithDays(lines, LanternfishConstant.PART_ONE_DAYS_ELAPSED);
    }

    public long countAfterBreeding(Collection<Integer> lines, int daysToCount) {
        return countWithDays(lines, daysToCount);
    }

    private long countWithDays(Collection<Integer> lines, int daysToCount) {
        return new LanternfishCounter()
                .count(new LanternfishBreedingModelerNaive()
                        .model(new LanternfishParser().parse(lines), daysToCount));
    }
}
