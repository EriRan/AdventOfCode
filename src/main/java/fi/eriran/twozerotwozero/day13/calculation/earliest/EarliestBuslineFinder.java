package fi.eriran.twozerotwozero.day13.calculation.earliest;

import fi.eriran.twozerotwozero.day13.pojo.Busline;
import fi.eriran.twozerotwozero.day13.pojo.EarliestBuslineResponse;
import fi.eriran.twozerotwozero.day13.pojo.Timetable;

import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EarliestBuslineFinder {

    public EarliestBuslineResponse find(Timetable timetable) {
        Map<Integer, Integer> timeToWaitMap = timetable.getBuslines().stream()
                .map(Busline::getId)
                .filter(Objects::nonNull)
                .collect(Collectors.toMap(
                        Function.identity(),
                        buslineId -> calculateTimeToWait(buslineId, timetable.getEarliestPossibleTimestamp())
                        )
                );
        Map.Entry<Integer, Integer> buslineWithMinTimeToWait = timeToWaitMap.entrySet().stream()
                .min(Comparator.comparingInt(Map.Entry::getValue))
                .stream()
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Unable to calculate minimum value"));
        return new EarliestBuslineResponse(buslineWithMinTimeToWait.getKey(), buslineWithMinTimeToWait.getValue());
    }

    private Integer calculateTimeToWait(Integer buslineId, int earliestPossibleTimestamp) {
        //Get the amount of time when the last bus before earliestPossibleTimestamp happens
        int lastStopTimeBeforeEarliestPossible = earliestPossibleTimestamp % buslineId;
        if (earliestPossibleTimestamp == 0) {
            //We hit the jackpot
            return lastStopTimeBeforeEarliestPossible;
        }
        //First get the full timestamp when the last bus arrives before the earliest possible timestamp, then add the
        // busId to get the time when the bus would arrive after the earliest possible time and then reduce that from
        // the earliest possible timestamp
        // So the formula would be {earliestPossibleTime - lastStopTimeBeforeEarliestPossible + buslineId -
        // earliestPossibleTime} but we can cut out the earliestPossibleTimes since they are equal.
        return buslineId - lastStopTimeBeforeEarliestPossible;
    }
}
