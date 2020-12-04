package fi.eriran.day1;

import com.google.common.io.Resources;
import org.apache.commons.collections4.CollectionUtils;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Collection;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class InputParserTest {

    @Test
    void inputFetched() throws IOException {
        Collection<Integer> inputNumbers = new InputParser().parse(Resources.getResource("day1TestInput"));
        assertFalse(CollectionUtils.isEmpty(inputNumbers));
        assertTrue(inputNumbers.stream().allMatch(Objects::nonNull));
        assertEquals(6, inputNumbers.size());
    }
}