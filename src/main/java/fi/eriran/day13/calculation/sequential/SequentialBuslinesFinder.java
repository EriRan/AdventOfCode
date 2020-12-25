package fi.eriran.day13.calculation.sequential;

import fi.eriran.day13.pojo.Busline;
import fi.eriran.day13.pojo.Timetable;

public class SequentialBuslinesFinder {

    public long find(Timetable timetable) {
        return findSequenceWithBruteForce(timetable);
    }

    private long findSequenceWithBruteForce(Timetable timetable) {
        long iterationCount = 1;
        Busline previousBusline = null;
        long previousTimestamp = 0;
        long timestampOfTheFirst = 0;
        boolean continueIteration;
        do {
            continueIteration = false;
            for (Busline currentBusline : timetable.getBuslines()) {
                //The current iteration is the last busline of the list
                if (previousBusline == null) {
                    previousTimestamp = currentBusline.getId() * iterationCount;
                    timestampOfTheFirst = previousTimestamp;
                    previousBusline = currentBusline;
                }
                //Other buslines of the list
                else {
                    long requiredTimestamp = calculateRequiredTimestamp(
                            currentBusline,
                            previousBusline,
                            previousTimestamp
                    );
                    if (!doesCurrentBuslineHaveSequentialArrivalTime(currentBusline, requiredTimestamp)) {
                        continueIteration = true;
                        break;
                    }
                    previousTimestamp = requiredTimestamp;
                    previousBusline = currentBusline;
                }
            }
            if (!continueIteration) {
                return timestampOfTheFirst;
            }
            iterationCount++;
            previousBusline = null;
        } while (true);
    }

    private boolean doesCurrentBuslineHaveSequentialArrivalTime(Busline currentBusline, long requiredTimestamp) {
        return requiredTimestamp % currentBusline.getId() == 0;
    }

    private long calculateRequiredTimestamp(Busline currentBusline, Busline previousBusline, long previousTimestamp) {
        return previousTimestamp + (currentBusline.getIndex() - previousBusline.getIndex());
    }
}
