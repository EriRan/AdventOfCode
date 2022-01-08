package fi.eriran._2021.day9;

import fi.eriran.common.parser.multiline.MultiLineInputParserProxy;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SmokeBasinPartTwoTest {

    private final SmokeBasinPartTwo smokeBasinPartTwo = new SmokeBasinPartTwo();

    @Test
    void example() {
        List<String> lines = new MultiLineInputParserProxy().parse("2021/day9");
        assertEquals(
                1134,
                smokeBasinPartTwo.calculate(lines)
        );
    }
}