package fi.eriran.day11.util;

import fi.eriran.day11.parser.converter.PositionToCharacterConverter;
import fi.eriran.day11.pojo.seat.SeatMap;

public class SeatMapStringifier {

    public String print(SeatMap seatMap) {
        StringBuilder stringMapBuilder = new StringBuilder();
        for (int y = 0; y <= seatMap.getMaxY(); y++) {
            for (int x = 0; x <= seatMap.getMaxX(); x++) {
                stringMapBuilder.append(PositionToCharacterConverter.convert(seatMap.getCoordinate(x,y)));
            }
            stringMapBuilder.append("\n");
        }
        return stringMapBuilder.toString();
    }
}
