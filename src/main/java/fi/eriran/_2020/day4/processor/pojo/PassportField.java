package fi.eriran._2020.day4.processor.pojo;

public enum PassportField {
    BIRTH_YEAR,
    ISSUE_YEAR,
    EXPIRATION_YEAR,
    HEIGHT,
    HAIR_COLOR,
    EYE_COLOR,
    PASSPORT_ID,
    //If this is missing, passport is still valid
    COUNTRY_ID
}
