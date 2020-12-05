package fi.eriran.day4.processor.validator;

import fi.eriran.day4.processor.pojo.Passport;

public interface PassportValidator {
    boolean isValid(Passport passport);
}
