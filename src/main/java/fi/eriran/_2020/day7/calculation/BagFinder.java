package fi.eriran._2020.day7.calculation;

import fi.eriran._2020.day7.pojo.bag.Bag;
import fi.eriran._2020.day7.pojo.bag.BagCountContainer;
import fi.eriran._2020.day7.pojo.bag.Description;

import java.util.Collection;
import java.util.Map;

/**
 * Find all bags from rules that can contain the target bag
 */
public class BagFinder {

    public long find(Description targetBag, Map<Description, Bag> bagMap) {
        return bagMap.values().stream()
                .filter(bag -> containsBag(bag, targetBag))
                .count();
    }

    private boolean containsBag(Bag bag, Description targetBag) {
        //The target bag's contents aren't considered
        if (bag.getDescription().equals(targetBag)) {
            return false;
        }
        //Let's through the bags possible contents until we run out of options or we find the target bag.
        return checkIfChildrenHaveTarget(bag.getContainedBags(), targetBag);
    }

    private boolean checkIfChildrenHaveTarget(Collection<BagCountContainer> containedBags, Description targetBag) {
        return containedBags.stream()
                .anyMatch(
                        containedBag -> targetBag.equals(containedBag.getBag().getDescription())
                                || checkIfChildrenHaveTarget(containedBag.getBag().getContainedBags(), targetBag)
                );
    }
}
