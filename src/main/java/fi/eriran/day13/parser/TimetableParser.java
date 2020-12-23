package fi.eriran.day13.parser;

import fi.eriran.day13.parser.constant.TimetableConstant;
import fi.eriran.day13.pojo.Timetable;
import org.apache.commons.collections4.CollectionUtils;

import java.util.List;
import java.util.logging.Logger;

public class TimetableParser {

    private final Logger logger = Logger.getGlobal();

    public Timetable parse(List<String> lines) {
        if (CollectionUtils.isEmpty(lines)) {
            return new Timetable(0);
        }
        Timetable timetable = new Timetable(findEarliestPossibleStart(lines.get(0)));
        addBuslines(timetable, lines.get(1));
        return timetable;
    }

    private void addBuslines(Timetable timetable, String buslinesRawString) {
        String[] splitByComma = buslinesRawString.split(",");
        for (String busLine : splitByComma) {
            parseOneBusline(timetable, busLine);
        }
    }

    private void parseOneBusline(Timetable timetable, String busLine) {
        if (TimetableConstant.IGNORE_BUSLINE.equals(busLine)) {
            return;
        }
        int buslineId = Integer.parseInt(busLine);
        if (timetable.getBuslineIds().contains(buslineId)) {
            logger.warning(
                    () -> "Encountered a busline id that had been added already! Id was: " + buslineId);
        } else {
            timetable.getBuslineIds().add(buslineId);
        }
    }

    private int findEarliestPossibleStart(String earliestPossibleTimestampString) {
        return Integer.parseInt(earliestPossibleTimestampString);
    }
}
