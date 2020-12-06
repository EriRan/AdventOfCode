package fi.eriran.day5.seat;

import fi.eriran.common.parser.LineInputParserProxy;
import fi.eriran.day5.seat.decode.SeatDecoder;
import fi.eriran.day5.seat.pojo.Seat;

import java.io.IOException;
import java.util.Collection;

public class SeatFactory {

    public Collection<Seat> build(String resourceFolderFilename) throws IOException {
        return new SeatDecoder().decodeAll(
                new LineInputParserProxy().parse(resourceFolderFilename)
        );
    }
}
