package fi.eriran._2021.day8;

import fi.eriran._2021.day8.calculation.DecodedDigitSumCalculator;
import fi.eriran._2021.day8.parser.decoded.DecodedSevenSegmentParser;
import fi.eriran._2021.day8.parser.raw.RawSevenSegmentParser;

import java.util.List;

public class PartTwoCalculator {

    public long calculate(List<String> lines) {
        return new DecodedDigitSumCalculator().calculate(
                new DecodedSevenSegmentParser()
                        .parse(new RawSevenSegmentParser().parse(lines))
        );
    }
}
