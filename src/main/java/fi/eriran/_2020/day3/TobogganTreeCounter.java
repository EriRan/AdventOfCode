package fi.eriran._2020.day3;

import fi.eriran._2020.day3.pojo.MapLine;
import fi.eriran._2020.day3.pojo.MapObject;
import fi.eriran._2020.day3.pojo.TrajectoryDefinition;

import java.util.List;

public class TobogganTreeCounter {

    public int count(List<MapLine> mapLines, TrajectoryDefinition trajectoryDefinition) {
        int treesEncountered = 0;
        int currentXCoordinate = 0;
        for (int y = 0; y < mapLines.size(); y += trajectoryDefinition.getDown()) {
            MapLine currentLine = mapLines.get(y);
            //Assuming all lines are equal length
            //If not, some christmas magic will happen
            int currentDifferenceToLineLength = currentXCoordinate - currentLine.getContent().size();
            //The map loops horizontally, so when currentX is more than the the amount of objects in a line, we will
            // hop back to the left with the difference to line length
            //- Equal to the size of line length == Just passed the last coordinate of the line. Start from x
            // coordinate zero
            //- More than the size of line length == start from the index of the difference to line length
            if (currentDifferenceToLineLength >= 0) {
                currentXCoordinate = currentDifferenceToLineLength;
            }
            if (currentObjectIsTree(currentXCoordinate, currentLine)) {
                treesEncountered++;
            }
            currentXCoordinate += trajectoryDefinition.getRight();
        }
        return treesEncountered;
    }

    private boolean currentObjectIsTree(int currentXCoordinate, MapLine currentLine) {
        return currentLine.getContent().get(currentXCoordinate) == MapObject.TREE;
    }
}
