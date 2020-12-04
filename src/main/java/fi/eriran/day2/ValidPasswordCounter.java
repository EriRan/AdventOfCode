package fi.eriran.day2;

import fi.eriran.day2.pojo.PasswordContainer;
import fi.eriran.day2.pojo.PasswordRule;

import java.util.Collection;

class ValidPasswordCounter {

    public int count(Collection<PasswordContainer> containers) {
        int validCount = 0;
        for (PasswordContainer container : containers) {
            PasswordRule rule = container.getRule();
            long targetCharacterCount = countTargetCharacterOccurrances(container.getPassword(), rule);
            if (targetCharacterCount >= rule.getMin() && targetCharacterCount <= rule.getMax()) {
                validCount++;
            }
        }
        return validCount;
    }

    private long countTargetCharacterOccurrances(String password, PasswordRule rule) {
        return password.chars().filter(character -> character == rule.getTargetCharacter()).count();
    }
}
