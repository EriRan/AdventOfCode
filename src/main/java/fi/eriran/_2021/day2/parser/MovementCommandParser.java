package fi.eriran._2021.day2.parser;

import java.util.ArrayList;
import java.util.List;

public class MovementCommandParser {

    public List<MovementCommand> parse(List<String> lines) {
        List<MovementCommand> commands = new ArrayList<>();
        lines.forEach(line -> {
            String[] splitLine = line.split(" ");
            commands.add(new MovementCommand(parseDirection(splitLine[0]), Integer.parseInt(splitLine[1])));
        });
        return commands;
    }

    private MovementDirection parseDirection(String stringDirection) {
        switch (stringDirection) {
            case "forward":
                return MovementDirection.FORWARD;
            case "down":
                return MovementDirection.DOWN;
            case "up":
                return MovementDirection.UP;
            default:
                throw new IllegalArgumentException("Unknown direction encountered: " + stringDirection);
        }
    }
}
