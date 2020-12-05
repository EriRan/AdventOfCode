package fi.eriran.day4.processor.parser;

import fi.eriran.day4.processor.pojo.PassportField;

public class PassportRawFieldToEnumConverter {

    public PassportField convert(String fieldString) {
        switch (fieldString) {
            case "byr":
            return PassportField.BIRTH_YEAR;
            case "iyr":
                return PassportField.ISSUE_YEAR;
            case "eyr":
                return PassportField.EXPIRATION_YEAR;
            case "hgt":
                return PassportField.HEIGHT;
            case "hcl":
                return PassportField.HAIR_COLOR;
            case "ecl":
                return PassportField.EYE_COLOR;
            case "pid":
                return PassportField.PASSPORT_ID;
            case "cid":
                return PassportField.COUNTRY_ID;
            default:
                throw new IllegalArgumentException("Unknown passport field encountered: " + fieldString);
        }
    }
}
