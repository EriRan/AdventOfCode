package fi.eriran._2021.day4;

import fi.eriran.common.parser.LineInputParserProxy;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BingoMain {

    private static final Logger logger = Logger.getGlobal();

    public static void main(String[] args) {
        List<String> input = new LineInputParserProxy().parse("2021/day4Input");
        logger.log(
                Level.INFO,
                () -> "Part One: " + new BingoPartOne().calculateFinalScore(input)
        );
        logger.log(
                Level.INFO,
                () -> "Part two: "
        );
    }
}
