package fi.eriran.day1;

import fi.eriran.common.parser.NumberInputParserProxy;
import org.apache.commons.collections4.CollectionUtils;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Collection;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class NumberLineInputParserProxyTest {

    @Test
    void inputFetched() throws IOException {
        Collection<Integer> inputNumbers = new NumberInputParserProxy().parse("day1TestInput");
        assertFalse(CollectionUtils.isEmpty(inputNumbers));
        assertTrue(inputNumbers.stream().allMatch(Objects::nonNull));
        assertEquals(6, inputNumbers.size());
    }
}