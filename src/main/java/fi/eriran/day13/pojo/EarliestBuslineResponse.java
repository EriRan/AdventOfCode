package fi.eriran.day13.pojo;

public class EarliestBuslineResponse {

    private final int buslineId;
    private final int minutesWaited;

    public EarliestBuslineResponse(int buslineId, int minutesWaited) {
        this.buslineId = buslineId;
        this.minutesWaited = minutesWaited;
    }

    public int getBuslineId() {
        return buslineId;
    }

    public int getMinutesWaited() {
        return minutesWaited;
    }
}
