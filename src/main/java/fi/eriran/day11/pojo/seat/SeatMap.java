package fi.eriran.day11.pojo.seat;

import fi.eriran.day11.pojo.Position;

import java.util.HashMap;
import java.util.Map;

public class SeatMap {

    private final Map<Coordinate, Position> map;

    public SeatMap() {
        map = new HashMap<>();
    }

    public Map<Coordinate, Position> getMap() {
        return map;
    }

    public Position getCoordinate(int x, int y) {
        return map.get(new Coordinate(x, y));
    }
}
