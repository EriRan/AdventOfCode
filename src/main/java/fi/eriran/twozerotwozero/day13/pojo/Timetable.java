package fi.eriran.twozerotwozero.day13.pojo;

import java.util.ArrayList;
import java.util.List;

public class Timetable {

    private final int earliestPossibleTimestamp;
    private final List<Busline> buslines;

    public Timetable(int earliestPossibleTimestamp) {
        this.earliestPossibleTimestamp = earliestPossibleTimestamp;
        buslines = new ArrayList<>();
    }

    public int getEarliestPossibleTimestamp() {
        return earliestPossibleTimestamp;
    }

    public List<Busline> getBuslines() {
        return buslines;
    }
}
