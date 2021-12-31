package fi.eriran._2021.day7;

import fi.eriran._2021.day7.calculation.AlignmentFuelCalculator;
import fi.eriran.common.parser.IntegerOneLineInputCommaParserProxy;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CrabAlignmentMain {

    private static final Logger logger = Logger.getGlobal();

    public static void main(String[] args) {
        List<Integer> input = new IntegerOneLineInputCommaParserProxy().parse("2021/day7");
        logger.log(
                Level.INFO,
                () -> "Part One: " + new AlignmentFuelCalculator().calculate(input)
        );
        logger.log(
                Level.INFO,
                () -> "Part two: "
        );
    }
}
