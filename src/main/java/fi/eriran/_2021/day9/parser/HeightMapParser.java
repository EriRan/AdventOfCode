package fi.eriran._2021.day9.parser;

import java.util.List;

public class HeightMapParser {

    public int[][] parse(List<String> lines) {
        // Get height and width of the map
        int height = lines.size();
        int width = findWidth(lines);
        int[][] heightMapMatrix = new int[height][width];
        fillHeightMap(lines, heightMapMatrix);
        return heightMapMatrix;
    }

    private void fillHeightMap(List<String> lines, int[][] heightMapMatrix) {
        for (int y = 0; y < lines.size(); y++) {
            String line = lines.get(y);
            char[] lineCharArray = line.toCharArray();
            for (int x = 0; x < lineCharArray.length; x++) {
                heightMapMatrix[y][x] = Character.digit(lineCharArray[x], 10);
            }
        }
    }

    private int findWidth(List<String> lines) {
        return lines.stream().findFirst().orElseThrow(() -> new IllegalArgumentException("No lines received")).length();
    }
}
