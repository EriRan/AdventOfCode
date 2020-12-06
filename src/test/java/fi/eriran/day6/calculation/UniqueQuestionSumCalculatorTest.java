package fi.eriran.day6.calculation;

import com.google.common.io.Resources;
import fi.eriran.common.parser.LineInputParser;
import fi.eriran.day6.parser.GroupCustomFormAnyoneFactory;
import fi.eriran.day6.parser.raw.PositiveQuestionCodesParserPerGroup;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class UniqueQuestionSumCalculatorTest {

    @Test
    void example() throws IOException {
        assertEquals(
                11,
                new UniqueQuestionSumCalculator()
                        .calculate(
                                new GroupCustomFormAnyoneFactory().build(
                                        new PositiveQuestionCodesParserPerGroup().parse(
                                                new LineInputParser()
                                                        .parse(Resources.getResource("day6TestInput"))
                                        )
                                )
                        )
        );
    }
}