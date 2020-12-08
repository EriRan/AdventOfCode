package fi.eriran.day7.calculation;

import fi.eriran.common.parser.LineInputParserProxy;
import fi.eriran.day7.constant.CalculationConstant;
import fi.eriran.day7.parser.BagMapParser;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BagContentSizeCounterTest {

    @Test
    void example() {
        assertEquals(
                126,
                new BagContentSizeCounter()
                        .count(
                                CalculationConstant.TARGET_BAG,
                                new BagMapParser().parse(new LineInputParserProxy().parse("Day7PartTwoTestInput"))
                        )
        );
    }
}