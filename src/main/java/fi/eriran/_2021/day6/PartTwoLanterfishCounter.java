package fi.eriran._2021.day6;

import fi.eriran._2021.day6.calculation.counter.LanterfishCounter;
import fi.eriran._2021.day6.calculation.modeler.LanterfishBreedingModeler;
import fi.eriran._2021.day6.constant.LanterfishConstant;
import fi.eriran._2021.day6.parser.LanterfishParser;

import java.util.Collection;

public class PartTwoLanterfishCounter {

    public long count(Collection<String> lines) {
        return new LanterfishCounter()
                .count(new LanterfishBreedingModeler()
                        .model(new LanterfishParser().parse(lines), LanterfishConstant.PART_TWO_DAYS_ELAPSED));
    }
}
