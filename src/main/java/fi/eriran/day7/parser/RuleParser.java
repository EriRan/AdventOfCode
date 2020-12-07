package fi.eriran.day7.parser;

import fi.eriran.day7.pojo.Rule;
import fi.eriran.day7.pojo.bag.Bag;
import fi.eriran.day7.pojo.bag.BagCountContainer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class RuleParser {

    public Collection<Rule> parse(Collection<String> lines) {
        Collection<Rule> response = new ArrayList<>();
        for (String line : lines) {
            response.add(parseOne(line));
        }
        return response;
    }

    private Rule parseOne(String line) {
        String[] splitLine = line.split(" ");
        //First 3 words contain the materials to create a parent
        Rule newRule = new Rule();
        newRule.setParent(createBag(splitLine[0], splitLine[1]));
        newRule.setChildren(createChildren(splitLine));
        return newRule;
    }

    private Bag createBag(String adjective, String color) {
        return new Bag(adjective, color);
    }

    private Collection<BagCountContainer> createChildren(String[] splitLine) {
        //The bag may contain no other bags in this condition, so it's children are left empty
        if ("no".equals(splitLine[4])) {
            return Collections.emptyList();
        }
        Collection<BagCountContainer> bagCountContainers = new ArrayList<>();
        //Start from the first index which the first count
        for (int i = 4; i < splitLine.length; i += 4) {
            bagCountContainers.add(createBagContainer(splitLine[i], splitLine[i + 1], splitLine[i + 2]));
        }
        return bagCountContainers;
    }

    private BagCountContainer createBagContainer(String countString, String bagAdjective, String bagColor) {
        return new BagCountContainer(
                Integer.parseInt(countString),
                createBag(bagAdjective, bagColor)
                );
    }
}
