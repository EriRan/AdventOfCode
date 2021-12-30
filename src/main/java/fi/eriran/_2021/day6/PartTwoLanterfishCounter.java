package fi.eriran._2021.day6;

import fi.eriran._2021.day6.calculation.counter.LanterfishCounterOptimized;
import fi.eriran._2021.day6.calculation.modeler.LanterfishBreedingModelerOptimized;
import fi.eriran._2021.day6.constant.LanterfishConstant;
import fi.eriran._2021.day6.parser.LanterfishParser;

import java.util.Collection;

public class PartTwoLanterfishCounter {

    public long count(Collection<String> lines) {
        return new LanterfishCounterOptimized()
                .count(new LanterfishBreedingModelerOptimized()
                        .model(new LanterfishParser().parse(lines), LanterfishConstant.PART_TWO_DAYS_ELAPSED));
    }
}
