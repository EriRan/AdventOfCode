package fi.eriran.twozerotwozero.day4.processor.pojo;

import java.util.EnumMap;
import java.util.Map;

public class Passport {

    private final Map<PassportField, String> fields;

    public Passport() {
        fields = new EnumMap<>(PassportField.class);
    }

    public Map<PassportField, String> getFields() {
        return fields;
    }
}
