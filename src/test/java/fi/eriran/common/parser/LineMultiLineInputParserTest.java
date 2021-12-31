package fi.eriran.common.parser;

import org.apache.commons.collections4.CollectionUtils;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LineMultiLineInputParserTest {

    @Test
    void windowsLinesParsed() {
        List<String> parseResponse = new LineMultiLineInputParser().parse("Hello\r\nWorld");
        assertFalse(CollectionUtils.isEmpty(parseResponse));
        assertEquals(2, parseResponse.size());
        assertEquals("Hello", parseResponse.get(0));
        assertEquals("World", parseResponse.get(1));
    }

    @Test
    void unixLinesParsed() {
        List<String> parseResponse = new LineMultiLineInputParser().parse("Hello\nWorld");
        assertFalse(CollectionUtils.isEmpty(parseResponse));
        assertEquals(2, parseResponse.size());
        assertEquals("Hello", parseResponse.get(0));
        assertEquals("World", parseResponse.get(1));
    }

    @Test
    void nullInputReturnsEmptyCollection() {
        List<String> parseResponse = new LineMultiLineInputParser().parse(null);
        assertNotNull(parseResponse);
        assertEquals(0, parseResponse.size());
    }

    @Test
    void emptyStringInputReturnsEmptyCollection() {
        List<String> parseResponse = new LineMultiLineInputParser().parse(" ");
        assertNotNull(parseResponse);
        assertEquals(0, parseResponse.size());
    }
}