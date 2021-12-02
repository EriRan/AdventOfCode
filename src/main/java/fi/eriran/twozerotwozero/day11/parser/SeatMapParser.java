package fi.eriran.twozerotwozero.day11.parser;

import fi.eriran.twozerotwozero.day11.parser.converter.CharacterToPositionConverter;
import fi.eriran.twozerotwozero.day11.pojo.Position;
import fi.eriran.twozerotwozero.day11.pojo.seat.Coordinate;
import fi.eriran.twozerotwozero.day11.pojo.seat.SeatMap;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

public class SeatMapParser {

    private final CharacterToPositionConverter converter;

    public SeatMapParser() {
        converter = new CharacterToPositionConverter();
    }

    public SeatMap parse(List<String> input) {
        if (CollectionUtils.isEmpty(input)) {
            new SeatMap(0,0);
        }
        SeatMap seatMap = new SeatMap(findMaxX(input), input.size() - 1);
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

    /**
     * Assumption is that all the lines have the same length
     */
    private int findMaxX(List<String> input) {
        String firstLine = input.get(0);
        return firstLine.length() - 1;
    }
}
