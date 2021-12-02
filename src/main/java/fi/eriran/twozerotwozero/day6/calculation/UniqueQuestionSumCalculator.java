package fi.eriran.twozerotwozero.day6.calculation;

import fi.eriran.twozerotwozero.day6.pojo.GroupCustomFormAnyone;
import org.apache.commons.collections4.CollectionUtils;

import java.util.Collection;

public class UniqueQuestionSumCalculator {

    public long calculate(Collection<GroupCustomFormAnyone> customForms) {
        if (CollectionUtils.isEmpty(customForms)) {
            return 0;
        }
        return customForms.stream()
                .map(groupCustomFormAnyone -> groupCustomFormAnyone.getQuestionCodes().size())
                .reduce(0, Integer::sum);
    }
}
