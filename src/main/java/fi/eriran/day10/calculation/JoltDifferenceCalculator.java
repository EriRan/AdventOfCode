package fi.eriran.day10.calculation;

import fi.eriran.day10.pojo.JoltDifferencesContainer;

public class JoltDifferenceCalculator {

    public int oneJoltsMultipliedWithThreeJolts(JoltDifferencesContainer differencesContainer) {
        return differencesContainer.getOneJolts() * differencesContainer.getThreeJolts();
    }
}
