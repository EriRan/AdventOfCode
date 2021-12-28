package fi.eriran._2021.day5.parser;

import fi.eriran._2021.day5.parser.objects.VentLine;

import java.util.Collection;
import java.util.stream.Collectors;

public class VentLineParser extends AbstractVentLineParser {

    public Collection<VentLine> parse(Collection<String> lines) {
        return lines.stream().map(this::parseOneLine)
                .collect(Collectors.toList());
    }
}
