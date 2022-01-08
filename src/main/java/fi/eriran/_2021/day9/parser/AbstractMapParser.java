package fi.eriran._2021.day9.parser;

import java.util.List;

public abstract class AbstractMapParser {

    protected int findWidth(List<String> lines) {
        return lines.stream().findFirst().orElseThrow(() -> new IllegalArgumentException("No lines received")).length();
    }
}
