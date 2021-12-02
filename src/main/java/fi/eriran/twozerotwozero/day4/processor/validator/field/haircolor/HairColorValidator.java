package fi.eriran.twozerotwozero.day4.processor.validator.field.haircolor;

import fi.eriran.twozerotwozero.day4.processor.validator.field.FieldValidator;
import fi.eriran.twozerotwozero.day4.processor.validator.field.haircolor.constant.HairColorConstant;
import org.apache.commons.lang3.StringUtils;

public class HairColorValidator implements FieldValidator {

    public boolean validate(String value) {
        if (StringUtils.isBlank(value)) {
            return false;
        }
        return value.matches(HairColorConstant.VALID_HAIR_COLOR_REGEX);
    }
}
