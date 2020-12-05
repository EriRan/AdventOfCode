package fi.eriran.day4.processor.validator.field.eyecolor;

import fi.eriran.day4.processor.validator.field.FieldValidator;
import fi.eriran.day4.processor.validator.field.eyecolor.constant.AcceptedEyeColors;
import org.apache.commons.lang3.StringUtils;

public class EyeColorValidator implements FieldValidator {

    public boolean validate(String value) {
        if (StringUtils.isBlank(value)) {
            return false;
        }
        if (value.length() != 3) {
            return false;
        }
        return isAcceptedColor(value.toUpperCase());
    }

    private boolean isAcceptedColor(String value) {
        try {
            AcceptedEyeColors.valueOf(value);
            return true;
        } catch (IllegalArgumentException ignored) {
            return false;
        }
    }
}
