package fi.eriran.day9.pojo;

import java.util.List;

public class PreambleDefinition {

    private final List<Long> allNumbers;
    private final int preambleSize;

    public PreambleDefinition(List<Long> allNumbers, int preambleSize) {
        this.allNumbers = allNumbers;
        this.preambleSize = preambleSize;
    }

    public List<Long> getAllNumbers() {
        return allNumbers;
    }

    public int getPreambleSize() {
        return preambleSize;
    }
}
