package fi.eriran.day5.seat.decode.row;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RowDecoderTest {

    private final RowDecoder rowDecoder;

    public RowDecoderTest() {
        rowDecoder = new RowDecoder();
    }

    @Test
    void convertExample1() {
        assertEquals(44, rowDecoder.decode("FBFBBFF"));
    }

    @Test
    void convertExample2() {
        assertEquals(70, rowDecoder.decode("BFFFBBF"));
    }

    @Test
    void convertExample3() {
        assertEquals(14, rowDecoder.decode("FFFBBBF"));
    }

    @Test
    void convertExample4() {
        assertEquals(102, rowDecoder.decode("BBFFBBF"));
    }
}