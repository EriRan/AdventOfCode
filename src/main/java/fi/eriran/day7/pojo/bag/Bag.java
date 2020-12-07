package fi.eriran.day7.pojo.bag;

import java.util.Objects;

public class Bag {

    private String adjective;
    private String color;

    public Bag(String adjective, String color) {
        this.adjective = adjective;
        this.color = color;
    }

    public String getAdjective() {
        return adjective;
    }

    public void setAdjective(String adjective) {
        this.adjective = adjective;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bag bag = (Bag) o;
        return Objects.equals(adjective, bag.adjective) && Objects.equals(color, bag.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adjective, color);
    }
}
