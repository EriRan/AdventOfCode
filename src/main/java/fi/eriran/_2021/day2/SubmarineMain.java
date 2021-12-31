package fi.eriran._2021.day2;

import fi.eriran.common.parser.multiline.MultiLineInputParserProxy;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SubmarineMain {

    private static final Logger logger = Logger.getGlobal();

    public static void main(String[] args) {
        List<String> input = new MultiLineInputParserProxy().parse("2021/day2");
        logger.log(
                Level.INFO,
                () -> "Part One: " + new SubmarinePositionMultiplicationGenerator().generateSimple(input)
        );
        logger.log(
                Level.INFO,
                () -> "Part two: " + new SubmarinePositionMultiplicationGenerator().generateAim(input)
        );
    }
}
