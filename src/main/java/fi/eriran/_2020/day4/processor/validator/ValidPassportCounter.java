package fi.eriran._2020.day4.processor.validator;

import fi.eriran._2020.day4.processor.pojo.Passport;

import java.util.Collection;

public class ValidPassportCounter {

    private final PassportValidator passportValidator;

    public ValidPassportCounter(PassportValidator passportValidator) {
        this.passportValidator = passportValidator;
    }

    public long count(Collection<Passport> passports) {
        return passports.stream().filter(passportValidator::isValid).count();
    }
}
