package fi.eriran._2020.day6;

import fi.eriran.common.parser.LineInputParserProxy;
import fi.eriran._2020.day6.calculation.CommonQuestionSumCalculator;
import fi.eriran._2020.day6.calculation.UniqueQuestionSumCalculator;
import fi.eriran._2020.day6.parser.GroupCustomFormAnyoneFactory;
import fi.eriran._2020.day6.parser.GroupCustomFormEveryoneFactory;
import fi.eriran._2020.day6.parser.raw.PositiveQuestionCodesParserPerGroup;
import fi.eriran._2020.day6.parser.raw.PositiveQuestionCodesParserPerPerson;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CustomCustomsMain {

    private static final Logger logger = Logger.getGlobal();

    public static void main(String[] args) {
        logger.log(
                Level.INFO,
                () -> "Part one total sum: " +
                        new UniqueQuestionSumCalculator()
                                .calculate(
                                        new GroupCustomFormAnyoneFactory().build(
                                                new PositiveQuestionCodesParserPerGroup().parse(
                                                        new LineInputParserProxy()
                                                                .parse("2020/day6Input")
                                                )
                                        )
                                )
        );
        logger.log(
                Level.INFO,
                () -> "Part two total sum: " +
                        new CommonQuestionSumCalculator()
                                .calculate(
                                        new GroupCustomFormEveryoneFactory().build(
                                                new PositiveQuestionCodesParserPerPerson().parse(
                                                        new LineInputParserProxy()
                                                                .parse("2020/day6Input")
                                                )
                                        )
                                )
        );
    }
}
