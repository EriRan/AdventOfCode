package fi.eriran.day13.pojo;

import java.util.HashSet;
import java.util.Set;

public class Timetable {

    private final int earliestPossibleTimestamp;
    private final Set<Integer> buslineIds;

    public Timetable(int earliestPossibleTimestamp) {
        this.earliestPossibleTimestamp = earliestPossibleTimestamp;
        buslineIds = new HashSet<>();
    }

    public int getEarliestPossibleTimestamp() {
        return earliestPossibleTimestamp;
    }

    public Set<Integer> getBuslineIds() {
        return buslineIds;
    }
}
