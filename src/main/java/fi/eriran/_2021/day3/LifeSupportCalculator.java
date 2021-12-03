package fi.eriran._2021.day3;

import fi.eriran._2021.day3.enums.EqualScenarioPreference;
import fi.eriran._2021.day3.enums.DegreePreference;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LifeSupportCalculator extends DiagnosticCalculator {

    @Override
    public int calculate(List<String> lines) {
        return calculateOxygen(lines) * calculateCO2(lines);
    }

    private int calculateOxygen(List<String> lines) {
        List<String> remainingOptions = new ArrayList<>(lines);
        int currentIndex = 0;

        do {
            char mostCommonBit = findBit(remainingOptions, currentIndex, EqualScenarioPreference.ONE, DegreePreference.MOST);
            int finalCurrentIndex = currentIndex;
            remainingOptions = remainingOptions.stream()
                    .filter(line -> line.charAt(finalCurrentIndex) == mostCommonBit)
                    .collect(Collectors.toList());
            currentIndex++;
        } while (remainingOptions.size() > 1);
        return Integer.parseInt(remainingOptions.get(0), 2);
    }

    private int calculateCO2(List<String> lines) {
        List<String> remainingOptions = new ArrayList<>(lines);
        int currentIndex = 0;

        do {
            char leastCommonBit = findBit(remainingOptions, currentIndex, EqualScenarioPreference.ZERO, DegreePreference.LEAST);
            int finalCurrentIndex = currentIndex;
            remainingOptions = remainingOptions.stream()
                    .filter(line -> line.charAt(finalCurrentIndex) == leastCommonBit)
                    .collect(Collectors.toList());
            currentIndex++;
        } while (remainingOptions.size() > 1);
        return Integer.parseInt(remainingOptions.get(0), 2);
    }
}
