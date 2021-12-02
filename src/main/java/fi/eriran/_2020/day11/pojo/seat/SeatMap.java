package fi.eriran._2020.day11.pojo.seat;

import fi.eriran._2020.day11.pojo.Position;

import java.util.HashMap;
import java.util.Map;

public class SeatMap {

    private final Map<Coordinate, Position> map;
    private final int maxX;
    private final int maxY;

    public SeatMap(int maxX, int maxY) {
        map = new HashMap<>();
        this.maxX = maxX;
        this.maxY = maxY;
    }

    public SeatMap(SeatMap seatMap) {
        this.map = new HashMap<>();
        this.map.putAll(seatMap.getMap());
        this.maxX = seatMap.getMaxX();
        this.maxY = seatMap.getMaxY();
    }

    public Map<Coordinate, Position> getMap() {
        return map;
    }

    public Position getCoordinate(int x, int y) {
        return map.get(new Coordinate(x, y));
    }

    public int getMaxX() {
        return maxX;
    }

    public int getMaxY() {
        return maxY;
    }
}
