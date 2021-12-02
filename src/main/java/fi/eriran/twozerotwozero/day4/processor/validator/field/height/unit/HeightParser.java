package fi.eriran.twozerotwozero.day4.processor.validator.field.height.unit;

import fi.eriran.twozerotwozero.day4.processor.pojo.height.HeightContainer;
import fi.eriran.twozerotwozero.day4.processor.pojo.height.HeightUnit;
import org.apache.commons.lang3.CharUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class HeightParser {

    private final StringToHeightUnitConverter converter;

    public HeightParser() {
        converter = new StringToHeightUnitConverter();
    }

    public HeightContainer parse(String value) {
        char[] characterArray = value.toCharArray();
        Integer parsedHeight = parseHeightNumber(characterArray);
        if (parsedHeight == null) {
            //Parsing error
            return null;
        }
        HeightUnit heightUnit = parseHeightUnit(characterArray);
        if (heightUnit == null) {
            //Parsing error
            return null;
        }
        return new HeightContainer(parsedHeight, heightUnit);
    }

    private Integer parseHeightNumber(char[] characterArray) {
        Collection<Character> characters = new ArrayList<>();
        for (char character : characterArray) {
            if (CharUtils.isAsciiNumeric(character)) {
                characters.add(character);
            } else {
                break;
            }
        }
        if (characters.isEmpty()) {
            return null;
        }
        StringBuilder temporaryStringBuilder = new StringBuilder();
        characters.forEach(temporaryStringBuilder::append);
        return Integer.parseInt(temporaryStringBuilder.toString());
    }

    private HeightUnit parseHeightUnit(char[] value) {
        List<Character> characters = new ArrayList<>();
        for (int i = value.length - 1; i > 0; i--) {
            char targetCharacter = value[i];
            if (CharUtils.isAsciiAlpha(targetCharacter)) {
                characters.add(targetCharacter);
            } else {
                break;
            }
        }
        if (characters.size() != 2) {
            return null;
        }
        //The values in the list are in reverse so we first get the last one and then the first one
        String temporaryStringBuilder = String.valueOf(characters.get(1)) + characters.get(0);
        return converter.convert(temporaryStringBuilder);
    }
}
