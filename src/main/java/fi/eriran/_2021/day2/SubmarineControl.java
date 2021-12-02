package fi.eriran._2021.day2;

import fi.eriran._2021.day2.parser.MovementCommand;
import org.apache.commons.collections4.CollectionUtils;

import java.util.List;

public class SubmarineControl {

    public int pilot(List<MovementCommand> commands) {
        if (CollectionUtils.isEmpty(commands)) {
            return 0;
        }
        int horizontalPosition = 0;
        int depth = 0;
        for (MovementCommand command : commands) {
            switch (command.getDirection()) {
                case FORWARD:
                    horizontalPosition += command.getDistance();
                    break;
                case UP:
                    depth -= command.getDistance();
                    break;
                case DOWN:
                    depth += command.getDistance();
                    break;
                default:
                    throw new IllegalArgumentException("Unknown direction encountered: " + command.getDirection());
            }
        }
        return depth * horizontalPosition;
    }
}
