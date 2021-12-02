package fi.eriran._2020.day3;

import fi.eriran.common.parser.LineInputParserProxy;
import fi.eriran._2020.day3.parser.MapGenerator;
import fi.eriran._2020.day3.pojo.TrajectoryDefinition;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TobogganTreeCounterMain {

    private static final Logger logger = Logger.getGlobal();

    public static void main(String[] args) {
        int partOneResult = countTrees(3, 1);
        logger.log(
                Level.INFO,
                () -> "Part one trees encountered: " + partOneResult
        );
        logger.log(
                Level.INFO,
                () -> "Part Two result: " + calculatePartTwoResult(partOneResult)
        );
    }

    private static long calculatePartTwoResult(int partOneResult) {
        return (long) countTrees(1, 1) *
                partOneResult *
                countTrees(5, 1) *
                countTrees(7, 1) *
                countTrees(1, 2);
    }

    private static int countTrees(int right, int down) {
        int treesFound = new TobogganTreeCounter()
                .count(
                        new MapGenerator().generate(
                                new LineInputParserProxy().parse("2020/day3Input")
                        ),
                        new TrajectoryDefinition(right, down)
                );
        logger.log(Level.INFO, () -> "Found " + treesFound + " trees!");
        return treesFound;
    }
}
