package fi.eriran._2021.day6.parser;

import fi.eriran._2021.day6.parser.objects.Lanterfish;
import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class LanterfishParser {

    private static final Logger logger = Logger.getGlobal();

    public Collection<Lanterfish> parse(Collection<String> lines) {
        if (CollectionUtils.isEmpty(lines) || lines.size() > 1) {
            logger.log(Level.SEVERE, "Unexpected parser input. Expecting Only one line");
            return Collections.emptyList();
        }
        return lines.stream()
                .map(this::parseOneLine)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }

    private Collection<Lanterfish> parseOneLine(String line) {
        Collection<Lanterfish> parsedLanterfish = new ArrayList<>();
        for (String initialTimeToBreed : line.split(",")) {
            parsedLanterfish.add(new Lanterfish(Integer.parseInt(initialTimeToBreed)));
        }
        return parsedLanterfish;
    }
}
