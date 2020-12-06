package fi.eriran.day5.seat.decode;

import fi.eriran.day5.seat.decode.column.ColumnDecoder;
import fi.eriran.day5.seat.decode.row.RowDecoder;
import fi.eriran.day5.seat.pojo.Seat;

import java.util.Collection;
import java.util.stream.Collectors;

public class SeatDecoder {

    private final RowDecoder rowDecoder;
    private final ColumnDecoder columnDecoder;

    public SeatDecoder() {
        rowDecoder = new RowDecoder();
        columnDecoder = new ColumnDecoder();
    }

    public Collection<Seat> decodeAll(Collection<String> lines) {
        return lines.stream()
                .map(this::decode)
                .collect(Collectors.toList());
    }

    private Seat decode(String line) {
        if (line.length() != 10) {
            throw new IllegalArgumentException("Invalid line encountered: " + line);
        }
        int row = rowDecoder.decode(line.substring(0, 7));
        int column = columnDecoder.decode(line.substring(7, 10));
        return new Seat(
                row,
                column,
                calculateSeatId(row, column)
        );
    }

    private int calculateSeatId(int row, int column) {
        return (row * 8) + column;
    }
}
