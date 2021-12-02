package fi.eriran._2020.day5;

import fi.eriran._2020.day5.seat.pojo.Seat;

import java.util.Collection;

public class HighestSeatIdCalculator {

    public int calculate(Collection<Seat> seats) {
        return seats.stream()
                .map(Seat::getId)
                .max(Integer::compareTo)
                .orElseThrow(() -> new IllegalArgumentException("Unable to calculate max id"));
    }
}
