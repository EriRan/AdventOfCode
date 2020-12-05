package fi.eriran.day4.validator;

import fi.eriran.day4.pojo.Passport;
import fi.eriran.day4.validator.condition.PassportCondition;

import java.util.Collection;

public class ValidPassportCounter {

    public long count(Collection<Passport> passports) {
        return passports.stream().filter(PassportCondition::isValid).count();
    }
}
