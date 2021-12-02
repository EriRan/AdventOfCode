package fi.eriran.twozerotwozero.day12;

import fi.eriran.common.parser.LineInputParserProxy;
import fi.eriran.twozerotwozero.day12.calculation.ManhattanCalculator;
import fi.eriran.twozerotwozero.day12.calculation.flight.direct.DirectFlightPathCalculator;
import fi.eriran.twozerotwozero.day12.calculation.flight.waypoint.WaypointFlightPathCalculator;
import fi.eriran.twozerotwozero.day12.parser.DirectionCommandParser;

import java.util.logging.Level;
import java.util.logging.Logger;

public class RainRiskMain {

    private static final Logger logger = Logger.getGlobal();

    public static void main(String[] args) {
        logger.log(
                Level.INFO,
                () ->
                        "Part one manhattan distance is: "
                                + new ManhattanCalculator().calculate(
                                new DirectFlightPathCalculator().calculate(
                                        new DirectionCommandParser().parse(
                                                new LineInputParserProxy().parse("2020/Day12Input")
                                        )
                                )
                        )
        );

        logger.log(
                Level.INFO,
                () -> "Part two manhattan distance is: "
                        + new ManhattanCalculator().calculate(
                        new WaypointFlightPathCalculator().calculate(
                                new DirectionCommandParser().parse(
                                        new LineInputParserProxy().parse("2020/Day12Input")
                                )
                        )
                )
        );
    }
}
