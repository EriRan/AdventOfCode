package fi.eriran.day7;

import fi.eriran.common.parser.LineInputParserProxy;
import fi.eriran.day7.calculation.BagFinder;
import fi.eriran.day7.constant.CalculationConstant;
import fi.eriran.day7.parser.RuleParser;

public class HandyHaversacksMain {

    public static void main(String[] args) {
        System.out.println("Part one bags that contain the target: "
                + new BagFinder()
                .find(CalculationConstant.TARGET_BAG,
                        new RuleParser().parse(new LineInputParserProxy().parse("day7Input"))
                )
        );
    }
}
