package fi.eriran.day3.parser;

import fi.eriran.day3.parser.constant.RawMapCharacters;
import fi.eriran.day3.pojo.MapLine;
import fi.eriran.day3.pojo.MapObject;

import java.util.List;
import java.util.stream.Collectors;

public class MapGenerator {

    public List<MapLine> generate(List<String> lines) {
        return lines.stream().map(stringLine -> {
            MapLine newMapLine = new MapLine();
            newMapLine.setContent(
                    stringLine.chars()
                            .mapToObj(character -> {
                                switch (character) {
                                    case RawMapCharacters.EMPTY:
                                        return MapObject.EMPTY;
                                    case RawMapCharacters.TREE:
                                        return MapObject.TREE;
                                    default:
                                        throw new IllegalArgumentException("Unknown character encountered: " + character);
                                }
                            })
                            .collect(Collectors.toList())
            );
            return newMapLine;
        }).collect(Collectors.toList());
    }
}
