package fi.eriran._2021.day8.parser.objects;

public class RawSevenSegmentEntry {
    private final String[] uniqueSignals;
    private final String[] outputValues;

    public RawSevenSegmentEntry(String[] uniqueSignals, String[] outputValues) {
        this.uniqueSignals = uniqueSignals;
        this.outputValues = outputValues;
    }

    public String[] getUniqueSignals() {
        return uniqueSignals;
    }

    public String[] getOutputValues() {
        return outputValues;
    }
}
