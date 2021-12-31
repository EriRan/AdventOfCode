package fi.eriran._2021.day6.parser;

import fi.eriran._2021.day6.parser.objects.Lanterfish;

import java.util.Collection;
import java.util.stream.Collectors;

public class LanterfishParser {

    public Collection<Lanterfish> parse(Collection<Integer> lines) {
        return lines.stream()
                .map(this::parseOneLine)
                .collect(Collectors.toList());
    }

    private Lanterfish parseOneLine(Integer line) {
        return new Lanterfish(line);
    }
}
