package fi.eriran._2021.day5.map;

import fi.eriran._2021.day5.map.objects.CoordinateKey;
import fi.eriran._2021.day5.parser.objects.VentLine;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VentMapFactory extends VentNonDiagonalMapFactory {

    @Override
    public Map<CoordinateKey, Integer> create(Collection<VentLine> vents) {
        Map<CoordinateKey, Integer> ventCoordinateCountMap = new HashMap<>();
        vents.forEach(vent -> generateKeysWithDiagonals(vent, ventCoordinateCountMap));
        return ventCoordinateCountMap;
    }

    private void generateKeysWithDiagonals(VentLine vent, Map<CoordinateKey, Integer> ventCoordinateCountMap) {
        // If x:s or y:s are equal, we can generate vertical or horizontal line. Otherwise generate diagonal
        if (vent.getX1() == vent.getX2()) {
            generateVertical(vent, ventCoordinateCountMap);
        } else if (vent.getY1() == vent.getY2()) {
            generateHorizontal(vent, ventCoordinateCountMap);
        } else {
            generateDiagonal(vent, ventCoordinateCountMap);
        }
    }

    private void generateDiagonal(VentLine vent, Map<CoordinateKey, Integer> ventCoordinateCountMap) {
        boolean xOneIsLarger = vent.getX1() > vent.getX2();
        boolean yOneIsLarger = vent.getY1() > vent.getY2();

        // Start the line from x1,y1. Draw to direction that depends on whether point one has larger coordinates or not
        // Upper right direction
        if (!xOneIsLarger && yOneIsLarger) {
            drawUpperRight(vent, ventCoordinateCountMap);
        } else if (!xOneIsLarger) { // Lower right direction
            drawLowerRight(vent, ventCoordinateCountMap);
        } else if (!yOneIsLarger) { // Lower left direction
            drawLowerLeft(vent, ventCoordinateCountMap);
        } else { // Upper left direction
            drawUpperLeft(vent, ventCoordinateCountMap);
        }
    }

    private void drawUpperRight(VentLine vent, Map<CoordinateKey, Integer> ventCoordinateCountMap) {
        int x = vent.getX1();
        int y = vent.getY1();
        while (x <= vent.getX2() && y >= vent.getY2()) {
            updateMap(ventCoordinateCountMap, new CoordinateKey(x, y));
            x++;
            y--;
        }
    }

    private void drawLowerRight(VentLine vent, Map<CoordinateKey, Integer> ventCoordinateCountMap) {
        int x = vent.getX1();
        int y = vent.getY1();
        while (x <= vent.getX2() && y <= vent.getY2()) {
            updateMap(ventCoordinateCountMap, new CoordinateKey(x, y));
            x++;
            y++;
        }
    }

    private void drawLowerLeft(VentLine vent, Map<CoordinateKey, Integer> ventCoordinateCountMap) {
        int x = vent.getX1();
        int y = vent.getY1();
        while (x >= vent.getX2() && y <= vent.getY2()) {
            updateMap(ventCoordinateCountMap, new CoordinateKey(x, y));
            x--;
            y++;
        }
    }

    private void drawUpperLeft(VentLine vent, Map<CoordinateKey, Integer> ventCoordinateCountMap) {
        int x = vent.getX1();
        int y = vent.getY1();
        while (x >= vent.getX2() && y >= vent.getY2()) {
            updateMap(ventCoordinateCountMap, new CoordinateKey(x, y));
            x--;
            y--;
        }
    }
}
