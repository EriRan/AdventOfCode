package fi.eriran._2021.day8.parser.raw;

import fi.eriran._2021.day8.parser.objects.SevenSegmentEntry;

import java.util.List;
import java.util.stream.Collectors;

public class RawSevenSegmentParser {

    public List<SevenSegmentEntry> parse(List<String> lines) {
        return lines.stream().map(this::parseOneLine).collect(Collectors.toList());
    }

    private SevenSegmentEntry parseOneLine(String line) {
        String[] signalAndOutput = line.split("\\|");
        return new SevenSegmentEntry(
                parseUniqueSignals(signalAndOutput[0]),
                parseOutput(signalAndOutput[1])
        );
    }

    private String[] parseOutput(String outputString) {
        String[] uniqueSignalsSplit = outputString.trim().split(" ");
        if (uniqueSignalsSplit.length != 4) {
            throw new IllegalArgumentException("Expected 4 unique signals but found: " + uniqueSignalsSplit.length);
        }
        return uniqueSignalsSplit;
    }

    private String[] parseUniqueSignals(String uniqueSingalsString) {
        String[] uniqueSignalsSplit = uniqueSingalsString.trim().split(" ");
        if (uniqueSignalsSplit.length != 10) {
            throw new IllegalArgumentException("Expected 10 unique signals but found: " + uniqueSignalsSplit.length);
        }
        return uniqueSignalsSplit;
    }
}
