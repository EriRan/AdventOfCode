package fi.eriran._2021.day3;

import fi.eriran.common.parser.multiline.MultiLineInputParserProxy;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BinaryDiagnosticMain {

    private static final Logger logger = Logger.getGlobal();

    public static void main(String[] args) {
        List<String> input = new MultiLineInputParserProxy().parse("2021/day3");
        logger.log(
                Level.INFO,
                () -> "Part One: " + new PowerConsumptionCalculator().calculate(input)
        );
        logger.log(
                Level.INFO,
                () -> "Part two: " + new LifeSupportCalculator().calculate(input)
        );
    }
}
