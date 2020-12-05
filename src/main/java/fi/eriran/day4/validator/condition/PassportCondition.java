package fi.eriran.day4.validator.condition;

import fi.eriran.day4.pojo.Passport;
import fi.eriran.day4.pojo.PassportField;

import java.util.Map;

public class PassportCondition {

    private PassportCondition() {
    }

    public static boolean isValid(Passport passport) {
        Map<PassportField, String> fields = passport.getFields();
        return fields.containsKey(PassportField.BIRTH_YEAR)
                && fields.containsKey(PassportField.ISSUE_YEAR)
                && fields.containsKey(PassportField.EXPIRATION_YEAR)
                && fields.containsKey(PassportField.HEIGHT)
                && fields.containsKey(PassportField.HAIR_COLOR)
                && fields.containsKey(PassportField.EYE_COLOR)
                && fields.containsKey(PassportField.PASSPORT_ID);
        //No country id because it isn't needed. Just trust me bro
    }
}
