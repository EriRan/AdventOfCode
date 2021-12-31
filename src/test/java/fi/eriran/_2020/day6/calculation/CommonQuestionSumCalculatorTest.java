package fi.eriran._2020.day6.calculation;

import fi.eriran.common.parser.multiline.MultiLineInputParserProxy;
import fi.eriran._2020.day6.parser.GroupCustomFormEveryoneFactory;
import fi.eriran._2020.day6.parser.raw.PositiveQuestionCodesParserPerPerson;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CommonQuestionSumCalculatorTest {

    @Test
    void example() {
        assertEquals(
                6,
                new CommonQuestionSumCalculator()
                        .calculate(
                                new GroupCustomFormEveryoneFactory().build(
                                        new PositiveQuestionCodesParserPerPerson().parse(
                                                new MultiLineInputParserProxy()
                                                        .parse("2020/day6TestInput")
                                        )
                                )
                        )
        );
    }

}