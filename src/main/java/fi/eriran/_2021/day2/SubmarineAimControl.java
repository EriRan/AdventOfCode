package fi.eriran._2021.day2;

import fi.eriran._2021.day2.parser.MovementCommand;
import org.apache.commons.collections4.CollectionUtils;

import java.util.List;

public class SubmarineAimControl implements Submarine {
    @Override
    public int pilot(List<MovementCommand> commands) {
        if (CollectionUtils.isEmpty(commands)) {
            return 0;
        }
        int horizontalPosition = 0;
        int depth = 0;
        int aim = 0;
        for (MovementCommand command : commands) {
            switch (command.getDirection()) {
                case FORWARD:
                    horizontalPosition += command.getValue();
                    depth += aim * command.getValue();
                    break;
                case UP:
                    aim -= command.getValue();
                    break;
                case DOWN:
                    aim += command.getValue();
                    break;
                default:
                    throw new IllegalArgumentException("Unknown direction encountered: " + command.getDirection());
            }
        }
        return depth * horizontalPosition;
    }
}
