package fi.eriran.day4.processor;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PartOnePassportProcessorTest {

    @Test
    void example() throws IOException {
        assertEquals(
                2,
                new PartOnePassportProcessor().process("day4PartOneTestInput")
        );
    }
}