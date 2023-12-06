package fi.eriran._2023.day1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalibrationValueFinderTest {

    private CalibrationValueFinder calibrationValueFinder = new CalibrationValueFinder();

    @Test
    void exampleCases() {
        assertEquals(12, calibrationValueFinder.find("1abc2"));
        assertEquals(38, calibrationValueFinder.find("pqr3stu8vwx"));
        assertEquals(15, calibrationValueFinder.find("a1b2c3d4e5f"));
        assertEquals(77, calibrationValueFinder.find("treb7uchet"));
    }
}