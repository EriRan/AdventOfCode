package fi.eriran.day7.parser;

import fi.eriran.day7.pojo.Rule;
import fi.eriran.day7.pojo.bag.BagCountContainer;
import fi.eriran.testcommon.util.Outboxer;
import org.apache.commons.collections4.CollectionUtils;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class RuleParserTest {

    @Test
    void ableToParseSingleRule() {
        Collection<Rule> parsedRules = new RuleParser()
                .parse(Collections.singletonList("light gray bags contain 1 moody blue bag."));
        assertFalse(CollectionUtils.isEmpty(parsedRules));
        assertEquals(1, parsedRules.size());
        Rule parsedRule = Outboxer.getFirst(parsedRules);
        assertEquals("light", parsedRule.getParent().getAdjective());
        assertEquals("gray", parsedRule.getParent().getColor());
        assertFalse(CollectionUtils.isEmpty(parsedRule.getChildren()));
        assertEquals(1, parsedRule.getChildren().size());
        BagCountContainer firstBagContainer = Outboxer.getFirst(parsedRule.getChildren());
        assertEquals(1, firstBagContainer.getCount());
        assertEquals("moody", firstBagContainer.getBag().getAdjective());
        assertEquals("blue", firstBagContainer.getBag().getColor());
    }

    @Test
    void ableToParseMultipleContainedBags() {
        Collection<Rule> parsedRules = new RuleParser()
                .parse(Collections.singletonList("light gray bags contain 222 moody blue bags, 23 cool red bags, 44 " +
                        "stylish black bags"));
        assertFalse(CollectionUtils.isEmpty(parsedRules));
        assertEquals(1, parsedRules.size());
        Rule parsedRule = Outboxer.getFirst(parsedRules);
        assertFalse(CollectionUtils.isEmpty(parsedRule.getChildren()));
        assertEquals(3, parsedRule.getChildren().size());
        parsedRule.getChildren().forEach(child -> {
            assertTrue(child.getCount() > 0);
            assertNotNull(child.getBag().getAdjective());
            assertNotNull(child.getBag().getColor());
        });
    }
}