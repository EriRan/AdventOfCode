package fi.eriran._2021.day9.calculation.map.basin;

import fi.eriran._2021.day9.calculation.map.basin.objects.Basin;

import java.util.ArrayList;
import java.util.List;

public class BasinFinder {

    public List<Basin> find(boolean[][] basinMapMatrix) {
        boolean[][] exploredCoordinates = new boolean[basinMapMatrix.length][basinMapMatrix[0].length];
        List<Basin> basins = new ArrayList<>();
        for (int y = 0; y < basinMapMatrix.length; y++) {
            for (int x = 0; x < basinMapMatrix[0].length; x++) {
                int basinSize = tryOneCoordinate(basinMapMatrix, exploredCoordinates, y, x);
                if (basinSize != 0) {
                    basins.add(new Basin(basinSize));
                }
            }
        }
        return basins;
    }

    private int tryOneCoordinate(boolean[][] basinMapMatrix, boolean[][] exploredCoordinates, int y, int x) {
        if (!exploredCoordinates[y][x]) {
            // If is a basin wall, mark this as explored and move on
            return startExploration(basinMapMatrix, exploredCoordinates, y, x);
        }
        return 0;
    }

    private int startExploration(boolean[][] basinMapMatrix, boolean[][] exploredCoordinates, int y, int x) {
        if (exploredCoordinates[y][x]) {
            return 0;
        }
        int exploredBasinSize = 0;
        exploredCoordinates[y][x] = true;
        if (basinMapMatrix[y][x]) {
            return exploredBasinSize;
        }
        exploredBasinSize++;
        // Explore adjacent coordinates
        // Up
        if (y != 0) {
            exploredBasinSize += startExploration(basinMapMatrix, exploredCoordinates, y - 1, x);
        }
        // Right
        if (x != basinMapMatrix[0].length - 1) {
            exploredBasinSize += startExploration(basinMapMatrix, exploredCoordinates, y, x + 1);
        }
        // Down
        if (y != basinMapMatrix.length - 1) {
            exploredBasinSize += startExploration(basinMapMatrix, exploredCoordinates, y + 1, x);
        }
        // Left
        if (x != 0) {
            exploredBasinSize += startExploration(basinMapMatrix, exploredCoordinates, y, x - 1);
        }
        return exploredBasinSize;
    }
}
