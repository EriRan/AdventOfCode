package fi.eriran._2021.day9;

import fi.eriran._2021.day9.calculation.map.lowpoint.LowPointFinder;
import fi.eriran._2021.day9.calculation.risklevel.RiskLevelSumCalculator;
import fi.eriran._2021.day9.parser.HeightMapParser;

import java.util.List;

public class SmokeBasinPartOne {

    public long calculate(List<String> lines) {
        return new RiskLevelSumCalculator()
                .calculate(
                        new LowPointFinder()
                                .find(
                                        new HeightMapParser().parse(lines)
                                )
                );
    }
}
