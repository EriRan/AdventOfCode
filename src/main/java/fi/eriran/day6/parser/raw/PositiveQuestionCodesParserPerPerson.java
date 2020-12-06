package fi.eriran.day6.parser.raw;

import fi.eriran.day6.pojo.PersonAnswers;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Collection;

public class PositiveQuestionCodesParserPerPerson {

    public Collection<Collection<PersonAnswers>> parse(Collection<String> lines) {
        Collection<Collection<PersonAnswers>> response = new ArrayList<>();
        Collection<PersonAnswers> currentGroupPeopleAnswers = new ArrayList<>();
        for (String line : lines) {
            if (StringUtils.isBlank(line)) {
                response.add(currentGroupPeopleAnswers);
                currentGroupPeopleAnswers = new ArrayList<>();
            } else {
                PersonAnswers currentPersonAnswers = new PersonAnswers();
                for (char character : line.toCharArray()) {
                    currentPersonAnswers.getQuestionCodes().add(character);
                }
                currentGroupPeopleAnswers.add(currentPersonAnswers);
            }
        }
        //If some not included content remained, it is added here
        if (!currentGroupPeopleAnswers.isEmpty()) {
            response.add(currentGroupPeopleAnswers);
        }
        return response;
    }
}
