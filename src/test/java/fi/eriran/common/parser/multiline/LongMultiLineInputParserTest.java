package fi.eriran.common.parser.multiline;

import fi.eriran.common.parser.multiline.LongMultiLineInputParser;
import org.apache.commons.collections4.CollectionUtils;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LongMultiLineInputParserTest {

    @Test
    void successfulParse() {
        List<Long> parseResponse = new LongMultiLineInputParser()
                .parse("123" + System.lineSeparator() + "456");
        assertFalse(CollectionUtils.isEmpty(parseResponse));
        assertEquals(2, parseResponse.size());
        assertEquals(123, parseResponse.get(0));
        assertEquals(456, parseResponse.get(1));
    }
}