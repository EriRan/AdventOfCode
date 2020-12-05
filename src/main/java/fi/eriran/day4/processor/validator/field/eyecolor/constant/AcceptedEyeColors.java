package fi.eriran.day4.processor.validator.field.eyecolor.constant;

public enum AcceptedEyeColors {
    AMB("Amber"),
    BLU("Blue"),
    BRN("Brown"),
    GRY("Gray"),
    GRN("Green"),
    HZL("Hazel"),
    OTH("Other");

    private final String value;

    AcceptedEyeColors(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
