package fi.eriran._2021.day2;

import fi.eriran.common.parser.multiline.MultiLineInputParserProxy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubmarinePositionMultiplicationGeneratorTest {

    @Test
    void examplePartOne() {
        assertEquals(150, new SubmarinePositionMultiplicationGenerator().generateSimple(new MultiLineInputParserProxy().parse("2021/day2")));
    }

    @Test
    void examplePartTwo() {
        assertEquals(900, new SubmarinePositionMultiplicationGenerator().generateAim(new MultiLineInputParserProxy().parse("2021/day2")));
    }
}