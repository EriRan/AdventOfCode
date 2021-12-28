package fi.eriran._2021.day5;

import fi.eriran._2021.day5.counter.OverlappingVentLineCounter;
import fi.eriran._2021.day5.map.VentNonDiagonalMapFactory;
import fi.eriran._2021.day5.parser.NonDiagonalVentLineParser;

import java.util.Collection;

public class PartOneOverlappingNonDiagonalLines {

    public long count(Collection<String> lines) {
        return new OverlappingVentLineCounter().count(
                new VentNonDiagonalMapFactory().create(
                        new NonDiagonalVentLineParser().parse(lines)
                )
        );
    }
}
