package fi.eriran.common.parser;

import org.apache.commons.collections4.CollectionUtils;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class IntegerInputParserTest {

    @Test
    void successfulParse() {
        List<Integer> parseResponse = new IntegerInputParser().parse("123" + System.lineSeparator() + "456");
        assertFalse(CollectionUtils.isEmpty(parseResponse));
        assertEquals(2, parseResponse.size());
        assertEquals(123, parseResponse.get(0));
        assertEquals(456, parseResponse.get(1));
    }
}