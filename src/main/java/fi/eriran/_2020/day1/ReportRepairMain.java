package fi.eriran._2020.day1;

import fi.eriran.common.parser.multiline.IntegerInputParserProxy;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReportRepairMain {

    private static final Logger logger = Logger.getGlobal();

    public static void main(String[] args) {
        List<Integer> input = new IntegerInputParserProxy().parse("2020/day1");
        logger.log(
                Level.INFO,
                () -> "Part One: " + new ReportRepairerTwoPair().repair(input)
        );
        logger.log(
                Level.INFO,
                () -> "Part two: " + new ReportRepairerThreePair().repair(input)
        );
    }
}
