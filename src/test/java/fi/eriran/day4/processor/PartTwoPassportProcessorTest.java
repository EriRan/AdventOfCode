package fi.eriran.day4.processor;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PartTwoPassportProcessorTest {

    @Test
    void exampleInvalids() throws IOException {
        assertEquals(
                0,
                new PartTwoPassportProcessor().process("day4PartTwoInvalidTestInput")
        );
    }

    @Test
    void exampleValids() throws IOException {
        assertEquals(
                4,
                new PartTwoPassportProcessor().process("day4PartTwoValidTestInput")
        );
    }
}