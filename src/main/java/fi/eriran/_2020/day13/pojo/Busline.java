package fi.eriran._2020.day13.pojo;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Busline implements Comparable<Busline> {

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

    @Override
    public int compareTo(Busline o) {
        return this.index.compareTo(o.getIndex());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Busline busline = (Busline) o;

        return new EqualsBuilder().append(index, busline.index).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(index).toHashCode();
    }
}
