package fi.eriran._2021.day2;

import fi.eriran.common.parser.multiline.LineInputParserProxy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubmarinePositionMultiplicationGeneratorTest {

    @Test
    void examplePartOne() {
        assertEquals(150, new SubmarinePositionMultiplicationGenerator().generateSimple(new LineInputParserProxy().parse("2021/day2")));
    }

    @Test
    void examplePartTwo() {
        assertEquals(900, new SubmarinePositionMultiplicationGenerator().generateAim(new LineInputParserProxy().parse("2021/day2")));
    }
}