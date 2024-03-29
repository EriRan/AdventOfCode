package fi.eriran._2020.day2;

import fi.eriran._2020.day2.philosopher.PasswordPhilosopherPartTwo;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PasswordPhilosopherPartTwoTest {

    @Test
    void sameResultAsExample() throws IOException {
        assertEquals(
                1,
                new PasswordPhilosopherPartTwo().countValidPasswords("2020/day2TestInput")
        );
    }
}