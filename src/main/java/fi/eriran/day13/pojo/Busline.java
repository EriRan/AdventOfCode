package fi.eriran.day13.pojo;

public class Busline {

    private final Integer id;
    private final Integer index;

    public Busline(Integer id, Integer index) {
        this.id = id;
        this.index = index;
    }

    public Integer getId() {
        return id;
    }

    public Integer getIndex() {
        return index;
    }
}
