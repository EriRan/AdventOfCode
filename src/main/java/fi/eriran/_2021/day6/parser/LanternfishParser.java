package fi.eriran._2021.day6.parser;

import fi.eriran._2021.day6.parser.objects.Lanternfish;

import java.util.Collection;
import java.util.stream.Collectors;

public class LanternfishParser {

    public Collection<Lanternfish> parse(Collection<Integer> lines) {
        return lines.stream()
                .map(this::parseOneLine)
                .collect(Collectors.toList());
    }

    private Lanternfish parseOneLine(Integer line) {
        return new Lanternfish(line);
    }
}
