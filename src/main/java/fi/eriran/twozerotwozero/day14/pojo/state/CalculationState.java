package fi.eriran.twozerotwozero.day14.pojo.state;

import java.util.HashMap;
import java.util.Map;

public class CalculationState {

    private String currentBitmask;
    private final Map<Integer, Long> values;

    public CalculationState() {
        currentBitmask = "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
        values = new HashMap<>();
    }

    public String getCurrentBitmask() {
        return currentBitmask;
    }

    public void setCurrentBitmask(String currentBitmask) {
        this.currentBitmask = currentBitmask;
    }

    public Map<Integer, Long> getValues() {
        return values;
    }
}
