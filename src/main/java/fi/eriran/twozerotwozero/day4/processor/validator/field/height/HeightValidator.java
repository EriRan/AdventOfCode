package fi.eriran.twozerotwozero.day4.processor.validator.field.height;

import fi.eriran.twozerotwozero.day4.processor.pojo.height.HeightContainer;
import fi.eriran.twozerotwozero.day4.processor.validator.field.FieldValidator;
import fi.eriran.twozerotwozero.day4.processor.validator.field.height.constant.HeightConstant;
import fi.eriran.twozerotwozero.day4.processor.validator.field.height.unit.HeightParser;

public class HeightValidator implements FieldValidator {

    private final HeightParser parser;

    public HeightValidator() {
        parser = new HeightParser();
    }

    public boolean validate(String value) {
        HeightContainer heightContainer = parser.parse(value);
        if (heightContainer == null) {
            //Was unable to parse the container so the height can't be valid
            return false;
        }
        switch (heightContainer.getUnit()) {
            case INCH:
                return heightContainer.getHeight() >= HeightConstant.MIN_ALLOWED_INCH
                        && heightContainer.getHeight() <= HeightConstant.MAX_ALLOWED_INCH;
            case CENTIMETER:
                return heightContainer.getHeight() >= HeightConstant.MIN_ALLOWED_CENTIMETER
                        && heightContainer.getHeight() <= HeightConstant.MAX_ALLOWED_CENTIMETER;
            default:
                throw new IllegalArgumentException("Unknown unit encountered: " + heightContainer.getUnit());
        }
    }
}
