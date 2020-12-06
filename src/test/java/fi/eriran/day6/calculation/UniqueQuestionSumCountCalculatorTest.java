package fi.eriran.day6.calculation;

import com.google.common.io.Resources;
import fi.eriran.common.parser.LineInputParser;
import fi.eriran.day6.parser.GroupCustomFormFactory;
import fi.eriran.day6.parser.raw.PositiveQuestionCodesParser;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class UniqueQuestionSumCountCalculatorTest {

    @Test
    void example() throws IOException {
        assertEquals(
                11,
                new UniqueQuestionSumCountCalculator()
                        .calculate(
                                new GroupCustomFormFactory().build(
                                        new PositiveQuestionCodesParser().parse(
                                                new LineInputParser()
                                                        .parse(Resources.getResource("day6TestInput"))
                                        )
                                )
                        )
        );

    }
}