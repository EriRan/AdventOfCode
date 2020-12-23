package fi.eriran.day7;

import fi.eriran.common.parser.LineInputParserProxy;
import fi.eriran.day7.calculation.BagContentSizeCounter;
import fi.eriran.day7.calculation.BagFinder;
import fi.eriran.day7.constant.CalculationConstant;
import fi.eriran.day7.parser.BagMapParser;
import fi.eriran.day7.pojo.bag.Bag;
import fi.eriran.day7.pojo.bag.Description;

import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HandyHaversacksMain {

    private static final Logger logger = Logger.getGlobal();

    public static void main(String[] args) {
        Map<Description, Bag> bagMap = new BagMapParser()
                .parse(new LineInputParserProxy().parse("day7Input"));
        logger.log(
                Level.INFO,
                () -> "Part one bags that contain the target: "
                        + new BagFinder()
                        .find(CalculationConstant.TARGET_BAG,
                                bagMap
                        )
        );
        logger.log(
                Level.INFO,
                () -> "Part two the amount of bags that the target bag can contain: "
                        + new BagContentSizeCounter().count(CalculationConstant.TARGET_BAG, bagMap)
        );
    }
}
