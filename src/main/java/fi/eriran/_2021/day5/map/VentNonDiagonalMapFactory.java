package fi.eriran._2021.day5.map;

import fi.eriran._2021.day5.map.objects.CoordinateKey;
import fi.eriran._2021.day5.parser.objects.VentLine;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Creates only horizontal and vertical lines
 */
public class VentNonDiagonalMapFactory extends AbstractVentMapFactory {

    public Map<CoordinateKey, Integer> create(Collection<VentLine> vents) {
        Map<CoordinateKey, Integer> ventCoordinateCountMap = new HashMap<>();
        vents.forEach(vent -> generateKeys(vent, ventCoordinateCountMap));
        return ventCoordinateCountMap;
    }

    private void generateKeys(VentLine vent, Map<CoordinateKey, Integer> ventCoordinateCountMap) {
        // Either X1 == X2 or Y1 == Y2. Find out which one is not equal and generate a horizontal or vertical line
        if (vent.getX1() != vent.getX2()) {
            generateHorizontal(vent, ventCoordinateCountMap);
        } else {
            generateVertical(vent, ventCoordinateCountMap);
        }
    }

    protected void generateHorizontal(VentLine vent, Map<CoordinateKey, Integer> ventCoordinateCountMap) {
        if (vent.getX1() > vent.getX2()) {
            for (int i = vent.getX2(); i <= vent.getX1(); i++) {
                CoordinateKey coordinateKey = new CoordinateKey(i, vent.getY1());
                updateMap(ventCoordinateCountMap, coordinateKey);
            }
        } else {
            for (int i = vent.getX1(); i <= vent.getX2(); i++) {
                CoordinateKey coordinateKey = new CoordinateKey(i, vent.getY1());
                updateMap(ventCoordinateCountMap, coordinateKey);
            }
        }
    }

    protected void generateVertical(VentLine vent, Map<CoordinateKey, Integer> ventCoordinateCountMap) {
        if (vent.getY1() > vent.getY2()) {
            for (int i = vent.getY2(); i <= vent.getY1(); i++) {
                CoordinateKey coordinateKey = new CoordinateKey(vent.getX1(), i);
                updateMap(ventCoordinateCountMap, coordinateKey);
            }
        } else {
            for (int i = vent.getY1(); i <= vent.getY2(); i++) {
                CoordinateKey coordinateKey = new CoordinateKey(vent.getX1(), i);
                updateMap(ventCoordinateCountMap, coordinateKey);
            }
        }
    }
}
