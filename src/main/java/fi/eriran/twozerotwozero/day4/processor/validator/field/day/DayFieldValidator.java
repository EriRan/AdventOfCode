package fi.eriran.twozerotwozero.day4.processor.validator.field.day;

public class DayFieldValidator {

    public boolean validate(String value, int minYear, int maxYear) {
        try {
            int year = Integer.parseInt(value);
            return year >= minYear && year <= maxYear;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
