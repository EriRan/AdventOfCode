package fi.eriran.day4.processor.validator;

import fi.eriran.day4.processor.pojo.Passport;
import fi.eriran.day4.processor.validator.condition.PassportCondition;

public class PartOnePassportValidator implements PassportValidator {

    @Override
    public boolean isValid(Passport passport) {
        return PassportCondition.hasAllRequiredFields(passport);
    }
}
