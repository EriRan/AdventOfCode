package fi.eriran._2021.day9;

import fi.eriran.common.parser.multiline.MultiLineInputParserProxy;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SmokeBasinMain {

    private static final Logger logger = Logger.getGlobal();

    public static void main(String[] args) {
        List<String> input = new MultiLineInputParserProxy().parse("2021/day9");
        logger.log(
                Level.INFO,
                () -> "Part One: " + new SmokeBasinPartOne().calculate(input)
        );
        logger.log(
                Level.INFO,
                () -> "Part two: "
        );
    }
}
