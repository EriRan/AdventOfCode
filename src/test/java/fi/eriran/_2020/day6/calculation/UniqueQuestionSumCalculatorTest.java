package fi.eriran._2020.day6.calculation;

import fi.eriran.common.parser.multiline.MultiLineInputParserProxy;
import fi.eriran._2020.day6.parser.GroupCustomFormAnyoneFactory;
import fi.eriran._2020.day6.parser.raw.PositiveQuestionCodesParserPerGroup;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UniqueQuestionSumCalculatorTest {

    @Test
    void example() {
        assertEquals(
                11,
                new UniqueQuestionSumCalculator()
                        .calculate(
                                new GroupCustomFormAnyoneFactory().build(
                                        new PositiveQuestionCodesParserPerGroup().parse(
                                                new MultiLineInputParserProxy()
                                                        .parse("2020/day6TestInput")
                                        )
                                )
                        )
        );
    }
}