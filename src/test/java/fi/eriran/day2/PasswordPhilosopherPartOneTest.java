package fi.eriran.day2;

import com.google.common.io.Resources;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class PasswordPhilosopherPartOneTest {

    @Test
    void sameResultAsExample() throws IOException {
        assertEquals(
                2,
                new PasswordPhilosopherPartOne().countValidPasswords(Resources.getResource("day2TestInput"))
                );
    }
}