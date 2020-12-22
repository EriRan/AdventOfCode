package fi.eriran.day12.pojo;

public class FlightPathResponse {

    private final int east;
    private final int north;

    public FlightPathResponse(int east, int north) {
        this.east = east;
        this.north = north;
    }

    public int getEast() {
        return east;
    }

    public int getNorth() {
        return north;
    }
}
