package fi.eriran.day5;

import com.google.common.io.Resources;
import fi.eriran.day5.seat.SeatFactory;

import java.io.IOException;

public class BinaryBoardingMain {

    public static void main(String[] args) throws IOException {
        System.out.println("Part one highest id is: " + new HighestSeatIdCalculator()
                .calculate(
                        new SeatFactory().build(Resources.getResource("day5Input"))
                )
        );
    }
}
