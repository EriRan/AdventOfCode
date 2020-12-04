package fi.eriran.day2;

import fi.eriran.day2.pojo.PasswordContainer;
import fi.eriran.day2.pojo.PasswordRule;

import java.util.Collection;

public class PartTwoValidPasswordCounter implements ValidPasswordCounter {

    @Override
    public int count(Collection<PasswordContainer> containers) {
        return (int) containers.stream()
                .filter(container -> {
                    PasswordRule rule = container.getRule();
                    return onlyOneRuleApplies(container, rule);
                }).count();
    }

    private boolean onlyOneRuleApplies(PasswordContainer container, PasswordRule rule) {
        return container.getPassword().charAt(rule.getValueOne() - 1) == rule.getTargetCharacter()
                ^
                container.getPassword().charAt(rule.getValueTwo() - 1) == rule.getTargetCharacter();
    }

}
