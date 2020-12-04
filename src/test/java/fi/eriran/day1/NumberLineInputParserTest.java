package fi.eriran.day1;

import com.google.common.io.Resources;
import fi.eriran.common.parser.NumberInputParser;
import org.apache.commons.collections4.CollectionUtils;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Collection;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class NumberLineInputParserTest {

    @Test
    void inputFetched() throws IOException {
        Collection<Integer> inputNumbers = new NumberInputParser().parse(Resources.getResource("day1TestInput"));
        assertFalse(CollectionUtils.isEmpty(inputNumbers));
        assertTrue(inputNumbers.stream().allMatch(Objects::nonNull));
        assertEquals(6, inputNumbers.size());
    }
}