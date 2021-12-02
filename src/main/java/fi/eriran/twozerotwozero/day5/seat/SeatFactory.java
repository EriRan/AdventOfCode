package fi.eriran.twozerotwozero.day5.seat;

import fi.eriran.common.parser.LineInputParserProxy;
import fi.eriran.twozerotwozero.day5.seat.decode.SeatDecoder;
import fi.eriran.twozerotwozero.day5.seat.pojo.Seat;

import java.util.Collection;

public class SeatFactory {

    public Collection<Seat> build(String resourceFolderFilename) {
        return new SeatDecoder().decodeAll(
                new LineInputParserProxy().parse(resourceFolderFilename)
        );
    }
}
