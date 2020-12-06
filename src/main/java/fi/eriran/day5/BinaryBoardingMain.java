package fi.eriran.day5;

import fi.eriran.day5.seat.SeatFactory;

import java.io.IOException;

public class BinaryBoardingMain {

    public static void main(String[] args) throws IOException {
        System.out.println("Part one highest id is: " + new HighestSeatIdCalculator()
                .calculate(
                        new SeatFactory().build("day5Input")
                )
        );
        System.out.println("Part two the free seat is: " + new FreeSeatFinder()
                .find(
                        new SeatFactory().build("day5Input")
                )
        );
    }
}
