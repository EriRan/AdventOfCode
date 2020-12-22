package fi.eriran.day11.parser;

import fi.eriran.day11.parser.converter.CharacterToPositionConverter;
import fi.eriran.day11.pojo.Position;
import fi.eriran.day11.pojo.seat.Coordinate;
import fi.eriran.day11.pojo.seat.SeatMap;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

public class SeatMapParser {

    private final CharacterToPositionConverter converter;

    public SeatMapParser() {
        converter = new CharacterToPositionConverter();
    }

    public SeatMap parse(List<String> input) {
        SeatMap seatMap = new SeatMap();
        for (int y = 0; y < input.size(); y++) {
            String oneLine = input.get(y);
            if (StringUtils.isBlank(oneLine)) {
                continue;
            }
            char[] oneLineChars = oneLine.toCharArray();
            for (int x = 0; x < oneLine.length(); x++) {
                Position currentPosition = converter.convert(oneLineChars[x]);
                seatMap.getMap().put(new Coordinate(x,y), currentPosition);
            }
        }
        return seatMap;
    }
}
