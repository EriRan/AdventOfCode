package fi.eriran.day5;

import fi.eriran.day5.seat.SeatFactory;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BinaryBoardingMain {

    private static final Logger logger = Logger.getGlobal();

    public static void main(String[] args) {
        logger.log(
                Level.INFO,
                () -> "Part one highest id is: " + new HighestSeatIdCalculator()
                        .calculate(
                                new SeatFactory().build("day5Input")
                        )
        );
        logger.log(
                Level.INFO,
                () -> "Part two the free seat is: " + new FreeSeatFinder()
                        .find(
                                new SeatFactory().build("day5Input")
                        )
        );
    }
}
