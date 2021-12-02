package fi.eriran._2020.day4.processor.parser;

import fi.eriran._2020.day4.processor.pojo.PassportFieldAndValue;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class PassportRawFieldParser {

    private final PassportRawFieldToEnumConverter fieldToEnumConverter;

    public PassportRawFieldParser() {
        fieldToEnumConverter = new PassportRawFieldToEnumConverter();
    }

    public Collection<PassportFieldAndValue> parse(String line) {
        if (StringUtils.isBlank(line)) {
            return Collections.emptyList();
        }
        Collection<PassportFieldAndValue> responseData = new ArrayList<>();
        String[] rawFieldsArray = line.split(" ");
        for (String rawField : rawFieldsArray) {
            //Empty values migth be an issue here
            String[] fieldAndValue = rawField.split(":");
            responseData.add(new PassportFieldAndValue(
                    fieldToEnumConverter.convert(fieldAndValue[0]),
                    fieldAndValue[1]
            ));
        }
        return responseData;
    }
}
