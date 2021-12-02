package fi.eriran._2021.day2;

import fi.eriran._2021.day2.parser.MovementCommand;

import java.util.List;

public interface Submarine {

    int pilot(List<MovementCommand> commands);
}
