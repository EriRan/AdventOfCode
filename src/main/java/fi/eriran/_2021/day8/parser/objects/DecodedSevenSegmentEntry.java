package fi.eriran._2021.day8.parser.objects;

public class DecodedSevenSegmentEntry {

    private final int outputValue;

    public DecodedSevenSegmentEntry(int outputValue) {
        this.outputValue = outputValue;
    }

    public int getOutputValue() {
        return outputValue;
    }
}
