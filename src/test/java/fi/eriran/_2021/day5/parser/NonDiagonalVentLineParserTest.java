package fi.eriran._2021.day5.parser;

import fi.eriran._2021.day5.parser.objects.VentLine;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class NonDiagonalVentLineParserTest {

    private final NonDiagonalVentLineParser parser = new NonDiagonalVentLineParser();

    @Test
    void horizontalLineRight() {
        String horizontalLine = "0,0 -> 5,0";
        Collection<VentLine> parsedLines = parser.parse(Collections.singletonList(horizontalLine));
        assertNotNull(parsedLines);
        assertEquals(1, parsedLines.size());
        parsedLines.forEach(line -> {
            assertEquals(0, line.getX1());
            assertEquals(0, line.getY1());
            assertEquals(5, line.getX2());
            assertEquals(0, line.getY2());
        });
    }

    @Test
    void horizontalLineLeft() {
        String horizontalLine = "5,0 -> 0,0";
        Collection<VentLine> parsedLines = parser.parse(Collections.singletonList(horizontalLine));
        assertNotNull(parsedLines);
        assertEquals(1, parsedLines.size());
        parsedLines.forEach(line -> {
            assertEquals(5, line.getX1());
            assertEquals(0, line.getY1());
            assertEquals(0, line.getX2());
            assertEquals(0, line.getY2());
        });
    }

    @Test
    void verticalLineDown() {
        String horizontalLine = "0,0 -> 0,5";
        Collection<VentLine> parsedLines = parser.parse(Collections.singletonList(horizontalLine));
        assertNotNull(parsedLines);
        assertEquals(1, parsedLines.size());
        parsedLines.forEach(line -> {
            assertEquals(0, line.getX1());
            assertEquals(0, line.getY1());
            assertEquals(0, line.getX2());
            assertEquals(5, line.getY2());
        });
    }

    @Test
    void verticalLineUp() {
        String horizontalLine = "0,5 -> 0,0";
        Collection<VentLine> parsedLines = parser.parse(Collections.singletonList(horizontalLine));
        assertNotNull(parsedLines);
        assertEquals(1, parsedLines.size());
        parsedLines.forEach(line -> {
            assertEquals(0, line.getX1());
            assertEquals(5, line.getY1());
            assertEquals(0, line.getX2());
            assertEquals(0, line.getY2());
        });
    }
}