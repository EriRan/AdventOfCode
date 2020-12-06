package fi.eriran.day6.calculation;

import fi.eriran.day6.pojo.GroupCustomFormEveryone;
import fi.eriran.day6.pojo.PersonAnswers;
import org.apache.commons.collections4.CollectionUtils;

import java.util.Collection;

public class CommonQuestionSumCalculator {

    public long calculate(Collection<GroupCustomFormEveryone> customForms) {
        if (CollectionUtils.isEmpty(customForms)) {
            return 0;
        }
        return customForms.stream()
                .map(groupForm -> {
                    //Pick the first person of the form
                    PersonAnswers firstAvailablePerson = groupForm.getPersonAnswers().stream()
                            .findFirst()
                            .orElse(new PersonAnswers());
                    //Everyone should have a question code for a from to be counted, so the first person should have
                    // the question code too. This means we can go through all the question codes that the first
                    // person has and check if everyone else has the same question code too
                    return firstAvailablePerson.getQuestionCodes().stream()
                            .filter(questionCode -> groupForm.getPersonAnswers().stream()
                                    .allMatch(currentPerson -> currentPerson.getQuestionCodes().contains(questionCode)))
                            .count();
                })
                .reduce(Long::sum)
                .orElseThrow(() -> new IllegalStateException("Unable to calculate the sum!"));

    }
}
