package fi.eriran.day10;

import fi.eriran.common.parser.IntegerInputParserProxy;
import fi.eriran.day10.calculation.AdapterPossibleCombinationsCounter;
import fi.eriran.day10.calculation.JoltDifferenceCalculator;
import fi.eriran.day10.calculation.JoltDifferenceContainerFactory;

import java.util.List;

public class AdapterArrayMain {

    public static void main(String[] args) {
        List<Integer> day10Input = new IntegerInputParserProxy().parse("Day10Input");
        System.out.println("Part one 1-jolt differences multiplied by the number of 3-jolt differences: "
                        + new JoltDifferenceCalculator().oneJoltsMultipliedWithThreeJolts(
                new JoltDifferenceContainerFactory().find(
                        day10Input
                )
                )
        );

        System.out.println("Part two possible adapter combinations: "
                + new AdapterPossibleCombinationsCounter().count(
                day10Input
        ));
    }
}
