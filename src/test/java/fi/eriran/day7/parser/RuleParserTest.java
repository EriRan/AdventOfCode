package fi.eriran.day7.parser;

import fi.eriran.day7.pojo.bag.Bag;
import fi.eriran.day7.pojo.bag.BagCountContainer;
import fi.eriran.day7.pojo.bag.Description;
import fi.eriran.testcommon.util.Outboxer;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.MapUtils;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class RuleParserTest {

    @Test
    void ableToParseSingleRule() {
        Map<Description, Bag> bagMap = new RuleParser()
                .parse(Collections.singletonList("light gray bags contain 1 moody blue bag."));
        assertFalse(MapUtils.isEmpty(bagMap));
        //1 is described in detail. 2 is mentioned so the size is 2.
        assertEquals(2, bagMap.size());
        Bag bagWithContent = bagMap.get(new Description("light", "gray"));
        assertEquals("light", bagWithContent.getDescription().getAdjective());
        assertEquals("gray", bagWithContent.getDescription().getColor());
        assertFalse(CollectionUtils.isEmpty(bagWithContent.getContainedBags()));
        assertEquals(1, bagWithContent.getContainedBags().size());
        BagCountContainer firstBagContainer = Outboxer.getFirst(bagWithContent.getContainedBags());
        assertEquals(1, firstBagContainer.getCount());
        assertEquals("moody", firstBagContainer.getBag().getDescription().getAdjective());
        assertEquals("blue", firstBagContainer.getBag().getDescription().getColor());
    }

    @Test
    void ableToParseMultipleContainedBags() {
        Map<Description, Bag> bagMap = new RuleParser()
                .parse(Collections.singletonList("light gray bags contain 222 moody blue bags, 23 cool red bags, 44 " +
                        "stylish black bags"));
        assertFalse(MapUtils.isEmpty(bagMap));
        //1 is described in detail. 4 are mentioned so the size is 4.
        assertEquals(4, bagMap.size());
        Bag firstBag = bagMap.get(new Description("light", "gray"));
        assertFalse(CollectionUtils.isEmpty(firstBag.getContainedBags()));
        assertEquals(3, firstBag.getContainedBags().size());
        firstBag.getContainedBags().forEach(child -> {
            assertTrue(child.getCount() > 0);
            assertNotNull(child.getBag().getDescription().getAdjective());
            assertNotNull(child.getBag().getDescription().getColor());
        });
    }
}