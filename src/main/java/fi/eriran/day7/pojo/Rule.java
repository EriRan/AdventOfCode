package fi.eriran.day7.pojo;

import fi.eriran.day7.pojo.bag.Bag;
import fi.eriran.day7.pojo.bag.BagCountContainer;

import java.util.ArrayList;
import java.util.Collection;

public class Rule {

    private Bag parent;
    private Collection<BagCountContainer> children;

    public Rule() {
        children = new ArrayList<>();
    }

    public Bag getParent() {
        return parent;
    }

    public void setParent(Bag parent) {
        this.parent = parent;
    }

    public Collection<BagCountContainer> getChildren() {
        return children;
    }

    public void setChildren(Collection<BagCountContainer> children) {
        this.children = children;
    }
}
