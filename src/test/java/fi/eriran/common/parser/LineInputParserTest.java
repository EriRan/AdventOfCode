package fi.eriran.common.parser;

import org.apache.commons.collections4.CollectionUtils;
import org.junit.jupiter.api.Test;

import java.util.List;

import static fi.eriran.common.parser.constant.ParserConstant.WINDOWS_LINE_BREAK;
import static org.junit.jupiter.api.Assertions.*;

class LineInputParserTest {

    @Test
    void windowsLinesParsed() {
        List<String> parseResponse = new LineInputParser().parse("Hello" + WINDOWS_LINE_BREAK + "World");
        assertFalse(CollectionUtils.isEmpty(parseResponse));
        assertEquals(2, parseResponse.size());
        assertEquals("Hello", parseResponse.get(0));
        assertEquals("World", parseResponse.get(1));
    }

    @Test
    void nullInputReturnsEmptyCollection() {
        List<String> parseResponse = new LineInputParser().parse(null);
        assertNotNull(parseResponse);
        assertEquals(0, parseResponse.size());
    }

    @Test
    void emptyStringInputReturnsEmptyCollection() {
        List<String> parseResponse = new LineInputParser().parse(" ");
        assertNotNull(parseResponse);
        assertEquals(0, parseResponse.size());
    }
}