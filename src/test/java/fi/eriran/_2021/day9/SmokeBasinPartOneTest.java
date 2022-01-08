package fi.eriran._2021.day9;

import fi.eriran.common.parser.multiline.MultiLineInputParserProxy;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SmokeBasinPartOneTest {

    private final SmokeBasinPartOne smokeBasinPartOne = new SmokeBasinPartOne();

    @Test
    void example() {
        List<String> lines = new MultiLineInputParserProxy().parse("2021/day9");
        assertEquals(
                15,
                smokeBasinPartOne.calculate(lines)
        );
    }
}