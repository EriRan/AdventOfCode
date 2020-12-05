package fi.eriran.day4.processor.pojo;

public class PassportFieldAndValue {

    private final PassportField fieldName;
    private final String value;

    public PassportFieldAndValue(PassportField fieldName, String value) {
        this.fieldName = fieldName;
        this.value = value;
    }

    public PassportField getFieldName() {
        return fieldName;
    }

    public String getValue() {
        return value;
    }
}
