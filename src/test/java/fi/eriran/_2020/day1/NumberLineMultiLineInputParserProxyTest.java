package fi.eriran._2020.day1;

import fi.eriran.common.parser.IntegerInputParserProxy;
import org.apache.commons.collections4.CollectionUtils;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Collection;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class NumberLineMultiLineInputParserProxyTest {

    @Test
    void inputFetched() {
        Collection<Integer> inputNumbers = new IntegerInputParserProxy().parse("2020/day1TestInput");
        assertFalse(CollectionUtils.isEmpty(inputNumbers));
        assertTrue(inputNumbers.stream().allMatch(Objects::nonNull));
        assertEquals(6, inputNumbers.size());
    }
}