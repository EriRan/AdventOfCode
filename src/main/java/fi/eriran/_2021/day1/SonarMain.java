package fi.eriran._2021.day1;

import fi.eriran.common.parser.multiline.IntegerMultiLineInputParserProxy;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SonarMain {

    private static final Logger logger = Logger.getGlobal();

    public static void main(String[] args) {
        List<Integer> input = new IntegerMultiLineInputParserProxy().parse("2021/day1");
        logger.log(
                Level.INFO,
                () -> "Part One: " + new SonarDepthIncreaseCalculator().calculate(input)
        );
        logger.log(
                Level.INFO,
                () -> "Part two: " + new SonarThreeMeasurementSlidingWindowCalculator().calculate(input)
        );
    }
}
