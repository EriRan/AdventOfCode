package fi.eriran._2021.day5.map;

import fi.eriran._2021.day5.map.objects.CoordinateKey;
import fi.eriran._2021.day5.parser.objects.VentLine;

import java.util.Collection;
import java.util.Map;

public abstract class AbstractVentMapFactory {

    public abstract Map<CoordinateKey, Integer> create(Collection<VentLine> vents);

    protected void updateMap(Map<CoordinateKey, Integer> ventCoordinateCountMap, CoordinateKey coordinateKey) {
        Integer existingCount = ventCoordinateCountMap.get(coordinateKey);
        if (existingCount != null) {
            ventCoordinateCountMap.put(coordinateKey, ++existingCount);
        } else {
            ventCoordinateCountMap.put(coordinateKey, 1);
        }
    }
}
