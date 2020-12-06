package fi.eriran.day6.parser.raw;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Collection;

public class PositiveQuestionCodesParserPerGroup {

    public Collection<Collection<Character>> parse(Collection<String> lines) {
        Collection<Collection<Character>> response = new ArrayList<>();
        Collection<Character> currentGroupQuestionCodes = new ArrayList<>();
        for (String line : lines) {
            if (StringUtils.isBlank(line)) {
                response.add(currentGroupQuestionCodes);
                currentGroupQuestionCodes = new ArrayList<>();
            } else {
                for (char character : line.toCharArray()) {
                    currentGroupQuestionCodes.add(character);
                }
            }
        }
        //If some not included content remained, it is added here
        if (!currentGroupQuestionCodes.isEmpty()) {
            response.add(currentGroupQuestionCodes);
        }
        return response;
    }
}
