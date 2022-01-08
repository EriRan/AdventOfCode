package fi.eriran._2021.day9;

import fi.eriran._2021.day9.calculation.basinsize.LargestBasinMultiplier;
import fi.eriran._2021.day9.calculation.map.basin.BasinFinder;
import fi.eriran._2021.day9.parser.BasinMapParser;

import java.util.List;

public class SmokeBasinPartTwo {

    public long calculate(List<String> lines) {
        return new LargestBasinMultiplier().calculate(
                new BasinFinder().find(
                        new BasinMapParser().parse(lines)
                )
        );
    }

}
