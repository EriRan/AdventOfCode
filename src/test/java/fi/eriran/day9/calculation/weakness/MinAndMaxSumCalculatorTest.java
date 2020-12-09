package fi.eriran.day9.calculation.weakness;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinAndMaxSumCalculatorTest {

    @Test
    void example() {
        assertEquals(
                62,
                new MinAndMaxSumCalculator().calculate(Arrays.asList(15L, 25L, 47L, 40L))
        );
    }
}