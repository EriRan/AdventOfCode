package fi.eriran._2021.day8.parser.decoded;

import fi.eriran._2021.day8.parser.decoded.groups.DecodedSevenSegmentGroupFiveParser;
import fi.eriran._2021.day8.parser.decoded.groups.DecodedSevenSegmentGroupSixParser;
import fi.eriran._2021.day8.parser.decoded.util.AlphabeticalSorter;
import fi.eriran._2021.day8.parser.objects.DecodedSevenSegmentEntry;
import fi.eriran._2021.day8.parser.objects.RawSevenSegmentEntry;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DecodedSevenSegmentParser {

    private final DecodedSevenSegmentGroupFiveParser groupFiveParser;
    private final DecodedSevenSegmentGroupSixParser groupSixParser;
    private final OutputDecoder outputDecoder;

    public DecodedSevenSegmentParser() {
        groupFiveParser = new DecodedSevenSegmentGroupFiveParser();
        groupSixParser = new DecodedSevenSegmentGroupSixParser();
        outputDecoder = new OutputDecoder();
    }

    public List<DecodedSevenSegmentEntry> parse(List<RawSevenSegmentEntry> entries) {
        return entries.stream().map(this::decodeOne).collect(Collectors.toList());
    }

    private DecodedSevenSegmentEntry decodeOne(RawSevenSegmentEntry entry) {
        return outputDecoder.decode(
                entry.getOutputValues(),
                decodeUniqueSignals(entry.getUniqueSignals())
        );
    }

    private Map<String, Integer> decodeUniqueSignals(String[] uniqueSignals) {
        Map<String, Integer> decodedUniqueSignals = new HashMap<>();
        int fiveGroupCounter = 0;
        String[] fiveGroup = new String[3];
        int sixGroupCounter = 0;
        String[] sixGroup = new String[3];

        // decode easy lengths first then collect length groups 5 and 6 for next decoding step
        for (String uniqueSignal : uniqueSignals) {
            switch (uniqueSignal.length()) {
                case 2:
                    decodedUniqueSignals.put(AlphabeticalSorter.sortAlphabetically(uniqueSignal), 1);
                    break;
                case 4:
                    decodedUniqueSignals.put(AlphabeticalSorter.sortAlphabetically(uniqueSignal), 4);
                    break;
                case 3:
                    decodedUniqueSignals.put(AlphabeticalSorter.sortAlphabetically(uniqueSignal), 7);
                    break;
                case 7:
                    decodedUniqueSignals.put(AlphabeticalSorter.sortAlphabetically(uniqueSignal), 8);
                    break;
                case 5:
                    fiveGroup[fiveGroupCounter] = AlphabeticalSorter.sortAlphabetically(uniqueSignal);
                    fiveGroupCounter++;
                    break;
                case 6:
                    sixGroup[sixGroupCounter] = AlphabeticalSorter.sortAlphabetically(uniqueSignal);
                    sixGroupCounter++;
                    break;
                default:
                    throw new IllegalArgumentException("Unexpected unique signal length: " + uniqueSignal.length());
            }
        }

        if (decodedUniqueSignals.size() != 4) {
            throw new IllegalStateException("Expected to have 4 unique signals at this point but ended up with: " + decodedUniqueSignals.size());
        }

        groupFiveParser.process(fiveGroup, decodedUniqueSignals);
        groupSixParser.process(sixGroup, decodedUniqueSignals);

        if (decodedUniqueSignals.size() != 10) {
            throw new IllegalStateException("Expected to have 10 unique signals but ended up with: " + decodedUniqueSignals.size());
        }
        return decodedUniqueSignals;
    }
}
