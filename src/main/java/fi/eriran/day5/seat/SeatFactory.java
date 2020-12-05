package fi.eriran.day5.seat;

import fi.eriran.common.parser.LineInputParser;
import fi.eriran.day5.seat.decode.SeatDecoder;
import fi.eriran.day5.seat.pojo.Seat;

import java.io.IOException;
import java.net.URL;
import java.util.Collection;

public class SeatFactory {

    public Collection<Seat> build(URL filepath) throws IOException {
        return new SeatDecoder().decodeAll(
                new LineInputParser().parse(filepath)
        );
    }
}
