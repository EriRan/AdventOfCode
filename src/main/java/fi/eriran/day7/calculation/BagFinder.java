package fi.eriran.day7.calculation;

import fi.eriran.day7.pojo.Rule;
import fi.eriran.day7.pojo.bag.Bag;

import java.util.Collection;

/**
 * Find all bags from rules that can contain the target bag
 */
public class BagFinder {

    public long find(Bag targetBag, Collection<Rule> rules) {
        return rules.stream()
                .filter(rule -> containsBag(rule, targetBag))
                .count();
    }

    private boolean containsBag(Rule rule, Bag targetBag) {
        //The target bag's contents aren't considered
        if (rule.getParent().equals(targetBag)) {
            return false;
        }
        return rule.getChildren().stream().anyMatch(childBag -> childBag.getBag().equals(targetBag));
    }
}
