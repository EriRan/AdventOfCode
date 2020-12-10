package fi.eriran.day10;

import fi.eriran.common.parser.IntegerInputParserProxy;
import fi.eriran.day10.calculation.JoltDifferenceCalculator;
import fi.eriran.day10.calculation.JoltDifferenceContainerFactory;

public class AdapterArrayMain {

    public static void main(String[] args) {
        System.out.println("Part one 1-jolt differences multiplied by the number of 3-jolt differences: "
                        + new JoltDifferenceCalculator().oneJoltsMultipliedWithThreeJolts(
                new JoltDifferenceContainerFactory().find(
                        new IntegerInputParserProxy().parse("Day10Input")
                )
                )
        );
    }
}
