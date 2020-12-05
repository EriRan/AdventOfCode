package fi.eriran.day5.seat.decode.column;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ColumnDecoderTest {

    private final ColumnDecoder columnDecoder;

    public ColumnDecoderTest() {
        columnDecoder = new ColumnDecoder();
    }

    @Test
    void convertExample1() {
        assertEquals(5, columnDecoder.decode("RLR"));
    }

    @Test
    void convertExample2() {
        assertEquals(7, columnDecoder.decode("RRR"));
    }

    //Example 3 was the same as example 2

    @Test
    void convertExample4() {
        assertEquals(4, columnDecoder.decode("RLL"));
    }

}