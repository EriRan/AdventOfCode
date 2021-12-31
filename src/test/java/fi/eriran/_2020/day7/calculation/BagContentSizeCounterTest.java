package fi.eriran._2020.day7.calculation;

import fi.eriran.common.parser.multiline.LineInputParserProxy;
import fi.eriran._2020.day7.constant.CalculationConstant;
import fi.eriran._2020.day7.parser.BagMapParser;
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
                                new BagMapParser().parse(new LineInputParserProxy().parse("2020/Day7PartTwoTestInput"))
                        )
        );
    }
}