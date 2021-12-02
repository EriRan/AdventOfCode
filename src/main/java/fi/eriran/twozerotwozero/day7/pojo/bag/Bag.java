package fi.eriran.twozerotwozero.day7.pojo.bag;

import java.util.ArrayList;
import java.util.Collection;

public class Bag {

    private Description description;
    private Collection<BagCountContainer> containedBags;

    public Bag() {
        containedBags = new ArrayList<>();
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public Collection<BagCountContainer> getContainedBags() {
        return containedBags;
    }

    public void setContainedBags(Collection<BagCountContainer> containedBags) {
        this.containedBags = containedBags;
    }

}
