package fi.eriran._2020.day2.philosopher.counter;

import fi.eriran._2020.day2.philosopher.pojo.PasswordContainer;
import fi.eriran._2020.day2.philosopher.pojo.PasswordRule;

import java.util.Collection;

public class PartOneValidPasswordCounter implements ValidPasswordCounter {

    public int count(Collection<PasswordContainer> containers) {
        int validCount = 0;
        for (PasswordContainer container : containers) {
            PasswordRule rule = container.getRule();
            long targetCharacterCount = countTargetCharacterOccurrances(container.getPassword(), rule);
            if (targetCharacterCount >= rule.getValueOne() && targetCharacterCount <= rule.getValueTwo()) {
                validCount++;
            }
        }
        return validCount;
    }

    private long countTargetCharacterOccurrances(String password, PasswordRule rule) {
        return password.chars().filter(character -> character == rule.getTargetCharacter()).count();
    }
}
