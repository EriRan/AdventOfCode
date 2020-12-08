package fi.eriran.day7.calculation;

import fi.eriran.common.parser.LineInputParserProxy;
import fi.eriran.day7.constant.CalculationConstant;
import fi.eriran.day7.parser.BagMapParser;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TargetBagContainingBagFinderTest {

    @Test
    void example() {
        assertEquals(
                4,
                new BagFinder()
                        .find(CalculationConstant.TARGET_BAG,
                                new BagMapParser().parse(new LineInputParserProxy().parse("day7TestInput"))
                        )
        );
    }
}