package fi.eriran.twozerotwozero.day7.calculation;

import fi.eriran.twozerotwozero.day7.pojo.bag.Bag;
import fi.eriran.twozerotwozero.day7.pojo.bag.BagCountContainer;
import fi.eriran.twozerotwozero.day7.pojo.bag.Description;

import java.util.Collection;
import java.util.Map;
import java.util.stream.Stream;

/**
 * The class for part 2
 */
public class BagContentSizeCounter {

    public long count(Description targetBagDescription, Map<Description, Bag> bagMap) {
        Bag targetBag = bagMap.get(targetBagDescription);
        return countContentSize(targetBag.getContainedBags());
    }

    /**
     * Go through all the provided bags and append their sum to the result long
     */
    private long countContentSize(Collection<BagCountContainer> containedBags) {
        return containedBags.stream()
                .map(this::countSingleBagContent)
                .reduce(Long::sum)
                .orElse(0L);
    }

    /**
     * Count the amount of bags in a single {@link BagCountContainer}. This is done the amount of count of this kind
     * of bag in the container. Plus one represents the currently iterated bag.
     */
    private Long countSingleBagContent(BagCountContainer bagContainer) {
        return Stream.generate(() -> countContentSize(bagContainer.getBag().getContainedBags()) + 1)
                .limit(bagContainer.getCount())
                .reduce(Long::sum)
                .orElse(0L);
    }
}
