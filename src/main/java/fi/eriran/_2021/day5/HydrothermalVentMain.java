package fi.eriran._2021.day5;

import fi.eriran.common.parser.LineInputParserProxy;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HydrothermalVentMain {

    private static final Logger logger = Logger.getGlobal();

    public static void main(String[] args) {
        List<String> input = new LineInputParserProxy().parse("2021/day5Input");
        logger.log(
                Level.INFO,
                () -> "Part One: "
        );
        logger.log(
                Level.INFO,
                () -> "Part two: "
        );
    }

}
