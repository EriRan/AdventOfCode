package fi.eriran.day7.parser;

import fi.eriran.day7.pojo.bag.Bag;
import fi.eriran.day7.pojo.bag.BagCountContainer;
import fi.eriran.day7.pojo.bag.Description;

import java.util.*;

public class RuleParser {

    /**
     * Go through all the lines and add all mentioned bags to the map.
     */
    public Map<Description, Bag> parse(Collection<String> lines) {
        Map<Description, Bag> response = new HashMap<>();
        for (String line : lines) {
            createAndPutOne(response, line);
        }
        return response;
    }

    private void createAndPutOne(Map<Description, Bag> response, String line) {
        String[] splitLine = line.split(" ");
        //First 3 words contain the materials to create a parent
        //Has the bag already been created in a line handled before?
        Bag currentBag = recordNewBagOrGetExisting(response, createDescription(splitLine[0], splitLine[1]));

        currentBag.setContainedBags(createChildren(response, splitLine));
    }

    private Bag recordNewBagOrGetExisting(Map<Description, Bag> response, Description newDescription) {
        Bag existingBag = response.get(newDescription);
        if (existingBag == null) {
            return createBagAndPutToMap(response, newDescription);
        }
        return existingBag;
    }

    private Bag createBagAndPutToMap(Map<Description, Bag> response, Description description) {
        Bag newBag = new Bag();
        newBag.setDescription(description);
        response.put(newBag.getDescription(), newBag);
        return newBag;
    }

    private Description createDescription(String adjective, String color) {
        return new Description(adjective, color);
    }

    private Collection<BagCountContainer> createChildren(Map<Description, Bag> response, String[] splitLine) {
        //The bag may contain no other bags in this condition, so it's children are left empty
        if ("no".equals(splitLine[4])) {
            return Collections.emptyList();
        }
        Collection<BagCountContainer> bagCountContainers = new ArrayList<>();
        //Start from the first index which the first count
        for (int i = 4; i < splitLine.length; i += 4) {
            bagCountContainers.add(createBagContainer(response, splitLine[i], splitLine[i + 1], splitLine[i + 2]));
        }
        return bagCountContainers;
    }

    private BagCountContainer createBagContainer(Map<Description, Bag> response,
                                                 String countString,
                                                 String bagAdjective,
                                                 String bagColor) {
        return new BagCountContainer(
                Integer.parseInt(countString),
                recordNewBagOrGetExisting(response, createDescription(bagAdjective, bagColor))
                );
    }
}
