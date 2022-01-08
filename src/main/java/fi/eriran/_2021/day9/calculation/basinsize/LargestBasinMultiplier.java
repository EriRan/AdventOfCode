package fi.eriran._2021.day9.calculation.basinsize;

import fi.eriran._2021.day9.calculation.map.basin.objects.Basin;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LargestBasinMultiplier {

    public long calculate(List<Basin> basins) {
        if (basins.size() == 1) {
            return basins.get(0).getSize();
        }
        else if (basins.size() == 2) {
            return (long) basins.get(0).getSize() * basins.get(1).getSize();
        } else if (basins.size() == 3) {
            return (long) basins.get(0).getSize() * basins.get(1).getSize() * basins.get(2).getSize();
        }
        // Sort in an ascending order
        List<Basin> sortedBasins = basins.stream()
                .sorted(Comparator.comparingInt(Basin::getSize))
                .collect(Collectors.toList());
        // Multiply three last sizes together
        return (long) sortedBasins.get(sortedBasins.size() - 1).getSize()
                * sortedBasins.get(sortedBasins.size() - 2).getSize()
                * sortedBasins.get(sortedBasins.size() - 3).getSize();
    }
}
