package fi.eriran._2020.day7.calculation;

import fi.eriran.common.parser.multiline.MultiLineInputParserProxy;
import fi.eriran._2020.day7.constant.CalculationConstant;
import fi.eriran._2020.day7.parser.BagMapParser;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TargetBagContainingBagFinderTest {

    @Test
    void example() {
        assertEquals(
                4,
                new BagFinder()
                        .find(CalculationConstant.TARGET_BAG,
                                new BagMapParser().parse(new MultiLineInputParserProxy().parse("2020/day7PartOneTestInput"))
                        )
        );
    }
}