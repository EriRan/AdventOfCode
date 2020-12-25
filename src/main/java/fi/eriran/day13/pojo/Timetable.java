package fi.eriran.day13.pojo;

import java.util.Set;
import java.util.TreeSet;

public class Timetable {

    private final int earliestPossibleTimestamp;
    private final Set<Busline> buslines;

    public Timetable(int earliestPossibleTimestamp) {
        this.earliestPossibleTimestamp = earliestPossibleTimestamp;
        buslines = new TreeSet<>();
    }

    public int getEarliestPossibleTimestamp() {
        return earliestPossibleTimestamp;
    }

    public Set<Busline> getBuslines() {
        return buslines;
    }
}
