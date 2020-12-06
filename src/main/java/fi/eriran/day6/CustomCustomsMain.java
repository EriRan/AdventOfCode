package fi.eriran.day6;

import com.google.common.io.Resources;
import fi.eriran.common.parser.LineInputParser;
import fi.eriran.day6.calculation.UniqueQuestionSumCountCalculator;
import fi.eriran.day6.parser.GroupCustomFormFactory;
import fi.eriran.day6.parser.raw.PositiveQuestionCodesParser;

import java.io.IOException;

public class CustomCustomsMain {

    public static void main(String[] args) throws IOException {
        System.out.println("Part one total sum: " +
                new UniqueQuestionSumCountCalculator()
                        .calculate(
                                new GroupCustomFormFactory().build(
                                        new PositiveQuestionCodesParser().parse(
                                                new LineInputParser()
                                                        .parse(Resources.getResource("day6Input"))
                                        )
                                )
                        )
        );
    }
}
