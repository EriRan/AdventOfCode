package fi.eriran.day6.calculation;

import fi.eriran.day6.pojo.GroupCustomForm;

import java.util.Collection;

public class UniqueQuestionSumCountCalculator {

    public long calculate(Collection<GroupCustomForm> groupCustomForms) {
        return groupCustomForms.stream()
                .map(groupCustomForm -> groupCustomForm.getQuestionCodes().size())
                .reduce(0, Integer::sum);
    }
}
