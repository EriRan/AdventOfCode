package fi.eriran.day11.parser.converter;

import fi.eriran.day11.pojo.Position;

public class CharacterToPositionConverter {

    public Position convert(Character character) {
        if (character == null) {
            throw new IllegalArgumentException("Empty character not allowed");
        }
        switch (character) {
            case '.':
                return Position.FLOOR;
            case 'L':
                return Position.EMPTY_SEAT;
            case '#':
                return Position.OCCUPIED_SEAT;
            default:
                throw new IllegalArgumentException("Unknown character encountered:" + character);
        }
    }
}
