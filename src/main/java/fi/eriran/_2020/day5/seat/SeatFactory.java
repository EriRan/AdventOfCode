package fi.eriran._2020.day5.seat;

import fi.eriran.common.parser.multiline.LineInputParserProxy;
import fi.eriran._2020.day5.seat.decode.SeatDecoder;
import fi.eriran._2020.day5.seat.pojo.Seat;

import java.util.Collection;

public class SeatFactory {

    public Collection<Seat> build(String resourceFolderFilename) {
        return new SeatDecoder().decodeAll(
                new LineInputParserProxy().parse(resourceFolderFilename)
        );
    }
}
