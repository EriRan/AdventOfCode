package fi.eriran.twozerotwozero.day13.parser;

import fi.eriran.twozerotwozero.day13.parser.constant.TimetableConstant;
import fi.eriran.twozerotwozero.day13.pojo.Busline;
import fi.eriran.twozerotwozero.day13.pojo.Timetable;
import org.apache.commons.collections4.CollectionUtils;

import java.util.List;
import java.util.Optional;
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
        for (int i = 0; i < splitByComma.length; i++) {
            String busLine = splitByComma[i];
            createOneBusline(timetable, busLine, i).ifPresent(
                    busline -> timetable.getBuslines().add(busline)
            );
        }
    }

    private Optional<Busline> createOneBusline(Timetable timetable, String busLine, int index) {
        if (TimetableConstant.IGNORE_BUSLINE.equals(busLine)) {
            return Optional.empty();
        }
        int buslineId = Integer.parseInt(busLine);
        if (isBuslineAlreadyIncluded(timetable, buslineId)) {
            logger.warning(
                    () -> "Encountered a busline id that had been added already! Id was: " + buslineId);
            return Optional.empty();
        }
        return Optional.of(new Busline(buslineId, index));
    }

    private boolean isBuslineAlreadyIncluded(Timetable timetable, int buslineId) {
        return timetable.getBuslines().stream()
                .filter(busline -> busline.getId() != null)
                .anyMatch(busline -> buslineId == busline.getId());
    }

    private int findEarliestPossibleStart(String earliestPossibleTimestampString) {
        return Integer.parseInt(earliestPossibleTimestampString);
    }
}
