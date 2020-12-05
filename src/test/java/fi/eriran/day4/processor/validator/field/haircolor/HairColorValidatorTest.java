package fi.eriran.day4.processor.validator.field.haircolor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HairColorValidatorTest {

    private final HairColorValidator validator;

    public HairColorValidatorTest() {
        validator = new HairColorValidator();
    }

    @Test
    void validNumericHairColor() {
        assertTrue(validator.validate("#123456"));
    }

    @Test
    void tooFewNumbers() {
        assertFalse(validator.validate("#01234"));
    }

    @Test
    void tooManyNumbers() {
        assertFalse(validator.validate("#01234568546161651"));
    }

    @Test
    void validAlphabetic() {
        assertTrue(validator.validate("#abcdef"));
    }

    @Test
    void tooFewLetters() {
        assertFalse(validator.validate("#e"));
    }

    @Test
    void tooManyLetters() {
        assertFalse(validator.validate("#sdoihjsdfiopgjsfpoigdjiopgsjgiopdfgj"));
    }

    @Test
    void strangeCharacters() {
        assertFalse(validator.validate("#( ͡° ͜ʖ ͡°)( ͡° ͜ʖ ͡°)( ͡° ͜ʖ ͡°)( ͡° ͜ʖ ͡°)"));
    }

    @Test
    void justWhitespace() {
        assertFalse(validator.validate("#      "));
    }
}