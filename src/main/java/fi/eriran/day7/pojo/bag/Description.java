package fi.eriran.day7.pojo.bag;

import java.util.Objects;

public class Description {

    private String adjective;
    private String color;

    public Description(String adjective, String color) {
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
        Description that = (Description) o;
        return Objects.equals(adjective, that.adjective) && Objects.equals(color, that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adjective, color);
    }
}
