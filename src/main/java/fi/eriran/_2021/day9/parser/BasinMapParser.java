package fi.eriran._2021.day9.parser;

import java.util.List;

public class BasinMapParser extends AbstractMapParser {

    public boolean[][] parse(List<String> lines) {
        // Get height and width of the map
        int height = lines.size();
        int width = findWidth(lines);
        boolean[][] basinMap = new boolean[height][width];
        fillBasinMap(lines, basinMap);
        return basinMap;
    }

    private void fillBasinMap(List<String> lines, boolean[][] basinMap) {
        for (int y = 0; y < lines.size(); y++) {
            String line = lines.get(y);
            char[] lineCharArray = line.toCharArray();
            for (int x = 0; x < lineCharArray.length; x++) {
                basinMap[y][x] = lineCharArray[x] == '9';
            }
        }
    }
}
