package fi.eriran._2021.day6;

import fi.eriran._2021.day6.calculation.counter.LanterfishCounter;
import fi.eriran._2021.day6.calculation.modeler.LanterfishBreedingModeler;
import fi.eriran._2021.day6.constant.LanterfishConstant;
import fi.eriran._2021.day6.parser.LanterfishParser;

import java.util.Collection;

public class PartOneLanterfishCounter {

    public int countAfterBreeding(Collection<String> lines) {
        return countWithDays(lines, LanterfishConstant.PART_ONE_DAYS_ELAPSED);
    }

    public int countAfterBreeding(Collection<String> lines, int daysToCount) {
        return countWithDays(lines, daysToCount);
    }

    private int countWithDays(Collection<String> lines, int daysToCount) {
        return new LanterfishCounter()
                .count(new LanterfishBreedingModeler()
                        .model(new LanterfishParser().parse(lines), daysToCount));
    }
}
