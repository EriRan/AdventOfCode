package fi.eriran._2020.day4.processor.validator;

import fi.eriran._2020.day4.processor.pojo.Passport;

public interface PassportValidator {
    boolean isValid(Passport passport);
}
