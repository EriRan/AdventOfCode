package fi.eriran.twozerotwozero.day4.processor.validator.field;

import fi.eriran.twozerotwozero.day4.processor.pojo.PassportField;
import fi.eriran.twozerotwozero.day4.processor.validator.field.day.DayFieldValidator;
import fi.eriran.twozerotwozero.day4.processor.validator.field.day.constant.BirthYearConstant;
import fi.eriran.twozerotwozero.day4.processor.validator.field.day.constant.ExpirationYearConstant;
import fi.eriran.twozerotwozero.day4.processor.validator.field.day.constant.IssueYearConstant;
import fi.eriran.twozerotwozero.day4.processor.validator.field.eyecolor.EyeColorValidator;
import fi.eriran.twozerotwozero.day4.processor.validator.field.haircolor.HairColorValidator;
import fi.eriran.twozerotwozero.day4.processor.validator.field.height.HeightValidator;
import fi.eriran.twozerotwozero.day4.processor.validator.field.passport.PassportIdValidator;

public class PassportFieldValidationProvider {

    private final DayFieldValidator dayFieldValidator;
    private final HeightValidator heightValidator;
    private final HairColorValidator hairColorValidator;
    private final EyeColorValidator eyeColorValidator;
    private final PassportIdValidator passportIdValidator;

    public PassportFieldValidationProvider() {
        dayFieldValidator = new DayFieldValidator();
        heightValidator = new HeightValidator();
        hairColorValidator = new HairColorValidator();
        eyeColorValidator = new EyeColorValidator();
        passportIdValidator = new PassportIdValidator();
    }

    public boolean provide(PassportField field, String value) {
        switch (field) {
            case BIRTH_YEAR:
                return dayFieldValidator.validate(
                        value,
                        BirthYearConstant.MIN_ALLOWED_YEAR,
                        BirthYearConstant.MAX_ALLOWED_YEAR
                );
            case ISSUE_YEAR:
                return dayFieldValidator.validate(
                        value,
                        IssueYearConstant.MIN_ALLOWED_YEAR,
                        IssueYearConstant.MAX_ALLOWED_YEAR
                );
            case EXPIRATION_YEAR:
                return dayFieldValidator.validate(
                        value,
                        ExpirationYearConstant.MIN_ALLOWED_YEAR,
                        ExpirationYearConstant.MAX_ALLOWED_YEAR
                );
            case HEIGHT:
                return heightValidator.validate(value);
            case HAIR_COLOR:
                return hairColorValidator.validate(value);
            case EYE_COLOR:
                return eyeColorValidator.validate(value);
            case PASSPORT_ID:
                return passportIdValidator.validate(value);
            case COUNTRY_ID:
                //Nothing to see here Mr. Passport inspector
                return true;
            default:
                throw new IllegalArgumentException("Unknown field encountered: " + field);
        }
    }
}
