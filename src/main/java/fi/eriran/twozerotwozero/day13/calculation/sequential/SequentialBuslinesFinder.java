package fi.eriran.twozerotwozero.day13.calculation.sequential;

import fi.eriran.twozerotwozero.day13.pojo.Busline;
import fi.eriran.twozerotwozero.day13.pojo.Timetable;

public class SequentialBuslinesFinder {

    /**
     * All the provided numbers are prime numbers so we can get the next number by incrementing it with the
     * multiplication result of all previous numbers
     */
    public long find(Timetable timetable) {
        long time = 0;
        long increment = 1L;
        for (Busline busline : timetable.getBuslines()) {
            while ((time + busline.getIndex()) % busline.getId() != 0L) {
                time += increment;
            }
            increment *= busline.getId();
        }
        return time;
    }
}
