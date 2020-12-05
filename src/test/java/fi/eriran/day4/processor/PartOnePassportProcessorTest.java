package fi.eriran.day4.processor;

import com.google.common.io.Resources;
import fi.eriran.day4.processor.PartOnePassportProcessor;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class PartOnePassportProcessorTest {

    @Test
    void example() throws IOException {
        assertEquals(
                2,
                new PartOnePassportProcessor().process(Resources.getResource("day4TestInput"))
        );
    }
}