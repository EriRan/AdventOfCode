package fi.eriran.day7;

import fi.eriran.common.parser.LineInputParserProxy;
import fi.eriran.day7.calculation.BagContentSizeCounter;
import fi.eriran.day7.calculation.BagFinder;
import fi.eriran.day7.constant.CalculationConstant;
import fi.eriran.day7.parser.BagMapParser;
import fi.eriran.day7.pojo.bag.Bag;
import fi.eriran.day7.pojo.bag.Description;

import java.util.Map;

public class HandyHaversacksMain {

    public static void main(String[] args) {
        Map<Description, Bag> bagMap = new BagMapParser()
                .parse(new LineInputParserProxy().parse("day7Input"));
        System.out.println("Part one bags that contain the target: "
                + new BagFinder()
                .find(CalculationConstant.TARGET_BAG,
                        bagMap
                )
        );
        System.out.println("Part two the amount of bags that the target bag can contain: "
                + new BagContentSizeCounter().count(CalculationConstant.TARGET_BAG, bagMap)
        );
    }
}
