package fi.eriran.day7.calculation;

import fi.eriran.day7.pojo.bag.Bag;
import fi.eriran.day7.pojo.bag.BagCountContainer;
import fi.eriran.day7.pojo.bag.Description;

import java.util.Collection;
import java.util.Map;

/**
 * The class for part 2
 */
public class BagContentSizeCounter {

    public long count(Description targetBagDescription, Map<Description, Bag> bagMap) {
        Bag targetBag = bagMap.get(targetBagDescription);
        return countContentSize(targetBag.getContainedBags());
    }

    private long countContentSize(Collection<BagCountContainer> containedBags) {
        return containedBags.stream()
                .map(bagContainer -> {
                    long contentCount = bagContainer.getCount();
                    return contentCount + countContentSize(bagContainer.getBag().getContainedBags());
                })
                .reduce(Long::sum)
                .orElse(0L);
    }
}
