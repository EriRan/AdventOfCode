package fi.eriran.twozerotwozero.day2;

import fi.eriran.twozerotwozero.day2.philosopher.PasswordPhilosopherPartOne;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PasswordPhilosopherPartOneTest {

    @Test
    void sameResultAsExample() throws IOException {
        assertEquals(
                2,
                new PasswordPhilosopherPartOne().countValidPasswords("day2TestInput")
        );
    }
}