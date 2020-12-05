package fi.eriran.day3;

import com.google.common.io.Resources;
import fi.eriran.common.parser.LineInputParser;
import fi.eriran.day3.parser.MapGenerator;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TobogganTreeCounterTest {

    @Test
    void sameResultAsExample() throws IOException {
        assertEquals(
                7,
                new TobogganTreeCounter()
                        .count(
                                new MapGenerator()
                                        .generate(
                                                new LineInputParser()
                                                        .parse(Resources.getResource("day3TestInput"))
                                        )

                        )
        );
    }
}