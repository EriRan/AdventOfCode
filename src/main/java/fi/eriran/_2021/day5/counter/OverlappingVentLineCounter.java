package fi.eriran._2021.day5.counter;

import fi.eriran._2021.day5.map.objects.CoordinateKey;

import java.util.Map;

public class OverlappingVentLineCounter {

    public long count(Map<CoordinateKey, Integer> coordinateMap) {
        return coordinateMap.values().stream()
                .filter(count -> count != null && count > 1).count();
    }
}
