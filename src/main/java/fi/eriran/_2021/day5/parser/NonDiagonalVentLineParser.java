package fi.eriran._2021.day5.parser;

import fi.eriran._2021.day5.parser.objects.VentLine;

import java.util.Collection;
import java.util.stream.Collectors;

public class NonDiagonalVentLineParser extends AbstractVentLineParser {

    public Collection<VentLine> parse(Collection<String> lines) {
        return lines.stream().map(this::parseOneLine)
                .filter(this::isLineDiagonal)
                .collect(Collectors.toList());
    }

    private boolean isLineDiagonal(VentLine parsedLine) {
        return parsedLine.getX1() == parsedLine.getX2()
                || parsedLine.getY1() == parsedLine.getY2();
    }
}
