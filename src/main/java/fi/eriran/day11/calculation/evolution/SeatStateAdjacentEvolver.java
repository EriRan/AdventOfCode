package fi.eriran.day11.calculation.evolution;

import fi.eriran.day11.calculation.evolution.rule.adjacent.AdjacentRuleEngine;
import fi.eriran.day11.pojo.Position;
import fi.eriran.day11.pojo.seat.Coordinate;
import fi.eriran.day11.pojo.seat.SeatMap;

public class SeatStateAdjacentEvolver implements SeatStateEvolver {

    private final AdjacentRuleEngine adjacentRuleEngine;

    public SeatStateAdjacentEvolver() {
        adjacentRuleEngine = new AdjacentRuleEngine();
    }

    public SeatMap createEvolved(SeatMap seatMap) {
        //Run rounds until no changes are done
        boolean hasChanged;
        SeatMap previousState = new SeatMap(seatMap);
        do {
            SeatMap nextEvolution = new SeatMap(previousState.getMaxX(), previousState.getMaxY());
            hasChanged = false;
            for (int y = 0; y <= previousState.getMaxX(); y++) {
                for (int x = 0; x <= previousState.getMaxX(); x++) {
                    Position currentPosition = previousState.getCoordinate(x, y);
                    //Check if adjacent have any occupied seats. If they don't, this seat becomes occupied
                    if (adjacentRuleEngine.shouldBecomeOccupied(previousState, x, y, currentPosition)) {
                        nextEvolution.getMap().put(new Coordinate(x, y), Position.OCCUPIED_SEAT);
                        hasChanged = true;
                    }
                    //If the seat is occupied and four or more seats adjacent to it are occupied, it becomes empty
                    else if (adjacentRuleEngine.shouldBecomeEmpty(previousState, x, y, currentPosition)) {
                        nextEvolution.getMap().put(new Coordinate(x, y), Position.EMPTY_SEAT);
                        hasChanged = true;
                    }
                    //Otherwise the state remains as it is
                    else {
                        nextEvolution.getMap().put(new Coordinate(x, y), currentPosition);
                    }
                }
            }
            if (hasChanged) {
                previousState = nextEvolution;
            }
        } while (hasChanged);
        return previousState;
    }
}
