package fi.eriran.twozerotwozero.day3;

import fi.eriran.common.parser.LineInputParserProxy;
import fi.eriran.twozerotwozero.day3.parser.MapGenerator;
import fi.eriran.twozerotwozero.day3.pojo.TrajectoryDefinition;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TobogganTreeCounterTest {

    @Test
    void partOneExample() throws IOException {
        assertEquals(
                7,
                countTrees(3, 1)
        );
    }

    @Test
    void partTwoExampleOne() throws IOException {
        assertEquals(
                2,
                countTrees(1, 1)
        );
    }

    //Example two of part two is the same partOne example
    @Test
    void partTwoExampleThree() throws IOException {
        assertEquals(
                3,
                countTrees(5, 1)
        );
    }

    @Test
    void partTwoExampleFour() throws IOException {
        assertEquals(
                4,
                countTrees(7, 1)
        );
    }

    @Test
    void partTwoExampleFive() throws IOException {
        assertEquals(
                2,
                countTrees(1, 2)
        );
    }

    @Test
    void multiplyResultIsCorrect() throws IOException {
        assertEquals(
                336,
                countTrees(1, 1) *
                        countTrees(3, 1) *
                        countTrees(5, 1) *
                        countTrees(7, 1) *
                        countTrees(1, 2)
        );
    }

    private int countTrees(int right, int down) throws IOException {
        return new TobogganTreeCounter()
                .count(
                        new MapGenerator()
                                .generate(
                                        new LineInputParserProxy()
                                                .parse("day3TestInput")
                                ),
                        new TrajectoryDefinition(right, down)
                );
    }
}