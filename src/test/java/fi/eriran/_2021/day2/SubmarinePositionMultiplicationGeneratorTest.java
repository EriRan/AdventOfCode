package fi.eriran._2021.day2;

import fi.eriran.common.parser.LineInputParserProxy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubmarinePositionMultiplicationGeneratorTest {

    @Test
    void example() {
        assertEquals(150, new SubmarinePositionMultiplicationGenerator().generate(new LineInputParserProxy().parse("2021/day2")));
    }
}