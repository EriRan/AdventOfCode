package fi.eriran.twozerotwozero.day2;

import fi.eriran.twozerotwozero.day2.philosopher.PasswordPhilosopherPartTwo;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PasswordPhilosopherPartTwoTest {

    @Test
    void sameResultAsExample() throws IOException {
        assertEquals(
                1,
                new PasswordPhilosopherPartTwo().countValidPasswords("day2TestInput")
        );
    }
}