package fi.eriran.twozerotwozero.day4.processor.validator.field.height.unit;

import fi.eriran.twozerotwozero.day4.processor.pojo.height.HeightUnit;

public class StringToHeightUnitConverter {

    public HeightUnit convert(String unitString) {
        switch (unitString) {
            case "cm":
                return HeightUnit.CENTIMETER;
            case "in":
                return HeightUnit.INCH;
            default:
                throw new IllegalArgumentException("Encountered unknown height unit: " + unitString);
        }
    }
}
