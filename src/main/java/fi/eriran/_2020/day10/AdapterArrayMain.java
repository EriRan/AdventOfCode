package fi.eriran._2020.day10;

import fi.eriran.common.parser.IntegerInputParserProxy;
import fi.eriran._2020.day10.calculation.AdapterPossibleCombinationsCounter;
import fi.eriran._2020.day10.calculation.JoltDifferenceCalculator;
import fi.eriran._2020.day10.calculation.JoltDifferenceContainerFactory;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AdapterArrayMain {

    private static final Logger logger = Logger.getGlobal();

    public static void main(String[] args) {
        List<Integer> day10Input = new IntegerInputParserProxy().parse("2020/Day10Input");
        logger.log(
                Level.INFO,
                () ->
                "Part one 1-jolt differences multiplied by the number of 3-jolt differences:" +
                new JoltDifferenceCalculator().oneJoltsMultipliedWithThreeJolts(
                        new JoltDifferenceContainerFactory().find(
                                day10Input
                        )
                )
        );

        logger.log(
                Level.INFO,
                () -> "Part two possible adapter combinations: "
                + new AdapterPossibleCombinationsCounter().count(
                day10Input
        ));
    }
}
