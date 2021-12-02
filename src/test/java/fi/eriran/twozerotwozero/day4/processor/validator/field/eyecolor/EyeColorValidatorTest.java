package fi.eriran.twozerotwozero.day4.processor.validator.field.eyecolor;

import fi.eriran.twozerotwozero.day4.processor.validator.field.eyecolor.constant.AcceptedEyeColors;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class EyeColorValidatorTest {

    private final EyeColorValidator validator;

    public EyeColorValidatorTest() {
        validator = new EyeColorValidator();
    }

    @Test
    void validColors() {
        for (AcceptedEyeColors value : AcceptedEyeColors.values()) {
            assertTrue(validator.validate(value.name().toLowerCase()));
            assertTrue(validator.validate(value.name()));
            assertTrue(validator.validate(value.name().toUpperCase()));
        }
    }

    @Test
    void invalidColor() {
        assertFalse(validator.validate("mez"));
    }
}