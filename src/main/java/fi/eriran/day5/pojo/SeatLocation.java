package fi.eriran.day5.pojo;

public class SeatLocation {

    private final int row;
    private final int column;

    public SeatLocation(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }
}
