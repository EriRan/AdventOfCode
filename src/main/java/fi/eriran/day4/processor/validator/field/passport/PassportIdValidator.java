package fi.eriran.day4.processor.validator.field.passport;

import fi.eriran.day4.processor.validator.field.FieldValidator;
import fi.eriran.day4.processor.validator.field.passport.constant.PassportIdConstant;
import org.apache.commons.lang3.StringUtils;

public class PassportIdValidator implements FieldValidator {
    @Override
    public boolean validate(String value) {
        if (StringUtils.isBlank(value)) {
            return false;
        }
        return value.matches(PassportIdConstant.VALID_REGEX);
    }
}
