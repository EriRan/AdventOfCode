package fi.eriran._2021.day8.parser.decoded;

import fi.eriran._2021.day8.parser.objects.DecodedSevenSegmentEntry;
import fi.eriran._2021.day8.parser.objects.RawSevenSegmentEntry;
import fi.eriran._2021.day8.parser.objects.SevenSegmentDisplay;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DecodedSevenSegmentParser {

    private final DisplaySignalToIntegerConverter displaySignalToIntegerConverter;

    public DecodedSevenSegmentParser() {
        displaySignalToIntegerConverter = new DisplaySignalToIntegerConverter();
    }

    public List<DecodedSevenSegmentEntry> parse(List<RawSevenSegmentEntry> entries) {
        return entries.stream().map(this::decodeOne).collect(Collectors.toList());
    }

    private DecodedSevenSegmentEntry decodeOne(RawSevenSegmentEntry entry) {
        Map<String, Integer> decodedUniqueSignals = decodeUniqueSignals(entry.getUniqueSignals());
        return decodeOutput(entry.getOutputValues(), decodedUniqueSignals);
    }

    private DecodedSevenSegmentEntry decodeOutput(String[] outputValues, Map<String, Integer> decodedUniqueSignals) {
        StringBuilder outputStringBuilder = new StringBuilder();
        for (String outputValue : outputValues) {
            Integer decodedNumber = decodedUniqueSignals.get(sortAlphabetically(outputValue));
            if (decodedNumber == null || decodedNumber == -1) {
                throw new IllegalStateException("No decoding done for value: " + outputValue);
            }
            outputStringBuilder.append(decodedNumber);
        }
        return new DecodedSevenSegmentEntry(Integer.parseInt(outputStringBuilder.toString()));
    }

    private Map<String, Integer> decodeUniqueSignals(String[] uniqueSignals) {
        Map<String, Integer> decodedUniqueSignals = new HashMap<>();
        for (String uniqueSignal : uniqueSignals) {
            switch (uniqueSignal.length()) {
                case 2:
                    decodedUniqueSignals.put(sortAlphabetically(uniqueSignal), 1);
                    break;
                case 4:
                    decodedUniqueSignals.put(sortAlphabetically(uniqueSignal), 4);
                    break;
                case 3:
                    decodedUniqueSignals.put(sortAlphabetically(uniqueSignal), 7);
                    break;
                case 7:
                    decodedUniqueSignals.put(sortAlphabetically(uniqueSignal), 8);
                    break;
                case 5:
                case 6:
                    decodedUniqueSignals.put(sortAlphabetically(uniqueSignal), parseMoreDifficultSignal(uniqueSignal));
                    break;
                default:
                    throw new IllegalArgumentException("Unexpected unique signal length: " + uniqueSignal.length());
            }
        }
        if (decodedUniqueSignals.size() != 10) {
            throw new IllegalStateException("Expected to have 10 unique signals but ended up with: " + decodedUniqueSignals.size());
        }
        return decodedUniqueSignals;
    }

    private Integer parseMoreDifficultSignal(String uniqueSignal) {
        SevenSegmentDisplay display = new SevenSegmentDisplay();
        for (char character : uniqueSignal.toCharArray()) {
            switch (character) {
                case 'a':
                    display.setA(true);
                    break;
                case 'b':
                    display.setB(true);
                    break;
                case 'c':
                    display.setC(true);
                    break;
                case 'd':
                    display.setD(true);
                    break;
                case 'e':
                    display.setE(true);
                    break;
                case 'f':
                    display.setF(true);
                    break;
                case 'g':
                    display.setG(true);
                    break;
                default:
                    throw new IllegalArgumentException("Unexpected character encountered: " + character);
            }
        }
        return displaySignalToIntegerConverter.convert(display);
    }

    private String sortAlphabetically(String uniqueSignal) {
        char[] asCharArray = uniqueSignal.toCharArray();
        Arrays.sort(asCharArray);
        return new String(asCharArray);
    }
}
