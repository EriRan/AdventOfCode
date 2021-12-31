package fi.eriran._2021.day6;

import fi.eriran._2021.day6.calculation.counter.LanternfishCounterOptimized;
import fi.eriran._2021.day6.calculation.modeler.LanternfishBreedingModelerOptimized;
import fi.eriran._2021.day6.constant.LanternfishConstant;
import fi.eriran._2021.day6.parser.LanternfishParser;

import java.util.Collection;

public class PartTwoLanternfishCounter {

    public long count(Collection<Integer> lines) {
        return new LanternfishCounterOptimized()
                .count(new LanternfishBreedingModelerOptimized()
                        .model(new LanternfishParser().parse(lines), LanternfishConstant.PART_TWO_DAYS_ELAPSED));
    }
}
