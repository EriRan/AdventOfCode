package fi.eriran.twozerotwozero.day5;

import fi.eriran.twozerotwozero.day5.seat.pojo.Seat;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FreeSeatFinder {

    /**
     * Find the id of the seat that is free
     * <p>
     * Seat id cannot be less than the smallest value or more than the largest id.
     */
    public int find(Collection<Seat> seats) {
        Collection<Seat> sortedList = sortSeatsById(seats);
        int expectedSeatId = findFirstId(sortedList);
        for (Seat seat : sortedList) {
            if (seat.getId() != expectedSeatId) {
                return expectedSeatId;
            }
            expectedSeatId++;
        }
        throw new IllegalStateException("Unable to find a free seat!");
    }

    private List<Seat> sortSeatsById(Collection<Seat> seats) {
        return seats.stream()
                .sorted(Comparator.comparing(Seat::getId))
                .collect(Collectors.toList());
    }

    private int findFirstId(Collection<Seat> sortedList) {
        Seat firstSeat = sortedList.stream().findFirst()
                .orElseThrow(() -> new IllegalArgumentException("No seats provided"));
        return firstSeat.getId();
    }

}
