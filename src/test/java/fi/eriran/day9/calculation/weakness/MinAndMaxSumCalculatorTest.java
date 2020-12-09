package fi.eriran.day9.calculation.weakness;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class MinAndMaxSumCalculatorTest {

    @Test
    void example() {
        assertEquals(
                62,
                new MinAndMaxSumCalculator().calculate(Arrays.asList(15L, 25L, 47L, 40L))
        );
    }

    @Test
    void onlyOneInputValue() {
        assertNull(new MinAndMaxSumCalculator().calculate(Collections.singletonList(15L)));
    }

    @Test
    void nullInput() {
        assertNull(new MinAndMaxSumCalculator().calculate(null));
    }

    @Test
    void emptyList() {
        assertNull(new MinAndMaxSumCalculator().calculate(Collections.emptyList()));
    }
}