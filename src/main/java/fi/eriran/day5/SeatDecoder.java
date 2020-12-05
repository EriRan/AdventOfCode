package fi.eriran.day5;

import fi.eriran.day5.pojo.SeatLocation;

import java.util.Collection;
import java.util.stream.Collectors;

public class SeatDecoder {

    public Collection<SeatLocation> decodeAll(Collection<String> lines) {
        return lines.stream()
                .map(this::decode)
                .collect(Collectors.toList());
    }

    private SeatLocation decode(String line) {
        if (line.length() != 10) {
            throw new IllegalArgumentException("Invalid line encountered: " + line);
        }
        return new SeatLocation(
                decodeRow(line.substring(0, 8)),
                decodeColumn(line.substring(8, 10))
        )
        ;

    }

    private int decodeColumn(String substring) {
        return 0;
    }

    private int decodeRow(String substring) {
        return 0;
    }
}
