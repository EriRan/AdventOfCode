package fi.eriran.twozerotwozero.day7.pojo.bag;

public class BagCountContainer {

    private int count;
    private Bag bag;

    public BagCountContainer(int count, Bag bag) {
        this.count = count;
        this.bag = bag;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Bag getBag() {
        return bag;
    }

    public void setBag(Bag bag) {
        this.bag = bag;
    }
}
