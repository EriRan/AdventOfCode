package fi.eriran.day4.processor.validator.field.passport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PassportIdValidatorTest {

    private final PassportIdValidator validator;

    public PassportIdValidatorTest() {
        validator = new PassportIdValidator();
    }

    @Test
    void validId() {
        assertTrue(validator.validate("123456789"));
    }

    @Test
    void tooShort() {
        assertFalse(validator.validate("132"));
    }

    @Test
    void tooLong() {
        assertFalse(validator.validate("6519684984948979461684941654984651968465149684652168465321968465"));
    }
}