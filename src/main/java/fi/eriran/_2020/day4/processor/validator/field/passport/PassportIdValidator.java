package fi.eriran._2020.day4.processor.validator.field.passport;

import fi.eriran._2020.day4.processor.validator.field.FieldValidator;
import fi.eriran._2020.day4.processor.validator.field.passport.constant.PassportIdConstant;
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
