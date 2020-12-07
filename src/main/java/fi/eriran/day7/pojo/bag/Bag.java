package fi.eriran.day7.pojo.bag;

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
}
