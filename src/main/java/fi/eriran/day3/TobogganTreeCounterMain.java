package fi.eriran.day3;

import com.google.common.io.Resources;
import fi.eriran.common.parser.LineInputParser;
import fi.eriran.day3.parser.MapGenerator;
import fi.eriran.day3.pojo.TrajectoryDefinition;

import java.io.IOException;

public class TobogganTreeCounterMain {

    public static void main(String[] args) throws IOException {
        int partOneResult = countTrees(3, 1);
        System.out.println("Part one trees encountered: " + partOneResult);
        System.out.println("Part Two result: " + calculatePartTwoResult(partOneResult));
    }

    private static long calculatePartTwoResult(int partOneResult) throws IOException {
        return (long) countTrees(1, 1) *
                partOneResult *
                countTrees(5, 1) *
                countTrees(7, 1) *
                countTrees(1, 2);
    }

    private static int countTrees(int right, int down) throws IOException {
        int treesFound = new TobogganTreeCounter()
                .count(
                        new MapGenerator().generate(
                                new LineInputParser().parse(Resources.getResource("day3Input"))
                        ),
                        new TrajectoryDefinition(right, down)
                );
        System.out.println("Found " + treesFound + " trees!");
        return treesFound;
    }
}
