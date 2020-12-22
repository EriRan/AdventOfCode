package fi.eriran.day12.parser.converter;

import fi.eriran.day12.pojo.Command;

public class CharacterToCommandConverter {

    public Command convert(Character character) {
        if (character == null) {
            throw new IllegalArgumentException("Null not allowed");
        }
        switch (character) {
            case 'N':
                return Command.NORTH;
            case 'S':
                return Command.SOUTH;
            case 'E':
                return Command.EAST;
            case 'W':
                return Command.WEST;
            case 'L':
                return Command.LEFT;
            case 'R':
                return Command.RIGHT;
            case 'F':
                return Command.FORWARD;
            default:
                throw new IllegalArgumentException("Unknown character encountered: " + character);
        }
    }
}
