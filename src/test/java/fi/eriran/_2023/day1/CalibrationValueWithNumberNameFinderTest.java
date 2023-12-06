package fi.eriran._2023.day1;

import org.checkerframework.checker.units.qual.C;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalibrationValueWithNumberNameFinderTest {

    private CalibrationValueWithNumberNameFinder calibrationValueWithNumberNameFinder = new CalibrationValueWithNumberNameFinder();

    @Test
    void exampleCases() {
        assertEquals(29, calibrationValueWithNumberNameFinder.find("two1nine"));
        assertEquals(83, calibrationValueWithNumberNameFinder.find("eightwothree"));
        assertEquals(13, calibrationValueWithNumberNameFinder.find("abcone2threexyz"));
        assertEquals(24, calibrationValueWithNumberNameFinder.find("xtwone3four"));
        assertEquals(42, calibrationValueWithNumberNameFinder.find("4nineeightseven2"));
        assertEquals(14, calibrationValueWithNumberNameFinder.find("zoneight234"));
        assertEquals(76, calibrationValueWithNumberNameFinder.find("7pqrstsixteen"));
    }
}