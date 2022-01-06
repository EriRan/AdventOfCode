package fi.eriran._2021.day8;

import fi.eriran._2021.day8.calculation.EasyDigitCountCalculator;
import fi.eriran._2021.day8.parser.raw.RawSevenSegmentParser;

import java.util.List;

public class PartOneCalculator {

    public int calculate(List<String> lines) {
        return new EasyDigitCountCalculator().count(
                new RawSevenSegmentParser().parse(lines)
        );
    }
}
