package fi.eriran.day14;

import fi.eriran.common.parser.LineInputParserProxy;
import fi.eriran.day14.calculation.BitCommandRunner;
import fi.eriran.day14.calculation.BitStateSumCalculator;
import fi.eriran.day14.parser.BitCommandParser;

import java.util.logging.Level;
import java.util.logging.Logger;

public class DockingDataMain {

    private static final Logger logger = Logger.getGlobal();

    public static void main(String[] args) {
        logger.log(Level.INFO,
                () -> "Part one result: " + new BitStateSumCalculator().calculate(
                        new BitCommandRunner().run(
                                new BitCommandParser().parse(
                                        new LineInputParserProxy().parse("Day14Input")
                                )
                        )
                )
        );

    }
}
