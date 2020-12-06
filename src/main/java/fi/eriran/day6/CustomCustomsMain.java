package fi.eriran.day6;

import com.google.common.io.Resources;
import fi.eriran.common.parser.LineInputParser;
import fi.eriran.day6.calculation.CommonQuestionSumCalculator;
import fi.eriran.day6.calculation.UniqueQuestionSumCalculator;
import fi.eriran.day6.parser.GroupCustomFormAnyoneFactory;
import fi.eriran.day6.parser.GroupCustomFormEveryoneFactory;
import fi.eriran.day6.parser.raw.PositiveQuestionCodesParserPerGroup;
import fi.eriran.day6.parser.raw.PositiveQuestionCodesParserPerPerson;

import java.io.IOException;

public class CustomCustomsMain {

    public static void main(String[] args) throws IOException {
        System.out.println("Part one total sum: " +
                new UniqueQuestionSumCalculator()
                        .calculate(
                                new GroupCustomFormAnyoneFactory().build(
                                        new PositiveQuestionCodesParserPerGroup().parse(
                                                new LineInputParser()
                                                        .parse(Resources.getResource("day6Input"))
                                        )
                                )
                        )
        );
        System.out.println("Part two total sum: " +
                new CommonQuestionSumCalculator()
                        .calculate(
                                new GroupCustomFormEveryoneFactory().build(
                                        new PositiveQuestionCodesParserPerPerson().parse(
                                                new LineInputParser()
                                                        .parse(Resources.getResource("day6Input"))
                                        )
                                )
                        )
        );
    }
}
