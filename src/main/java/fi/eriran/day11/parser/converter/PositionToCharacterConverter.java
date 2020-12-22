package fi.eriran.day11.parser.converter;

import fi.eriran.day11.pojo.Position;

public class PositionToCharacterConverter {

    private PositionToCharacterConverter() {
    }

    public static Character convert(Position position) {
        if (position == null) {
            throw new IllegalArgumentException("Null not allowed");
        }
        switch (position) {
            case FLOOR:
                return '.';
            case EMPTY_SEAT:
                return 'L';
            case OCCUPIED_SEAT:
                return '#';
            default:
                throw new IllegalArgumentException("Unknown position encountered: " + position);
        }
    }
}
