package fi.eriran._2020.day11.calculation.evolution.rule;


import fi.eriran._2020.day11.pojo.seat.SeatMap;

public interface DirectionChecker {

    boolean upperLeft(SeatMap seatMap, int startX, int startY);

    boolean up(SeatMap seatMap, int startX, int startY);

    boolean upperRight(SeatMap seatMap, int startX, int startY); 

    boolean right(SeatMap seatMap, int startX, int startY);

    boolean lowerRight(SeatMap seatMap, int startX, int startY); 

    boolean down(SeatMap seatMap, int startX, int startY);

    boolean lowerLeft(SeatMap seatMap, int startX, int startY); 

    boolean left(SeatMap seatMap, int startX, int startY);
}
