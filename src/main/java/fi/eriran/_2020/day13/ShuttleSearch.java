package fi.eriran._2020.day13;

import fi.eriran.common.parser.LineInputParserProxy;
import fi.eriran._2020.day13.calculation.earliest.EarliestBuslineFinder;
import fi.eriran._2020.day13.calculation.earliest.EarliestBuslineResponseHandler;
import fi.eriran._2020.day13.calculation.sequential.SequentialBuslinesFinder;
import fi.eriran._2020.day13.parser.TimetableParser;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ShuttleSearch {

    private static final Logger logger = Logger.getGlobal();

    public static void main(String[] args) {
        logger.log(Level.INFO,
                () -> "Part one result: " + new EarliestBuslineResponseHandler().handle(
                        new EarliestBuslineFinder().find(
                                new TimetableParser().parse(
                                        new LineInputParserProxy().parse("2020/day13")
                                )
                        )
                )
        );
        logger.log(Level.INFO,
                () -> "Part two result: " +
                        new SequentialBuslinesFinder().find(
                                new TimetableParser().parse(
                                        new LineInputParserProxy().parse("2020/day13")
                                )
                        )
        );
    }
}
