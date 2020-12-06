package fi.eriran.day6.calculation;

import fi.eriran.common.parser.LineInputParserProxy;
import fi.eriran.day6.parser.GroupCustomFormEveryoneFactory;
import fi.eriran.day6.parser.raw.PositiveQuestionCodesParserPerPerson;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CommonQuestionSumCalculatorTest {

    @Test
    void example() throws IOException {
        assertEquals(
                6,
                new CommonQuestionSumCalculator()
                        .calculate(
                                new GroupCustomFormEveryoneFactory().build(
                                        new PositiveQuestionCodesParserPerPerson().parse(
                                                new LineInputParserProxy()
                                                        .parse("day6TestInput")
                                        )
                                )
                        )
        );
    }

}