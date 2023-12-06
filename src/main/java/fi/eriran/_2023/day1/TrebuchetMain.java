package fi.eriran._2023.day1;

import fi.eriran.common.parser.multiline.MultiLineInputParserProxy;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TrebuchetMain {

    private static final Logger logger = Logger.getGlobal();

    public static void main(String[] args) {
        TrebuchetTasks trebuchetTasks = new TrebuchetTasks();
        trebuchetTasks.setValueFinder(new CalibrationValueFinder());
        List<String> input = new MultiLineInputParserProxy().parse("2023/day1");
        logger.log(
                Level.INFO,
                () -> "Part One: " + trebuchetTasks.findSum(input)
        );
        trebuchetTasks.setValueFinder(new CalibrationValueWithNumberNameFinder());
        logger.log(
                Level.INFO,
                () -> "Part Two: " + trebuchetTasks.findSum(input)
        );
    }
}
