package fi.eriran.day4;

import com.google.common.io.Resources;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class PassportProcessorTest {

    @Test
    void example() throws IOException {
        assertEquals(
                2,
                new PassportProcessor().process(Resources.getResource("day4TestInput"))
        );

    }
}