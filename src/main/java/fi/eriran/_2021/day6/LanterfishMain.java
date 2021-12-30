package fi.eriran._2021.day6;

import fi.eriran.common.parser.LineInputParserProxy;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LanterfishMain {

    private static final Logger logger = Logger.getGlobal();

    public static void main(String[] args) {
        List<String> input = new LineInputParserProxy().parse("2021/day6");
        logger.log(
                Level.INFO,
                () -> "Part One: " + new PartOneLanterfishCounter().countAfterBreeding(input)
        );
        logger.log(
                Level.INFO,
                () -> "Part two: " + new PartTwoLanterfishCounter().count(input)
        );
    }
}
