package fi.eriran.day4.processor.validator;

import fi.eriran.day4.processor.pojo.Passport;
import fi.eriran.day4.processor.validator.condition.PassportCondition;

import java.util.Collection;

public class ValidPassportCounter {

    public long count(Collection<Passport> passports) {
        return passports.stream().filter(PassportCondition::isValid).count();
    }
}
