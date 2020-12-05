package fi.eriran.day5.seat.pojo;

public class Seat {

    private final int row;
    private final int column;
    private final int id;

    public Seat(int row, int column, int id) {
        this.row = row;
        this.column = column;
        this.id = id;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public int getId() {
        return id;
    }
}
