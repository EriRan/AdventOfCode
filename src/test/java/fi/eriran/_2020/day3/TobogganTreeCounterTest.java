package fi.eriran._2020.day3;

import fi.eriran.common.parser.multiline.MultiLineInputParserProxy;
import fi.eriran._2020.day3.parser.MapGenerator;
import fi.eriran._2020.day3.pojo.TrajectoryDefinition;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TobogganTreeCounterTest {

    @Test
    void partOneExample() {
        assertEquals(
                7,
                countTrees(3, 1)
        );
    }

    @Test
    void partTwoExampleOne() {
        assertEquals(
                2,
                countTrees(1, 1)
        );
    }

    //Example two of part two is the same partOne example
    @Test
    void partTwoExampleThree() {
        assertEquals(
                3,
                countTrees(5, 1)
        );
    }

    @Test
    void partTwoExampleFour() {
        assertEquals(
                4,
                countTrees(7, 1)
        );
    }

    @Test
    void partTwoExampleFive() {
        assertEquals(
                2,
                countTrees(1, 2)
        );
    }

    @Test
    void multiplyResultIsCorrect() {
        assertEquals(
                336,
                countTrees(1, 1) *
                        countTrees(3, 1) *
                        countTrees(5, 1) *
                        countTrees(7, 1) *
                        countTrees(1, 2)
        );
    }

    private int countTrees(int right, int down) {
        return new TobogganTreeCounter()
                .count(
                        new MapGenerator()
                                .generate(
                                        new MultiLineInputParserProxy()
                                                .parse("2020/day3TestInput")
                                ),
                        new TrajectoryDefinition(right, down)
                );
    }
}