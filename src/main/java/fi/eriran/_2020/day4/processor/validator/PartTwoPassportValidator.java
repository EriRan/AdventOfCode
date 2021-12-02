package fi.eriran._2020.day4.processor.validator;

import fi.eriran._2020.day4.processor.pojo.Passport;
import fi.eriran._2020.day4.processor.validator.condition.PassportCondition;
import fi.eriran._2020.day4.processor.validator.field.PassportFieldValidationProvider;

public class PartTwoPassportValidator implements PassportValidator {

    private final PassportFieldValidationProvider validationProvider;

    public PartTwoPassportValidator() {
        validationProvider = new PassportFieldValidationProvider();
    }

    public boolean isValid(Passport passport) {
        return PassportCondition.hasAllRequiredFields(passport)
                && passport.getFields().entrySet().stream()
                .allMatch(entry -> validationProvider.provide(entry.getKey(), entry.getValue()));
    }
}
