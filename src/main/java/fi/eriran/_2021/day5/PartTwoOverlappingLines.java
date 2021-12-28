package fi.eriran._2021.day5;

import fi.eriran._2021.day5.counter.OverlappingVentLineCounter;
import fi.eriran._2021.day5.map.VentMapFactory;
import fi.eriran._2021.day5.parser.VentLineParser;

import java.util.Collection;

public class PartTwoOverlappingLines {

    public long count(Collection<String> lines) {
        return new OverlappingVentLineCounter().count(
                new VentMapFactory().create(
                        new VentLineParser().parse(lines)
                )
        );
    }

}
