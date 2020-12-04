package fi.eriran.day1;

import org.apache.commons.collections4.CollectionUtils;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Collection;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class InputParserTest {

    @Test
    void inputFetched() throws IOException {
        Collection<Integer> inputNumbers = new InputParser().parse("day1Input");
        assertFalse(CollectionUtils.isEmpty(inputNumbers));
        assertTrue(inputNumbers.stream().allMatch(Objects::nonNull));
    }
}